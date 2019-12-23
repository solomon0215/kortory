package Service.Youngup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.YoungupDTO.ExplorListDTO;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class ExplorListService {
	@Autowired
	private YoungupSelectRepository youngSelRepo;

	public void basicList(Model model) { // 최초 사전답사 카테고리
		ExplorListDTO dto = new ExplorListDTO();
		dto.setExplorationSubmit("NEW");
		List<ExplorListDTO> newExp = youngSelRepo.selectKindExp(dto); //신규 담당 가져오기
		dto.setExplorationSubmit("NOT");
		List<ExplorListDTO> incomplete = youngSelRepo.selectKindExp(dto); //미완성 사전답사 가져오기
		dto.setExplorationSubmit("YES");
		List<ExplorListDTO> complete = youngSelRepo.selectKindExp(dto); //완성 사전답사 보고서 가져오기
		
		model.addAttribute("newExp", newExp);
		model.addAttribute("incomplete", incomplete);
		model.addAttribute("complete", complete);
	}
}
