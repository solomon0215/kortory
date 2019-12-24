package Controller.Gwanri;
import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Gwanri.GwanriLogCommand;
import Service.Gwanri.GwanriLoginService;
import Validator.Gwanri.GwanriLoginCommandValidator;


@Controller
public class GwanriLogController {	
	
	@Autowired
	GwanriLoginService gwanriLoginService;	
	
	@RequestMapping(value = "/staff/gwanLogPro",method = RequestMethod.POST) 
	public String gwanriLogPro(GwanriLogCommand glc, HttpSession session, Model model, Errors errors ) {
		new GwanriLoginCommandValidator().validate(glc, errors);
		System.out.println("/staff/gwanLogPro");	
		if(errors.hasErrors()) {
			model.addAttribute("pageName", "../Login/staffLog.jsp");
			return "Main/basicMain";
		}
		return gwanriLoginService.gwanriLogPro(glc, session, model, errors);
	}
	
		
}
