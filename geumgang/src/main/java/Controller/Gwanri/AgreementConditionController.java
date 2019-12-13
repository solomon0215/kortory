package Controller.Gwanri;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Gwanri.AgreementConditionListService;

@Controller
public class AgreementConditionController {
	@Autowired
	AgreementConditionListService acls;
	
	@RequestMapping("gwanri/agreementConditionList")
	public String boardList(@RequestParam(value="page" ,
	required = false) Integer page, Model model){
		acls.getBoardList(model, page);
		model.addAttribute("pageName", "../gwanri/board/AgreementCondition/agreement_condition_list.jsp");
		return "Main/gwanriMain";
	}
}


