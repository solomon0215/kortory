package Controller.Gwanri;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Gwanri.GwanriLogCommand;
import Service.Gwanri.GwanriLoginService;
import Validator.Gwanri.GwanriLoginCommandValidator;


@Controller
public class GwanriLogController {
	
	@Autowired
	GwanriLoginService gwanriLoginService;	
	
	@RequestMapping(value = "/staff/gwanLogPro",method = RequestMethod.POST) 
	public String gwanLogPro(@RequestParam(value="page" ,
			required = false) Integer page, GwanriLogCommand glc, Model model, Errors errors,HttpSession session) {
		new GwanriLoginCommandValidator().validate(glc, errors);
				
		if(errors.hasErrors()) {
			model.addAttribute("pageName", "../Login/companyLogin.jsp");
			return "Main/basicMain";
		}
		return gwanriLoginService.gwanriLogPro(glc,model,errors,session);
	}
	
		
}
