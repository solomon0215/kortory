package Controller.Insa;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Insa.InsaLogoutService;

@Controller
public class InsaLogoutController {
	@Autowired
	InsaLogoutService insaLogoutService;
	
	@RequestMapping("/insaLogout")
	public String logout(HttpSession session, HttpServletResponse response) {
		insaLogoutService.logout(session, response);
		return "redirect:../main";
	}

}
