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
	
	public void sendMail(String receiver, String name) {
		MimeMessage msg = mailSender.createMimeMessage();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyyMMdd");
		String num = dateForm.format(new Date());
		
		String subject = "�ȳ��ϼ���. (��)Kortory �Դϴ�.";
		
		String content = "<html>"
				       + "<body>"
				       + "�ȳ��ϼ��� '" + name + "'��.<br />"
				       + "�ݹ� ������ ä���������� �հݵǾ����ϴ�.<br />"
				       + "���������� �Ի縦 ���Ͻø� �Ʒ� ��ũ�� �ٷΰ�༭�� �ۼ��Ͽ� �ֽʽÿ�.<br />"
				       + "<a href='http://localhost/gumgang/>"
				       + "</a>"
				       + "</body>"
				       + "</html>";
		
		try {
			msg.setHeader("content-type", "text/html; charset=UTF-8");
			msg.setContent(content, "text/html; charset=UTF-8");
			msg.setSubject(subject);
			msg.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiver));
			mailSender.send(msg);
		}catch(Exception e){
			e.printStackTrace();
		}
				
	}
}
