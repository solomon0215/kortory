package Controller.Insa;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.User.UserLogCommand;
import Service.Insa.ApplicantLogService;
import Validator.User.UserLogCommandValidator;

@Controller
public class ApplicantLoginController {
	@Autowired
	ApplicantLogService applicantLogService;
	
	public String applicantLogin(Model model, UserLogCommand logCommand, HttpSession session, Errors errors) {
		new UserLogCommandValidator().validate(logCommand, errors);
		if(errors.hasErrors()) {
			model.addAttribute("pageName","../insa/applicantLogin.jsp");
			return "Main/basicMain";
		}
		return applicantLogService.log(model, logCommand, session, errors);
	}
	
}
