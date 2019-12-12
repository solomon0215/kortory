package Controller.Insa;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.InsaLogCommand;
import Model.InsaDTO.InsaAuthInfo;
import Service.Insa.InsaMainService;




@Controller
public class InsaMainController {//�λ� ���� �������� ���� ��Ʈ�ѷ�
	@RequestMapping("/insa/main")
	public String form(HttpSession session, HttpServletRequest request) { 
		session = request.getSession();
		System.out.println(session.getAttribute("authLog") );
		if(session.getAttribute("authLog") != null) {//�α��� ������ �˻�
			System.out.println("-------------------���� ------------------------");
			InsaAuthInfo auth = (InsaAuthInfo)session.getAttribute("authLog");
			if(auth.getKind() == 303) {//�λ�� �������� �˻�
				return "insa/insaMain";
			}else {
				System.out.println("-------------------�� ------------------------");
				return "../index"; //�⺻ ���κ�����
			}
		}else {
			System.out.println("------------------- ��Ŭ���� ------------------------");
			return "../index"; //�⺻ ���κ�����
		}
	}

}
