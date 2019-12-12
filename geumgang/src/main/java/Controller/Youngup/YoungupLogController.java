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
	YoungupLogService youngLogSer;
	
	@RequestMapping(value="/staff/youngupLogPro",method=RequestMethod.POST)
	public String youngupLogPro(YoungupLogCommand youngupLogCommand,Model model, Errors errors,HttpSession session) {
		new YoungupLogCommandValidator().validate(youngupLogCommand, errors);
		if(errors.hasErrors()) {
			model.addAttribute("pageName", "../Login/companyLogin.jsp");
			return "Main/basicMain";
		}
		
		return youngLogSer.youngupLogPro(youngupLogCommand,model,errors,session);
	}
		
}
