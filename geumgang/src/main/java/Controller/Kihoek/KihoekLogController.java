package Controller.Kihoek;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Kihoek.KihoekLogCommand;
import Service.Kihoek.KihoekLogService;
import Validator.Kihoek.KiheokLogCommandValidator;

@Controller
public class KihoekLogController {

	@Autowired
	KihoekLogService kihoekLogService;	
	
	@RequestMapping(value = "/staff/kiLogPro", method=RequestMethod.POST)
	public String kihoekLogPro(KihoekLogCommand kihoekLogCommand, Model model, Errors errors,HttpSession session) {
		new KiheokLogCommandValidator().validate(kihoekLogCommand, errors);
		
		if(errors.hasErrors()) {
			model.addAttribute("pageName", "../login/staffLog.jsp");
			return "Main/basicMain";
		}
		return kihoekLogService.kihoekLogPro(kihoekLogCommand, model, errors, session);
		
	}
}
