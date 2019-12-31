package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Insa.ResumeCommand;
import Service.Insa.ResumeService;

@Controller
public class ResumeController {
	@Autowired
	ResumeService resumeService;
	
	@RequestMapping(value="/insa/resumeList", method=RequestMethod.GET) //�̷¼� ��� include 
	public String resumeList(ResumeCommand rc, Model model, HttpSession session) {
		resumeService.resumeSelect(model, session);
		model.addAttribute("insaPage","../insa/resumeList.jsp");
		return "insa/insaPage";
	}
	
	@RequestMapping(value="/insa/apply", method=RequestMethod.GET) //�̷¼����� include
	public String resumeMain(Model model) {
		model.addAttribute("pageName","../insa/resumeMain.jsp");
		return "Main/basicMain";
	}
	
	@RequestMapping(value="/insa/resume1", method=RequestMethod.GET) //�̷¼�1 include
	public String resume1(ResumeCommand rc,Model model) {
		model.addAttribute("rc", rc);
		model.addAttribute("pageName","../insa/resume1.jsp");
		return "Main/basicMain";
	}
	
	@RequestMapping(value="/insa/resume2", method=RequestMethod.GET) //�̷¼�2 include
	public String resume2(ResumeCommand rc,Model model) {
		model.addAttribute("pageName","../insa/resume2.jsp");
		return "Main/basicMain";
	}
	
	@RequestMapping(value="/insa/resumeInsert1", method=RequestMethod.POST) //�̷¼�1 �ۼ��޼ҵ�
	public String resume1Write(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		Integer result = resumeService.resumeRegist1(rc, session, request);
		return "insa/resume1";
	}
	
	@RequestMapping(value="/insa/resumeInsert2", method=RequestMethod.POST) //�̷¼� 2 �ۼ� �޼ҵ�
	public String resume2Write(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		Integer result = resumeService.resumeRegist2(rc, session, request);
		return "insa/resume2";
	}
	
	@RequestMapping(value="insa/resumeDetailView") //�̷¼� �󼼺���
	public String recruitDetail(@RequestParam(value="num", required = false) Integer resumeNum, Model model) {
		resumeService.resumeDetail(model, resumeNum);
		model.addAttribute("insaPage","../insa/resumeDetail.jsp");
		return "insa/insaPage";
	}
	
	@RequestMapping(value="insa/sendEmail") //�հ��� �̸��� �뺸 ����â
	public String sendEmail(Model model) {
		model.addAttribute("insaPage","../insa/sendEmail.jsp");
		return "insa/insaPage";
	}

}
