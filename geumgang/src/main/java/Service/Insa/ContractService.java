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
		
		
		String detail = contract.getConDetail().toString();
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = dt.parse(cc.getConStart());
			java.sql.Date start = new java.sql.Date(date.getTime());
			contract.setConStart(start);
			date = dt.parse(cc.getConEnd());
			java.sql.Date end = new java.sql.Date(date.getTime());
			contract.setConEnd(end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return contractRepository.contractInsert(contract);
	}
	
	public void contractSelect(Model model) {
		List<ContractDTO> contractList = contractRepository.contractAllSelect();
		model.addAttribute("contract",contractList);
	}

}
