package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.ResumeCommand;
import Service.Insa.ResumeService;

@Controller
public class ResumeController {
	@Autowired
	ResumeService resumeService;
	
	@RequestMapping(value="/insa/resumeList", method=RequestMethod.GET) //이력서 목록 include 
	public String resumeList(Model model) {
		model.addAttribute("insaPage","../insa/resumeList.jsp");
		return "insa/insaPage";
	}
	
	@RequestMapping(value="/insa/apply", method=RequestMethod.GET) //이력서메인 include
	public String resumeMain(Model model) {
		model.addAttribute("pageName","../insa/resumeMain.jsp");
		return "Main/basicMain";
	}
	
	@RequestMapping(value="/insa/resume1", method=RequestMethod.GET) //이력서1 include
	public String resume1(Model model) {
		model.addAttribute("pageName","../insa/resume1.jsp");
		return "Main/basicMain";
	}
	
	@RequestMapping(value="/insa/resumeInsert1", method=RequestMethod.POST) //이력서1 작성메소드
	public String resume1Write(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		Integer result = resumeService.resumeRegist1(rc, session, request);
		return "insa/resume1";
	}
	
	

}
