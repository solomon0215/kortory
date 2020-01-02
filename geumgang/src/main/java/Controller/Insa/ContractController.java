package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Insa.ContractCommand;
import Command.User.UserLogCommand;
import Service.Insa.ContractService;

@Controller
public class ContractController {
	@Autowired
	ContractService contractService;
	
	@RequestMapping(value="/insa/contractList", method=RequestMethod.GET) //근로계약서 목록 보기
	public String go(@ModelAttribute("cc") ContractCommand cc, Model model) {
		model.addAttribute("insaPage","../insa/contractList.jsp");
		return "insa/insaPage"; 
	}
	

	@RequestMapping(value="/insa/contractRegiPro", method=RequestMethod.POST) //근로계약서 작성 값 전송
	public String write(@ModelAttribute("cc") ContractCommand cc,HttpServletRequest request) {
		Integer result = contractService.contractRegist(cc, request);
		if(result == 0) { //insert 실패시
			return "insa/registFailed";
		}
		return "insa/registSuccess";
	}
	
	@RequestMapping(value="/insa/contractRegist", method=RequestMethod.GET) //근로계약서 작성 페이지 보기
	public String registView(@ModelAttribute("cc") ContractCommand cc, Model model) {
		model.addAttribute("insaPage", "../insa/contractRegist.jsp");
		return "insa/insaPage";
	}
	
//	@RequestMapping(value="/insa/applicantContract") //디테일
//	public String contractDetail(UserLogCommand userLogCommand, Model model, HttpSession session) {
//		System.out.println("------------------------------controller------------------------");
//		contractService.contractDetail(model, userLogCommand, session);
//		model.addAttribute("insaPage","../insa/applicantContract.jsp");
//		return "insa/insaPage";
//	}

}
