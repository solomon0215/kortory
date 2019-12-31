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
	public void kihoekName(HttpServletRequest request, Model model) {
		KihoekDTO kDto = new KihoekDTO();
		KihoekAuthInfo info = (KihoekAuthInfo)request.getSession().getAttribute("authLog");
		kDto.setKiHoekNum(info.getNum());
		kDto.setKiHoekName(info.getName());
		model.addAttribute("kihoek", kDto);
	}
	
	public Integer insertConcept(ConceptCommand conceptCommand, HttpServletRequest request, HttpSession session, Model model, Long conceptScale) {
		ConceptDTO cDto = new ConceptDTO();
		session = request.getSession();
		cDto.setConceptSubject(conceptCommand.getConceptSubject());
		cDto.setConceptHistory(conceptCommand.getConceptHistory());
		cDto.setConceptQuarter(conceptCommand.getConceptQuarter());
		cDto.setConceptPlace(conceptCommand.getConceptPlace());
		cDto.setConceptScale(conceptScale);
		cDto.setConceptTargetAge(conceptCommand.getConceptTargetAge());
		cDto.setKiHoekNum(conceptCommand.getKiHoekNum());
		model.addAttribute("concept", cDto);
		Integer result = kihoekInsertRepository.insertConcept(cDto);
		return result;
	}

}
