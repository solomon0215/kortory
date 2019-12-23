package Controller.Gwanri;

import javax.servlet.http.HttpServletRequest;






import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		@RequestParam(value = "agreementConditionDate",required = false) java.sql.Date agreementConditionDate,
		@RequestParam(value = "agreementConditionSett",required = false) Integer agreementConditionSett,
		@RequestParam(value = "agreementConditionRatio",required = false) float agreementConditionRatio
		) {
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_list.jsp");
		acls.agreeInsert(request, session, model, agreementConditionDate,agreementConditionSett,agreementConditionRatio);
		if(request.getSession().getAttribute("authLog") == null) { 
			return "Gwanri/back";
		}
		return "redirect:/gwanri/agreementConditionList";
	}	
	@RequestMapping("gwanri/agreementConditionList") //리스트
	public String agreeList(Integer page, Model model){
		acls.getBoardList(model, page);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_list.jsp");
		return "Main/gwanriMain";
	}
	
}


