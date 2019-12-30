package Controller.Company;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.CompanyDTO.CompanyAuth;

@Controller
public class CompanyMainController {
	@RequestMapping("/company/main")
	public String goToMain(Model model, HttpServletRequest request) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "Company/goToLog";
		}else {
			CompanyAuth auth =(CompanyAuth) request.getSession().getAttribute("authLog");
			if(auth.getKind() != 111) {
				return "Company/goToLog";
			}
			
			model.addAttribute("pageName", "../FirstView/companyFirst.jsp");
			return "Main/companyMain";
		}
	}
}
