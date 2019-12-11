package Service.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Command.User.UserFormCommand;
import Encrypt.Encrypt;
import Model.UserDTO.UserDTO;
import Repository.User.UserInsertRepository;
import Repository.User.UserSelectRepository;

@Service
public class UserFormService {
	@Autowired
	UserSelectRepository userSelectRepository;// select 레포지토리
	@Autowired
	UserInsertRepository userInsertRepository;// insert 레포지토리
	@Autowired
	private JavaMailSender mailSender;

	private static final String id = "[a-z0-9]{6,16}"; // 아이디작성 패턴
	private Pattern pattern;

	public Integer insert(UserFormCommand userFormCommand) { // 회원 등록 메소드
		// DTO에 담기
		UserDTO dto = new UserDTO();
		dto.setUserId(userFormCommand.getUserId()); // 아아디
		String userPw = Encrypt.getEncryption(userFormCommand.getUserPw());// 비밀번호 암호화
		dto.setUserPw(userPw);// 비밀번호
		dto.setUserAddr(userFormCommand.getUserAddr());// 회원 주소
		dto.setUserPh(userFormCommand.getUserPh());// 회원 전화번호
		dto.setUserName(userFormCommand.getUserName());// 회원 이름
		dto.setUserEmail(userFormCommand.getUserEmail()); // 회원 이메일주소
		dto.setUserBirth(userFormCommand.getUserBirth()); // 회원 생년월일
		dto.setUserGender(userFormCommand.getUserGender()); // 회원 성별

		return userInsertRepository.userInsert(dto);
	}

	public String idConfirm(String userId) { // 아이디 중복확인 메소드
		Integer confirm = userSelectRepository.idConfirm(userId);
		pattern = Pattern.compile(id);
		Matcher matcher = pattern.matcher(userId);
		System.out.println(matcher);
		if (!matcher.matches()) {
			return "User/confrimId3"; // 패턴이 맞지 않음
		}
		if (confirm > 0) {
			return "User/confrimId1";// 아이디 존재
		} else {
			return "User/confrimId2"; // 사용가능
		}
	}

	@Transactional
	public void infoEmail(UserFormCommand userFormCommand) {//안내 메일 보내기
		String subject = "Kortory를 선택해주셔서 감사합니다.";
		String content = "<body><h2>Kortory를 선택해주셔서 감사합니다.</h2>"
				+ "<p>저희 Kortory에서 정확한 파트너쉽을 위해서 일주일 이내에 담당자가 방문할 예정입니다.</p></body>";
		MimeMessage msg = mailSender.createMimeMessage();
		try {
			msg.setHeader("content-type", "text/html; charset=UTF-8");
			msg.setContent(content, "text/html; charset=UTF-8");
			msg.setSubject(subject);
			msg.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(userFormCommand.getUserEmail()));
			mailSender.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
