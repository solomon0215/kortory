package Service.Gwanri;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.GwanriDTO.AgreementConditionDTO;
import Model.GwanriDTO.AgreementListDTO;
import Model.YoungupDTO.ExplorListDTO;
import Repository.Gwanri.GwanriSelectRepository;

@Service
public class AgreementConditionService {
	
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	
	public void getBoardList(Model model) {
		
		List<AgreementListDTO> list = gwanriSelectRepository.agreeList(new AgreementListDTO());
		model.addAttribute("agreementList", list);
	}

	public void boardWrite(HttpServletRequest request, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	public void boardView(Model model, Integer page, Long agreementConditionNum) {
		// TODO Auto-generated method stub
		
	}
}

