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
public class InsaMainController {//인사 메인 페이지로 가는 컨트롤러
	@RequestMapping("/insa/main")
	public String form(HttpSession session, HttpServletRequest request) { 
		session = request.getSession();
		System.out.println(session.getAttribute("authLog") );
		if(session.getAttribute("authLog") != null) {//로그인 중인지 검사
			System.out.println("-------------------ㅅㅂ ------------------------");
			InsaAuthInfo auth = (InsaAuthInfo)session.getAttribute("authLog");
			if(auth.getKind() == 303) {//인사부 직원인지 검사
				return "insa/insaMain";
			}else {
				System.out.println("-------------------ㅄ ------------------------");
				return "../index"; //기본 메인보내기
			}
		}else {
			System.out.println("------------------- 이클립스 ------------------------");
			return "../index"; //기본 메인보내기
		}
	}

}
