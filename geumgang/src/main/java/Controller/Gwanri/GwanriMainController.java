package Controller.Gwanri;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Gwanri.GwanriLogCommand;
import Service.Gwanri.GwanriLoginService;
import Service.Main.MainService;
import Validator.Gwanri.GwanriLoginCommandValidator;


@Controller
@RequestMapping("/Login/staffGwanLog")
public class GwanriMainController {
	@Autowired
	GwanriLoginService gwanriLoginService;
	
	@RequestMapping("/register/memberJoinAction")
	public String memberJoin(GwanriLogCommand glc,
			Errors errors) {
		new GwanriLoginCommandValidator().validate(glc, errors);
		if(errors.hasErrors()) {
			return "member/memberForm";
		}
		Integer result = null;
		if(result == null) {
			errors.rejectValue("gwanRiId", "duplicate");
			return "member/memberForm";
		}
		return "Main/gwanriMain";
	}
}