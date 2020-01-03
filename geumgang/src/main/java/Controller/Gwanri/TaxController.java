package Controller.Gwanri;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Gwanri.TaxCommand;
import Service.Gwanri.TaxService;

@Controller
public class TaxController<TaxDTO> {
	@Autowired
	TaxService ts;	
	
	@RequestMapping("gwanri/taxWrite") // 예산안보고서 작성 폼
	public String form(TaxCommand tc, HttpServletRequest request , HttpSession session, Model model){		
		model.addAttribute("pageName", "../gwanri/Tax/taxForm.jsp");
		model.addAttribute("tc", tc);
		return "Main/gwanriMain";
	}
	
	@RequestMapping(value="gwanri/taxList", method=RequestMethod.GET)
	public String List(TaxCommand tc, Model model, HttpSession session){
		ts.taxList(model, session);
		model.addAttribute("pageName", "../gwanri/Tax/taxList.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping(value="/gwanri/taxWritePro", method=RequestMethod.POST) // 예산안보고서 등록
	public String write(TaxCommand tc, HttpServletRequest request , HttpSession session, Model model) {		
		ts.taxInsert(tc, request, session, model);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_form_pro.jsp");
		if(session.getAttribute("authLog") == null) { 
			System.out.println("authLog");

			return "Main/gwanriMain";
		}
		return "Main/gwanriMain";
	}	
	
	@RequestMapping("gwanri/taxView") //예산안보고서 디테일
	public String taxDetail(@RequestParam(value="num",required = false) Integer taxNum
			, Model model) {
		ts.taxDetail(model,taxNum);
		model.addAttribute("pageName", "../gwanri/Tax/taxDetail.jsp");
		return "Main/gwanriMain";
	}
	

}

