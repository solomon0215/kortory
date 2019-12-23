package Service.Gwanri;


import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Gwanri.GwanriLogCommand;
import Model.GwanriDTO.GwanriAuthInfo;
import Model.GwanriDTO.GwanriDTO;
import Repository.Gwanri.GwanriSelectRepository;

@Service
public class GwanriLoginService {
	@Autowired
	GwanriSelectRepository gwanriRepository;
	
	public String gwanriLogPro(GwanriLogCommand glc, Model model, Errors errors, HttpSession session) {
		GwanriDTO gdto = new GwanriDTO();
		gdto.setGwanRiId(glc.getGwanRiId()); 
		gdto.setGwanRiPw(glc.getGwanRiPw());		
		GwanriDTO dto2 = gwanriRepository.gwanLog(gdto); 
		if(dto2 !=null ) { 		
			System.out.println("-----------------------------------------log-----------------------------------");
			GwanriAuthInfo auth = new GwanriAuthInfo(dto2.getGwanRiEmail(), dto2.getGwanRiName(), 301, dto2.getGwanRiNum());
			model.addAttribute("pageName","../gwanri/welcome.jsp");
			session.setAttribute("authLog", auth);
			return "Main/gwanriMain";
		}else {	
			System.out.println("-----------------------------------------no-----------------------------------");
			errors.rejectValue("gwanRiId", "userLogFailed");
			model.addAttribute("pageName","../Login/staffGwanriLog.jsp");
			return "Login/staffLog";
		}
		
	}
}
