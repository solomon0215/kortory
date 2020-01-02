package Service.Kihoek;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Command.Kihoek.ConceptCommand;
import Model.KihoekDTO.ConceptDTO;
import Model.KihoekDTO.KihoekAuthInfo;
import Model.KihoekDTO.KihoekDTO;
import Repository.Kihoek.KihoekSelectRepository;

@Service
public class ConceptListService {
	@Autowired
	KihoekSelectRepository kihoekSelectRepository;
	
	@Transactional
	public void conceptAllList(HttpSession session, Model model) {
		List<ConceptDTO> cDto = kihoekSelectRepository.conceptAllList();
		String authName = ((KihoekAuthInfo)session.getAttribute("authLog")).getName();
		model.addAttribute("authName", authName);
		model.addAttribute("concept", cDto);
	}
	
	public void conceptState(Model model) {
		ConceptDTO dto = new ConceptDTO();
		dto.setConceptState("진행");
		List<ConceptDTO> conceptProgress = kihoekSelectRepository.stateSelect(dto);
		dto.setConceptState("미진행");
		List<ConceptDTO> conceptNotProgress = kihoekSelectRepository.stateSelect(dto);
		
		model.addAttribute("conceptProgress", conceptProgress);
		model.addAttribute("conceptNotProgress", conceptNotProgress);
	}
}
