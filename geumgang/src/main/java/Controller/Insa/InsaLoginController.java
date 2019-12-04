package Controller.Insa;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.InsaLogCommand;
import Service.Insa.InsaLoginService;
import Validator.InsaLoginCommandValidator;

@Controller
@RequestMapping("/Login/staffLog")
public class InsaLoginController {
	@Autowired
	InsaLoginService insaLoginService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String loginPro(InsaLogCommand insaLogCommand, Errors errors, HttpSession session) {
		new InsaLoginCommandValidator().validate(insaLogCommand, errors);
		if(errors.hasErrors())
			return "Login/staffLog";   //작업
	}
	@RequestMapping(method=RequestMethod.GET) 
	public String loginPro() {
		return "redirect:../main"; // .. 은 상위 폴더로 이동
	}

}
