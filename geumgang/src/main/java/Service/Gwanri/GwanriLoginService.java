package Service.Gwanri;


import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Gwanri.GwanriLogCommand;
import Encrypt.Encrypt;
import Model.GwanriDTO.GwanriAuthInfo;
import Model.GwanriDTO.GwanriDTO;
import Repository.Gwanri.GwanriSelectRepository;

@Service
public class GwanriLoginService {
	
	@Autowired
	GwanriSelectRepository gwanriRepository;
	
	public String gwanriLogPro(GwanriLogCommand glc, HttpSession session, Model model, Errors errors) {
		GwanriDTO dto1 = new GwanriDTO();
		dto1.setGwanRiId(glc.getGwanRiId()); 
		String pw = Encrypt.getEncryption(glc.getGwanRiPw());
		dto1.setGwanRiPw(pw); 
		GwanriDTO dto2 = gwanriRepository.gwanriLog(dto1); 
		if(dto2 !=null ) { 		
			System.out.println("-----------------------------------------로그인 성공-----------------------------------");
			GwanriAuthInfo auth = new GwanriAuthInfo(dto2.getGwanRiEmail(), dto2.getGwanRiName(), 301, dto2.getGwanRiNum());
			session.setAttribute("authLog", auth);
			model.addAttribute("pageName","../gwanri/welcome.jsp");
			
			System.out.println(auth.getgwanRiNum());
			return "Main/gwanriMain";
		}else {	
			System.out.println("-----------------------------------------로그인 실패-----------------------------------");
			errors.rejectValue("gwanRiId", "userLogFailed");
			model.addAttribute("pageName","../Login/staffGwanriLog.jsp");
			return "Login/staffLog";
		}
		
	}
}
