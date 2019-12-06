package Controller.Gwanri;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Gwanri.BoardCommand;
import Service.Gwanri.BudgetBillListService;
import Service.Gwanri.BudgetBillWriteService;

@Controller
public class BudgetBillController {
	@Autowired
	BudgetBillWriteService budgetBillWriteService ;
	@Autowired
	BudgetBillListService budgetBillListService;
	@RequestMapping("/board/budgetBill")
	public String form(BoardCommand boardCommand) {
		return "board/budget_bill/budget_bill_write";
	}
	@RequestMapping(value = "/board/budgetBillWritePro", 
			method = RequestMethod.POST)
	public String write(BoardCommand boardCommand,
			HttpServletRequest request , HttpSession session ) {
		budgetBillWriteService.boardWrite(boardCommand , request, session);
		return "redirect:/board/budgetBillList";
	}
	@RequestMapping("/board/budgetBillList")
	public String boardList(@RequestParam(value="page" ,
	required = false) Integer page, Model model){
		budgetBillListService.getBoardList(model, page);
		return "board/budget_bill/budget_bill_list";
	}
}