package Service.Youngup;

import java.util.ArrayList;
import java.util.List;

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

	// 상세 보기 서비스
	public void comExpDetail(Model model, Integer expNum) {
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(expNum);
		ExplorListDTO detail = youngSelRepo.selectExpDetail(dto);
		if(detail.getExplorationFile() != null) {
			String [] file = detail.getExplorationFile().split(";");
			List<String> images = new ArrayList<String>();
			for(String image : file) {
				System.out.println(image);
				images.add(image);
			}
			model.addAttribute("images", images);
		}
		model.addAttribute("detail", detail);
	}
}
