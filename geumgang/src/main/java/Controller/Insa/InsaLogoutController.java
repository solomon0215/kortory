package Controller.Insa;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Insa.InsaLogoutService;

@Controller
public class InsaLogoutController {
	@Autowired
	InsaLogoutService insaLogoutService;
	
	@RequestMapping("/insa/logout")
	public String logout(HttpSession session, HttpServletResponse response, Model model) {
		insaLogoutService.logout(session, response);
		model.addAttribute("pageName","../FirstView/firstView.jsp");
		return "Main/basicMain";
	}

}