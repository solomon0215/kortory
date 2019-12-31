package Service.Insa;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ApplicantMailService {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(String userEmail, String userId) {
		MimeMessage msg = mailSender.createMimeMessage();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyyMMdd");
		String num = dateForm.format(new Date());
		
		String subject = "안녕하세요. (주)Kortory 입니다.";
		
		String content = "<html>"
				       + "<body>"
				       + "안녕하세요 '" + userId + "'님.<br />"
				       + "금번 진행한 채용전형에서 합격되었습니다.<br />"
				       + "최종적으로 입사를 원하시면 아래 링크의 근로계약서를 작성하여 주십시오.<br />"
				       + "<a href='http://localhost:8080/geumgang/insa/applicantLogin?userId=" + userId + "'>ㅎ2ㅎ2</a>"
				       + "</body>"
				       + "</html>";
		
		try {
			msg.setHeader("content-type", "text/html; charset=UTF-8");
			msg.setContent(content, "text/html; charset=UTF-8");
			msg.setSubject(subject);
			msg.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(userEmail));
			mailSender.send(msg);
		}catch(Exception e){
			e.printStackTrace();
		}
				
	}
}
