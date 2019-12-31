package Service.Insa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Insa.ContractCommand;
import Model.InsaDTO.ContractDTO;
import Repository.Insa.ContractRepository;

@Service
public class ContractService {
	@Autowired
	ContractRepository contractRepository;

	public Integer contractRegist(ContractCommand cc, HttpServletRequest request) {
		ContractDTO contract = new ContractDTO();
		contract.setConCeo(cc.getConCeo());
		contract.setConCompany(cc.getConCompany());
		contract.setConIncentive(cc.getConIncentive());
		contract.setConLocation(cc.getConLocation());
		contract.setConPh(cc.getConPh());
		contract.setConRegiNum(cc.getConRegiNum());
		contract.setConSalary(cc.getConSalary());
		contract.setConStart(cc.getConStart());
		contract.setConEnd(cc.getConEnd());
		
		String detail = contract.getConDetail().toString();
		
		return contractRepository.contractInsert(contract);
	}
	
	public void contractSelect(Model model) {
		List<ContractDTO> contractList = contractRepository.contractAllSelect();
		model.addAttribute("contract",contractList);
	}

	public void contractDetail(Model model, Integer conNum) {
		ContractDTO dto = new ContractDTO();
		dto.setConNum(conNum);
		ContractDTO detail = contractRepository.contractDetal(dto);
		model.addAttribute("con",detail);
		
		
	}

}
