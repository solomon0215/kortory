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
	
	public void basicList(Model model) { //모든 리스트 뽑기
		/*
		 * List<ExplorListDTO> list = youngSelRepo.selectExplorList();
		 * model.addAttribute("explorList", list);
		 */
		
	}
	public void conditionList(Model model, String num, String companyId) { //검색 조건이 있는 리스트
		
	}
	
}
