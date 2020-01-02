package Controller.Insa;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.InsaLogCommand;
import Model.InsaDTO.InsaAuthInfo;
import Service.Insa.InsaMainService;




@Controller
public class InsaMainController {
	@RequestMapping("/insa/main") //인사부 아이디 확인 후 메인으로 이동
	public String form(HttpSession session, HttpServletRequest request,Model model) { 
		session = request.getSession();
		System.out.println(session.getAttribute("authLog") );
		if(session.getAttribute("authLog") != null) {
			InsaAuthInfo auth = (InsaAuthInfo)session.getAttribute("authLog");
			if(auth.getKind() == 303) {
				model.addAttribute("insaPage","../insa/insaMain.jsp");
				return "insa/insaPage";
			}else {
				return "../index"; 
			}
		}else {
			return "../index"; 
		}
	}

}
