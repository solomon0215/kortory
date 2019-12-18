package Service.Kihoek;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Kihoek.KihoekLogCommand;
import Encrypt.Encrypt;
import Model.KihoekDTO.KihoekAuthInfo;
import Model.KihoekDTO.KihoekDTO;
import Repository.Kihoek.KihoekSelectRepository;

@Service
public class KihoekLogService {

	@Autowired
	KihoekSelectRepository KihoekSelectRepository;
	
	
	public String kihoekLogPro(KihoekLogCommand kihoekLogCommand, Model model, Errors errors,HttpSession session) {
		KihoekDTO kDto = new KihoekDTO();
		kDto.setKiHoekId(kihoekLogCommand.getKiHoekId());
		String kPw = Encrypt.getEncryption(kihoekLogCommand.getKiHoekPw());
		kDto.setKiHoekPw(kPw);
		System.out.println(kPw);
		KihoekDTO kiDto = KihoekSelectRepository.logConfirm(kDto);
		if(kiDto != null) {
			KihoekAuthInfo kAuth = new KihoekAuthInfo(kiDto.getKiHoekId(), kiDto.getKiHoekEmail(), kiDto.getKiHoekName(), 302);
			session.setAttribute("authLog", kAuth);
			return "Main/kihoekMain";
		}else {
			errors.rejectValue("kiHoekId", "logFailed");
			model.addAttribute("pageName","../Login/staffKLog.jsp");
			return "Login/staffLog";
		}
	}

}
