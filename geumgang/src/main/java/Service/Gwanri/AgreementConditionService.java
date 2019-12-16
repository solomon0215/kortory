package Service.Gwanri;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Gwanri.AgreementConditionCommand;
import Model.GwanriDTO.AgreementConditionDTO;
import Repository.Gwanri.GwanriSelectRepository;

@Service
public class AgreementConditionService {
	
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	
	public String getBoardList(Model model, Integer page,
			AgreementConditionCommand acc) {
		
		List<AgreementConditionDTO> list = 
				gwanriSelectRepository.getBoardList(page, acc);
		
		return "Main/gwanriMain";
	}

	public void boardWrite(AgreementConditionCommand acc, HttpServletRequest request, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	public void boardView(Model model, Integer page, Long agreementConditionNum) {
		// TODO Auto-generated method stub
		
	}
}

