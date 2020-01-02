package Service.Kihoek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.KihoekDTO.ConceptDTO;
import Repository.Kihoek.KihoekSelectRepository;
import Repository.Kihoek.KihoekUpdateRepository;

@Service
public class ConceptDetailService {
	@Autowired
	KihoekSelectRepository kihoekSelectRepository;
	@Autowired
	KihoekUpdateRepository kihoekUpdateRepository;
	
	public void conceptDetail(Integer conceptNum, Model model) {
		ConceptDTO dto = new ConceptDTO();
		dto.setConceptNum(conceptNum);
		ConceptDTO concept = kihoekSelectRepository.conceptDetail(dto);
		model.addAttribute("concept", concept);
	}
	
	public void conceptModify(Integer conceptNum, Model model) {
		ConceptDTO dto = new ConceptDTO();
		dto.setConceptNum(conceptNum);
		Integer modify = kihoekUpdateRepository.conceptModify(dto);
		model.addAttribute("modify", modify);
	}
}
