package Service.Youngup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class ExplorComService {
	@Autowired
	YoungupSelectRepository youngSelRepo;

	// �� ���� ����
	public void comExpDetail(Model model, Integer expNum) {
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(expNum);
		ExplorListDTO detail = youngSelRepo.selectExpDetail(dto);
		model.addAttribute("detail", detail);
	}
}
