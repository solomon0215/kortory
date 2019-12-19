package Controller.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Company.CompanyFormCommand;
import Command.Company.CompanyLogCommand;
import Service.Company.CompanyLogService;
import Validator.Company.CompanyLogCommandValidator;

@Controller
public class CompanyLoginController {
	@Autowired
	CompanyLogService companyLogService;
	@RequestMapping(value="/user/companyLoginPro",method = RequestMethod.POST)
	public String companyLogin(Model model, CompanyLogCommand companyLogCommand,HttpSession session ,Errors errors) {
		new CompanyLogCommandValidator().validate(companyLogCommand, errors);
		if(errors.hasErrors()) {
			model.addAttribute("pageName", "../Main/companyMain.jsp");
			return "Main/basicMain";
		}
		
		return companyLogService.companyLog(model, companyLogCommand,session ,errors);
	}	
	
}
