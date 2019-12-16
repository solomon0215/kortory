package Controller.Insa;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Insa.RecruitRegiCommand;
import Service.Insa.RecruitRegiService;

@Controller
public class RecruitController {
	@Autowired
	RecruitRegiService recruitRegiService;
	
	@RequestMapping(value="/insa/recruitList", method=RequestMethod.GET) //채용공고 목록 이동
	public String RecruitList(RecruitRegiCommand recruitRegiCommand) {
		
		return "insa/recruitList"; //jsp 경로
	}
	
	
	@RequestMapping(value="/insa/recruitRegiPro", method=RequestMethod.POST) //채용공고 작성
	public String write(RecruitRegiCommand recruitCommand, HttpSession session) {
		recruitRegiService.recruitRegist(recruitCommand,session);
		return "redirect:/recruitList";
	}
	
	@RequestMapping(value="/insa/recruitRegist", method=RequestMethod.GET)
	public String regist(RecruitRegiCommand recruitRegiCommand) {
		
		return "insa/recruitRegist"; //jsp 경로
	}
	
	

}
