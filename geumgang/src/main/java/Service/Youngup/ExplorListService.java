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

	public void basicList(Model model) { // ��� ����Ʈ �̱�
		List<ExplorListDTO> list = youngSelRepo.selectExplorList(new ExplorListDTO());
		model.addAttribute("explorList", list);
	}

	public void conditionList(Model model, String num, String companyName) { // �˻� ������ �ִ� ����Ʈ
		ExplorListDTO dto = new ExplorListDTO();
		if(!num.equals("0")) {
			dto.setYoungUpNum(num);
		}
		if(!companyName.equals("0")) {
			dto.setCompanyName(companyName);
		}
		List<ExplorListDTO> list = youngSelRepo.selectExplorList(dto);
		model.addAttribute("explorList", list);
	}

}
