package Controller.Insa;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.User.UserLogCommand;
import Service.Insa.ApplicantLogService;
import Validator.User.UserLogCommandValidator;

@Controller
public class ApplicantLoginController {
	@Autowired
	ApplicantLogService applicantLogService;
	
	@RequestMapping(value = "/insa/applicantLogin")
	public String applicantLogin(@RequestParam(value = "userId") String userId, UserLogCommand userLogCommand) {

		return "insa/applicantLogin";
	}
	
	@RequestMapping(value = "/insa/applicantLogPro")
	public String applicantLogPro(UserLogCommand userLogCommand) {
		
		return "insa/contractDetail";
	}
	
}
