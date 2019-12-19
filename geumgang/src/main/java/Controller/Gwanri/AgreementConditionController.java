package Controller.Gwanri;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Gwanri.AgreementConditionService;

@Controller
public class AgreementConditionController {
	@Autowired
	AgreementConditionService acls;
	
	@RequestMapping("gwanri/agreementConditionWrite") //폼
	public String form(@RequestParam(value="page" ,
	required = false) Integer page, Model model){
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_form.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/agreementConditionWritePro") //등록
	public String write(HttpServletRequest request , HttpSession session ) {
		acls.boardWrite(request, session);
		return "Main/gwanriMain";
	}	
	@RequestMapping("gwanri/agreementConditionList") //리스트
	public String boardList(@RequestParam(value="page" ,
	required = false) Integer page, Model model){
		acls.getBoardList(model);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_list.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/agreementConditionDetail") //상세보기
	public String boardView(@RequestParam(value="page" ,
			required = false) Integer page, Model model, Long agreementConditionNum ){
		acls.boardView(model, page, agreementConditionNum);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_detail.jsp");
		return  "Main/gwanriMain";
	}
	
	
}


