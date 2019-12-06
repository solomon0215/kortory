package Controller.Gwanri;


import javax.servlet.http.HttpServletResponse;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Gwanri.GwanriLogCommand;
import Service.Gwanri.GwanriLoginService;
import Validator.Gwanri.GwanriLoginCommandValidator;

@Controller
@RequestMapping("/staff/gwanLogPro")
public class GwanriLogController {
	@Autowired
	GwanriLoginService gwanriLoginService;	
	
	@RequestMapping(method=RequestMethod.POST)
	public String loginPro(GwanriLogCommand logCommand, Errors errors, HttpSession session,
			HttpServletResponse response) {
		new GwanriLoginCommandValidator().validate(logCommand, errors);
		if(errors.hasErrors()) 
			return "Login/login";
		Integer i = gwanriLoginService.loginPro(
				session,logCommand,response);
		if(i == 0 ) {
			errors.rejectValue("gwanRiId", "notId");
			return "Login/login";
		}else if(i == -1) {
			errors.rejectValue("gwanRiPw", "wrong");
			return "Login/login";
		}
		return "redirect:../main";
	}
	@RequestMapping(method=RequestMethod.GET) 
	public String loginPro() {
		return "redirect:../main"; // .. 은 상위 폴더로 이동
	} 
}
