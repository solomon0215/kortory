package Service.Kihoek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.KihoekDTO.CoopComDTO;
import Repository.Kihoek.KihoekInsertRepository;
import Repository.Kihoek.KihoekSelectRepository;

@Service
public class AccomSelectService {
	@Autowired
	KihoekInsertRepository kihoekInsertRepository;
	@Autowired
	KihoekSelectRepository kihoekSelectRepository;
	
	@Transactional
	public void accomSelect(Model model) {
		CoopComDTO dto = new CoopComDTO();
		dto.setCoopKind("숙박");
		List<CoopComDTO> ccDto = kihoekSelectRepository.accomSelect(dto);
		model.addAttribute("accomSelect", ccDto);
	}
}
