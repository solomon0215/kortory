package Controller.Gwanri;

import javax.servlet.http.HttpServletRequest;







import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Gwanri.CoopContractCommand;
import Command.Gwanri.ExpWriteCommand;
import Service.Gwanri.AgreementConditionService;
import Service.Gwanri.CoopContractService;


@Controller
public class AgreementConditionController {
	@Autowired
	AgreementConditionService acls;
	
	@RequestMapping(value="gwanri/expList", method=RequestMethod.GET) // 사전답사보고서 리스트
	public String expList(Model model, HttpSession session){
		acls.expList(model, session);
		model.addAttribute("pageName", "../gwanri/explorationList.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/expDetail") // 사전답사보고서 미확인 디테일
	public String expDetail(@RequestParam(value="num",required = false) Integer explorationNum, Model model) {
		System.out.println(explorationNum);
		acls.expDetail(model,explorationNum);
		model.addAttribute("pageName", "../gwanri/explorationDetail.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/expDetail2") // 사전답사보고서 확인 디테일
	public String expDetail2(@RequestParam(value="num",required = false) Integer explorationNum, Model model) {
		System.out.println(explorationNum);
		acls.expDetail2(model,explorationNum);
		model.addAttribute("pageName", "../gwanri/explorationDetail2.jsp");
		return "Main/gwanriMain";
	}
	
	
}





