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
public class TransportSelectService {
	@Autowired
	KihoekInsertRepository kihoekInsertRepository;
	@Autowired
	KihoekSelectRepository kihoekSelectRepository;
	
	@Transactional
	public void transportSelect(Model model) {
		CoopComDTO dto = new CoopComDTO();
		dto.setCoopKind("이동수단");
		List<CoopComDTO> ccDto = kihoekSelectRepository.transportSelect(dto);
		model.addAttribute("transportSelect", ccDto);
	}
}
