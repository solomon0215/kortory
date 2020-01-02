package Service.Kihoek;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.GwanriDTO.CoopContractDTO;
import Model.KihoekDTO.CoopComDTO;
import Model.KihoekDTO.KihoekAuthInfo;
import Model.KihoekDTO.KihoekDTO;
import Model.YoungupDTO.ExplorListDTO;
import Repository.Kihoek.KihoekInsertRepository;
import Repository.Kihoek.KihoekSelectRepository;

@Service
public class TourPlaceSelectService {
	@Autowired
	KihoekInsertRepository kihoekInsertRepository;
	@Autowired
	KihoekSelectRepository kihoekSelectRepository;
	
	@Transactional
	public void tourPlaceSelect(Model model) {
		CoopComDTO dto = new CoopComDTO();
		dto.setCoopKind("관광");
		List<CoopComDTO> ccDto = kihoekSelectRepository.tourPlaceSelect(dto);
		model.addAttribute("tourPlaceSelect", ccDto);
	}
}
