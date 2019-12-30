package Controller.Gwanri;

import javax.servlet.http.HttpServletRequest;






import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Gwanri.ExpWriteCommand;
import Service.Gwanri.AgreementConditionService;


@Controller
public class AgreementConditionController {
	@Autowired
	AgreementConditionService acls;
	
	@RequestMapping("gwanri/agreementConditionWrite") //폼
	public String form(@RequestParam(value="page" ,
			required = false)HttpServletRequest request , HttpSession session, Model model){		
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_form.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping(value="/gwanri/agreementConditionWritePro", method=RequestMethod.POST) //등록
	public String write(HttpServletRequest request , HttpSession session, Model model,
		@RequestParam(value = "agreementConditionSubject",required = false) String agreementConditionSubject,
		@RequestParam(value = "agreementConditionDate",required = false) java.sql.Date agreementConditionDate,
		@RequestParam(value = "agreementConditionSett",required = false) Integer agreementConditionSett,
		@RequestParam(value = "agreementConditionRatio",required = false) float agreementConditionRatio,
		@RequestParam(value = "explorationNum",required = false) Integer explorationNum,
		@RequestParam(value = "companyId",required = false) String companyId) {		
		acls.agreeInsert(request, session, model, agreementConditionSubject,agreementConditionDate,agreementConditionSett,agreementConditionRatio,explorationNum,companyId);
		if(session.getAttribute("authLog") == null) { 
			System.out.println("authLog");

			return "Main/gwanriMain";
		}
		return "gwanri/AgreementCondition/agreement_condition_form_pro";
	}	
	@RequestMapping(value="gwanri/agreementConditionList", method=RequestMethod.GET) //리스트
	public String agreeList(Model model, HttpSession session){
		acls.agreeList(model, session);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_list.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/agreementConditionView") //디테일
	public String agreeDetail(@RequestParam(value="num",required = false) Long agreementConditionNum
			, Model model) {
		System.out.println(agreementConditionNum);
		acls.agreeDetail(model,agreementConditionNum);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_detail.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/agreementConditionModify") //수정
	public String agreeModify(@RequestParam(value="num",required = false) Long agreementConditionNum
			, Model model){		
		acls.agreeModify(model, agreementConditionNum);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_modify.jsp");
		return "Main/gwanriMain";
	}
	
	@RequestMapping(value="gwanri/expList", method=RequestMethod.GET) // 사전답사보고서 리스트
	public String expList(Model model, HttpSession session){
		acls.expList(model, session);
		model.addAttribute("pageName", "../gwanri/explorationList.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/expDetail") // 사전답사보고서 디테일
	public String expDetail(@RequestParam(value="num",required = false) Integer explorationNum
			, Model model) {
		System.out.println(explorationNum);
		acls.expDetail(model,explorationNum);
		model.addAttribute("pageName", "../gwanri/explorationDetail.jsp");
		return "Main/gwanriMain";
	}
	
	
}





