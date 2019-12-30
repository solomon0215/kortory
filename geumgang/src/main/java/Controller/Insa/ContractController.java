package Controller.Insa;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.ContractCommand;
import Service.Insa.ContractService;

@Controller
public class ContractController {
	@Autowired
	ContractService contractService;
	
	@RequestMapping(value="/insa/contractList", method=RequestMethod.GET) //�ٷΰ�༭ ��� ����
	public String go(@ModelAttribute("cc") ContractCommand cc, Model model) {
		model.addAttribute("insaPage","../insa/contractList.jsp");
		return "insa/insaPage"; 
	}
	

	@RequestMapping(value="/insa/contractRegiPro", method=RequestMethod.POST) //�ٷΰ�༭ �ۼ�
	public String write(@ModelAttribute("cc") ContractCommand cc,HttpServletRequest request) {
		contractService.contractRegist(cc, request);
		return "redirect:/contractList";
	}
	
	@RequestMapping(value="/insa/contractRegist", method=RequestMethod.GET) //�ٷΰ�༭ �ۼ� ������ ����
	public String registView(@ModelAttribute("cc") ContractCommand cc, Model model) {
		model.addAttribute("insaPage", "../insa/contractRegist.jsp");
		return "insa/insaPage";
	}
	

}
