package Service.Company;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;

import Command.Company.CompanyFormCommand;
import Encrypt.Encrypt;
import Model.CompanyDTO.CompanyDTO;
import Repository.Company.CompanyInsertRepository;
import Repository.Company.CompanySelectRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanySelectRepository companySelectRepository;// select 레포지토리
	@Autowired
	CompanyInsertRepository companyInsertRepository;// insert 레포지토리
	@Autowired
	private JavaMailSender mailSender;

	private static final String id = "[a-z0-9]{6,16}"; // 아이디작성 패턴
	private Pattern pattern;

	public Integer insert(CompanyFormCommand companyFormCommand) { // 업체 등록 메소드
		// DTO에 담기
		CompanyDTO dto = new CompanyDTO();
		dto.setCompanyId(companyFormCommand.getCompanyId()); // 아아디
		String companyPw = Encrypt.getEncryption(companyFormCommand.getCompanyPw());// 비밀번호 암호화
		dto.setCompanyPw(companyPw);// 비밀번호
		dto.setCompanyAddr(companyFormCommand.getCompanyAddr());// 주소
		dto.setCompanyPh(companyFormCommand.getCompanyPh());// 전화번호
		dto.setCompanyRegNum(companyFormCommand.getCompanyRegNum()); // 사업자번호
		dto.setCompanyName(companyFormCommand.getCompanyName());// 업체명
		dto.setCompanyAggApp(companyFormCommand.getCompanyAggApp());// 업체정보 제공 여부
		dto.setCompanyPerApp(companyFormCommand.getCompanyPerApp()); // 개인정보 보호 절차 동의 여부
		dto.setCompanyType(companyFormCommand.getCompanyType());// 업체 유형
		dto.setCompanyEmail(companyFormCommand.getCompanyEmail()); // 업체 이메일주소

		return companyInsertRepository.companyInsert(dto);
	}

	public String idConfirm(String userId) { // 아이디 중복확인 메소드
		Integer confirm = companySelectRepository.idConfirm(userId);
		pattern = Pattern.compile(id);
		Matcher matcher = pattern.matcher(userId);
		System.out.println(matcher);
		if (!matcher.matches()) {
			return "Company/confrimId3"; // 패턴이 맞지 않음
		}
		if (confirm > 0) {
			return "Company/confrimId1";// 아이디 존재
		} else {
			return "Company/confrimId2"; // 사용가능
		}
	}

	@Transactional
	public void infoEmail(CompanyFormCommand companyFormCommand) {//안내 메일 보내기
		String subject = "Kortory를 선택해주셔서 감사합니다.";
		String content = "<body><h2>Kortory를 선택해주셔서 감사합니다.</h2>"
				+ "<p>저희 Kortory에서 정확한 파트너쉽을 위해서 일주일 이내에 담당자가 방문할 예정입니다.</p></body>";
		MimeMessage msg = mailSender.createMimeMessage();
		try {
			msg.setHeader("content-type", "text/html; charset=UTF-8");
			msg.setContent(content, "text/html; charset=UTF-8");
			msg.setSubject(subject);
			msg.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(companyFormCommand.getCompanyEmail()));
			mailSender.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
