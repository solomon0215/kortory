package Controller.Gwanri;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Gwanri.BudgetBillListService;


@Controller
public class BudgetBillController {
	@Autowired
	BudgetBillListService bbls;
	
	@RequestMapping("gwanri/budgetBillList")
	public String boardList(@RequestParam(value="page" ,
	required = false) Integer page, Model model){
		bbls.getBoardList(model, page);
		model.addAttribute("pageName", "../gwanri/board/budget_bill/budget_bill_list.jsp");
		return "Main/gwanriMain";
	}
}