package Controller.User;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Company.CompanyLogCommand;
import Service.Company.CompanyLogoutService;

@Controller
public class CompanyLogoutController {
	
	@Autowired
	private CompanyLogoutService cls;
	
	@RequestMapping("company/logout")
	public String logout(HttpSession session,
			HttpServletResponse response, Model model, CompanyLogCommand clc) {
		cls.logout(session, response,clc);
		return "Company/goToLog";
	}
}



