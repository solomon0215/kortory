package Controller.Insa;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.InsaLogCommand;
import Service.Insa.InsaLoginService;
import Validator.Insa.InsaLoginCommandValidator;

@Controller
@RequestMapping("/Login/staffLog")
public class InsaLoginController {
	@Autowired
	InsaLoginService insaLoginService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String loginPro(InsaLogCommand insaLogCommand, Errors errors, HttpSession session,
			HttpServletResponse response) {
		new InsaLoginCommandValidator().validate(insaLogCommand, errors);
		if(errors.hasErrors()) 
			return "Main/main";
		Integer i = insaLoginService.loginPro(
				session, insaLogCommand,response);
		if(i == 0 ) {
			errors.rejectValue("insaId", "notId");
			return "Main/main";
		}else if(i == -1) {
			errors.rejectValue("insaPw", "wrong");
			return "Main/main";
		}
		return "redirect:../main";
	}
	@RequestMapping(method=RequestMethod.GET) 
	public String loginPro() {
		return "redirect:../main"; // .. 은 상위 폴더로 이동
	} 

}
