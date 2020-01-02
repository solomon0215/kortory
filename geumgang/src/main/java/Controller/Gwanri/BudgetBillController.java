package Controller.Gwanri;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Gwanri.BudgetBillCommand;
import Service.Gwanri.BudgetBillService;
import Service.Gwanri.CoopContractService;


@Controller
public class BudgetBillController {
	@Autowired
	BudgetBillService bbs;
	
	@RequestMapping("gwanri/budgetBillWrite") // 예산안보고서 작성 폼
	public String form(BudgetBillCommand bbc, HttpServletRequest request , HttpSession session, Model model){		
		model.addAttribute("pageName", "../gwanri/BudgetBill/budgetBillForm.jsp");
		model.addAttribute("bbc", bbc);
		return "Main/gwanriMain";
	}
	@RequestMapping(value="gwanri/budgetBillList", method=RequestMethod.GET) //예산안보고서 리스트
	public String List(BudgetBillCommand bbc, Model model, HttpSession session){
		bbs.budgetList(model, session);
		model.addAttribute("pageName", "../gwanri/BudgetBill/budgetBillList.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping(value="/gwanri/budgetBillWritePro", method=RequestMethod.POST) // 예산안보고서 등록
	public String write(BudgetBillCommand bbc, HttpServletRequest request , HttpSession session, Model model) {		
		bbs.budgetInsert(bbc, request, session, model);
		if(session.getAttribute("authLog") == null) { 
			System.out.println("authLog");

			return "Main/gwanriMain";
		}
		return "gwanri/BudgetBill/budgetBillFormPro";
	}	
	
	@RequestMapping("gwanri/budgetBillView") //예산안보고서 디테일
	public String budgetDetail(@RequestParam(value="num",required = false) Integer budgetBillNum
			, Model model) {
		bbs.budgetDetail(model,budgetBillNum);
		model.addAttribute("pageName", "../gwanri/BudgetBill/budgetBillDetail.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/budgetBillModify") //협약조건안 수정?
	public String budgetModify(@RequestParam(value="num",required = false) Integer budgetBillNum, BudgetBillCommand bbc, HttpServletRequest request , HttpSession session, Model model){		
		bbs.budgetModify(bbc,budgetBillNum, request, session, model);
		model.addAttribute("pageName", "../gwanri/BudgetBill/budgetBillModify.jsp");
		return "Main/gwanriMain";
	}
	/*
	@RequestMapping(value="gwanri/expList", method=RequestMethod.GET) // 사전답사보고서 리스트
	public String expList(Model model, HttpSession session){
		acls.expList(model, session);
		model.addAttribute("pageName", "../gwanri/explorationList.jsp");
		return "Main/gwanriMain";
	}*/

	
	
}

