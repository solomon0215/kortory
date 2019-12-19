package Controller.Insa;

import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	@RequestMapping(value="/insa/recruitRegiPro", method=RequestMethod.POST) //작성한 채용공고 등록
	public String write(RecruitRegiCommand recruitCommand, HttpSession session,HttpServletRequest request) {
		recruitRegiService.recruitRegist(recruitCommand,session,request);
		return "redirect:/recruitList";
	}
	
	@RequestMapping(value="/insa/recruitRegist", method=RequestMethod.GET) //등록일자에 오늘날짜 표시
	public String regist(RecruitRegiCommand recruitRegiCommand) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		recruitRegiCommand.setRegiDate(fmt.format(date));
		return "insa/recruitRegist"; //jsp 경로
	}
	
	@RequestMapping(value="/insa/recruitList", method=RequestMethod.GET) //작성한 채용공고를 리스트에 추가
	public String recruitList(RecruitRegiCommand rc, Model model, HttpSession session) {
		recruitRegiService.recruitSelect(model, session);
		model.addAttribute("insaPage","../insa/recruitList.jsp");
		return "insa/insaPage";
	}
	

}
