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

	public void basicList(Model model) { // ���� ������� ī�װ�
		ExplorListDTO dto = new ExplorListDTO();
		dto.setExplorationSubmit("NEW");
		List<ExplorListDTO> newExp = youngSelRepo.selectKindExp(dto); //�ű� ��� ��������
		dto.setExplorationSubmit("NOT");
		List<ExplorListDTO> incomplete = youngSelRepo.selectKindExp(dto); //�̿ϼ� ������� ��������
		dto.setExplorationSubmit("YES");
		List<ExplorListDTO> complete = youngSelRepo.selectKindExp(dto); //�ϼ� ������� ���� ��������
		
		model.addAttribute("newExp", newExp);
		model.addAttribute("incomplete", incomplete);
		model.addAttribute("complete", complete);
	}
}
