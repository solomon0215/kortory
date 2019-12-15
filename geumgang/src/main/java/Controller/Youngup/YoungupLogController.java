package Controller.Youngup;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Youngup.YoungupLogCommand;
import Service.Youngup.YoungupLogService;
import Validator.Youngup.YoungupLogCommandValidator;

@Controller
public class YoungupLogController {
	@Autowired
	YoungupLogService youngupLogService;
	
	//영업부 로그인
	@RequestMapping(value = "/staff/loginYoung") 
	public String youngupLogPro(YoungupLogCommand youngupLogCommand,Model model, Errors errors,HttpSession session) {
		new YoungupLogCommandValidator().validate(youngupLogCommand, errors);
		
		System.out.println("/staff/youngupLogPro/staff/youngupLogPro/staff/youngupLogPro/staff/youngupLogPro/staff/youngupLogPro");
		if(errors.hasErrors()) {
			model.addAttribute("pageName", "../Login/companyLogin.jsp");
			return "Main/basicMain";
		}
		return youngupLogService.youngupLogPro(youngupLogCommand,model,errors,session);
	}
		
}
