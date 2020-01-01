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
import Command.Youngup.ExplorNewWriteCommand;
import Service.Gwanri.CoopContractService;


@Controller
public class CoopContractController {
	@Autowired
	CoopContractService ccs;
	
	@RequestMapping("gwanri/coopWrite") // 협력업체 계약서 작성 폼
	public String form(CoopContractCommand ccc, HttpServletRequest request , HttpSession session, Model model){		
		model.addAttribute("pageName", "../gwanri/CoopContract/coopContractForm.jsp");
		model.addAttribute("ccc", ccc);
		return "Main/gwanriMain";
	}
	@RequestMapping(value="/gwanri/coopWritePro", method=RequestMethod.POST) //협력업체 계약서 등록
	public String write(@RequestParam(value="companyId",required = false) String companyId ,CoopContractCommand ccc, HttpServletRequest request , HttpSession session, Model model) {		
		ccs.coopInsert(companyId, ccc, request, session, model);
		if(session.getAttribute("authLog") == null) { 
			System.out.println("authLog");

			return "Main/gwanriMain";
		}
		return "gwanri/AgreementCondition/agreement_condition_form_pro";
	}	
	@RequestMapping(value="gwanri/coopList", method=RequestMethod.GET) //협력업체 계약서 리스트
	public String List(Model model, HttpSession session){
		ccs.coopList(model, session);
		model.addAttribute("pageName", "../gwanri/CoopContract/coopContractList.jsp");
		return "Main/gwanriMain";
	}
	@RequestMapping("gwanri/coopDetail") //협력업체 계약서 디테일
	public String Detail(@RequestParam(value="num",required = false) Integer coopContractNum
			, Model model) {
		ccs.coopDetail(model,coopContractNum);
		model.addAttribute("pageName", "../gwanri/CoopContract/coopContractDetail.jsp");
		return "Main/gwanriMain";
	}
}





