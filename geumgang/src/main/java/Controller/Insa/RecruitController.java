package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.RecruitRegiCommand;
import Service.Insa.RecruitRegiService;

@Controller
public class RecruitController {
	@Autowired
	RecruitRegiService recruitRegiService;
	
	@RequestMapping(value="recruitRegiPro", method=RequestMethod.POST)
	public String write(RecruitRegiCommand recruitCommand, HttpServletRequest request,
			HttpSession session) {
		recruitRegiService.recruitRegist(recruitCommand,request,session);
		return "redirect:/recruitList";
	}
	

}
