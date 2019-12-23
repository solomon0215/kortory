package Service.Kihoek;

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
import Repository.Kihoek.KihoekInsertRepository;


@Service
public class ConceptWriteService {
	@Autowired
	KihoekInsertRepository kihoekInsertRepository;
	
	@Transactional
	public void kihoekName(HttpSession session, Model model) {
		KihoekDTO kDto = new KihoekDTO();
		kDto.setKiHoekName(
				((KihoekAuthInfo)session.getAttribute("AuthLog")).getName());
		model.addAttribute("kihoek", kDto);
	}
	
	public Integer insertConcept(ConceptCommand conceptCommand, HttpServletRequest request, HttpSession session, Model model) {
		ConceptDTO cDto = new ConceptDTO();
		session = request.getSession();
		//cDto.setConceptNum(conceptCommand.getConceptNum());
		cDto.setConceptSubject(conceptCommand.getConceptSubject());
		cDto.setConceptHistory(conceptCommand.getConceptHistory());
		cDto.setConceptQuarter(conceptCommand.getConceptQuarter());
		cDto.setConceptPlace(conceptCommand.getConceptPlace());
		cDto.setConceptScale(conceptCommand.getConceptScale());
		cDto.setConceptTargetAge(conceptCommand.getConceptTargetAge());
		cDto.setKiHoekNum(((KihoekAuthInfo)session.getAttribute("AuthLog")).getKiHoekNum());
		
		return kihoekInsertRepository.insertConcept(cDto);
	}

}
