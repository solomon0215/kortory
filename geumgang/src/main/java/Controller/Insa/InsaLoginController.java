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
@RequestMapping("/staff/inLogPro")
public class InsaLoginController {
	@Autowired
	InsaLoginService insaLoginService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String loginPro(InsaLogCommand insaLogCommand, Errors errors, HttpSession session,
			HttpServletResponse response) {
		new InsaLoginCommandValidator().validate(insaLogCommand, errors);
		if(errors.hasErrors()) 
			return "Login/login";
		Integer i = insaLoginService.loginPro(
				session, insaLogCommand,response);
		if(i == 0 ) {
			errors.rejectValue("inSaId", "notId");
			return "Login/login";
		}else if(i == -1) {
			errors.rejectValue("inSaPw", "wrong");
			return "Login/login";
		}
		return "insa/insaMain";
	}
	@RequestMapping(method=RequestMethod.GET) 
	public String loginPro() {
		return "redirect:../main"; // .. �� �긽�쐞 �뤃�뜑濡� �씠�룞
	} 

}
