package Service.Youngup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Youngup.ExplorIncomWriteCommand;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Repository.Youngup.YoungupSelectRepository;
import Repository.Youngup.YoungupUpdateRepository;

@Service
public class ExplorIncomService {
	@Autowired
	YoungupSelectRepository youngSelRepo;
	@Autowired
	YoungupUpdateRepository youngUpRepo;
	
	
	public void incomExpDetail(Model model,Integer expNum) {
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(expNum);
		ExplorListDTO detail = youngSelRepo.selectExpDetail(dto);
		model.addAttribute("detail", detail);
	}
	
	public String incomExpUpdate(ExplorIncomWriteCommand explorIncomWriteCommand,Model model,Errors errors) {
		
		return null;
	}
}
