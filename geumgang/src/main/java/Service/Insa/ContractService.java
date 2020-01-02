package Service.Insa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Phaser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Insa.ContractCommand;
import Command.User.UserLogCommand;
import Model.InsaDTO.ContractDTO;
import Model.InsaDTO.UserContractDTO;
import Model.UserDTO.UserDTO;
import Repository.Insa.ContractRepository;

@Service
public class ContractService {
	@Autowired
	ContractRepository contractRepository;

	public Integer contractRegist(ContractCommand cc, HttpServletRequest request) {
		ContractDTO contract = new ContractDTO();
		contract.setConDetail(cc.getConDetail());
		contract.setConCeo(cc.getConCeo());
		contract.setConCompany(cc.getConCompany());
		contract.setConIncentive(cc.getConIncentive());
		contract.setConLocation(cc.getConLocation());
		contract.setConPh(cc.getConPh());
		contract.setConRegiNum(cc.getConRegiNum());
		contract.setConSalary(cc.getConSalary());
		contract.setConStart(cc.getConStart());
		contract.setConEnd(cc.getConEnd());
		contract.setResumeNum(cc.getResumeNum());
		contract.setUserId(cc.getUserId());
		
		
		String detail = new String(contract.getConDetail().toString());
		
		return contractRepository.contractInsert(contract);
	}
	
	public void contractSelect(Model model) {
		List<UserContractDTO> contractList = contractRepository.contractAllSelect();
		model.addAttribute("contract",contractList);
	}

	public void contractDetail(Model model, UserLogCommand userLogCommand, HttpSession session) {
		UserDTO dto = new UserDTO();
		dto.setUserId(userLogCommand.getUserId());
		ContractDTO detail = contractRepository.contractDetail(dto);
		System.out.println("detail:" + detail.getUserId());
		model.addAttribute("con",detail);
		model.addAttribute("userId", session.getAttribute("userId"));
		
	}

}
