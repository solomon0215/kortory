package Service.Youngup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class ExplorWriteService {
	@Autowired
	YoungupSelectRepository youngSelRepo;
	
	public void newExpWrite(Model model,Integer expNum) {//정보 검색 해오기
		ExplorationDTO dto = new ExplorationDTO(); 
		dto.setExplorationNum(expNum);
		ExplorListDTO detail = youngSelRepo.selectExpDetail(dto); //보고서 번호로 검색하기
		System.out.println(detail.getCompanyName());
		System.out.println(detail.getCompanyName());
		System.out.println(detail.getCompanyName());
		System.out.println(detail.getCompanyName());
		model.addAttribute("detail", detail);
	}
}
