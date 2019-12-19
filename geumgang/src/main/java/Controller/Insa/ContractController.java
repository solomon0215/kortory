package Controller.Insa;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.ContractCommand;
import Service.Insa.ContractService;

@Controller
public class ContractController {
	@Autowired
	ContractService contractService;
	
	@RequestMapping(value="/insa/contractRegiPro", method=RequestMethod.POST)
	public String write(ContractCommand cc,HttpServletRequest request) {
		contractService.contractRegist(cc, request);
		return "redirect:/contractList";
	}

}
