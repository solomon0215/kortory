package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.RecruitRegiCommand;
import Service.Insa.RecruitRegiService;

@Controller
public class RecruitController {
	@Autowired
	RecruitRegiService recruitRegiService;
	
	@RequestMapping(value="/insa/recruitRegist", method=RequestMethod.GET)
	public String go(RecruitRegiCommand recruitRegiCommand) {
		
		return "insa/recruitRegist"; //jsp 경로
	}
	
	
	@RequestMapping(value="/insa/recruitRegiPro", method=RequestMethod.POST)
	public String write(RecruitRegiCommand recruitCommand, HttpSession session) {
		System.out.println("==================왜안됨?===============");
		recruitRegiService.recruitRegist(recruitCommand,session);
		return "redirect:/recruitList";
	}
	

}
