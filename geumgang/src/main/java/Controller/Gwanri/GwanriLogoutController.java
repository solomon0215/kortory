package Controller.Gwanri;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Gwanri.GwanriLogoutService;

@Controller
public class GwanriLogoutController {
	@Autowired
	GwanriLogoutService gwanriLogoutService;
	
	@RequestMapping("/gwanriLogout")
	public String logout(HttpSession session, HttpServletResponse response) {
		gwanriLogoutService.logout(session, response);
		return "redirect:../main";
	}
}
