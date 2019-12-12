package Service.Youngup;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Youngup.YoungupLogCommand;
import Encrypt.Encrypt;
import Model.CompanyDTO.CompanyAuth;
import Model.YoungupDTO.YoungupDTO;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class YoungupLogService {
	@Autowired
	YoungupSelectRepository youngSelRep;
	
	public String youngupLogPro(YoungupLogCommand youngupLogCommand,Model model, Errors errors,HttpSession session) { //로그인 시도 
		YoungupDTO dto1 = new YoungupDTO();
		dto1.setYoungUpId(youngupLogCommand.getYoungUpId()); //아이디 담기
		String pw = Encrypt.getEncryption(youngupLogCommand.getYoungUpPw()); //암호화
		System.out.println(pw);
		dto1.setYoungUpPw(pw); //암호화 패스워드 담기
		YoungupDTO dto2 = youngSelRep.youngupLog(dto1); //로그인 정보 새로운 DTO에 담기
		if(dto2 !=null ) { //로그인이 안됬다면
			System.out.println("----------------------------------------------------------succese");
			return "Main/youngupMain";
		}else {
			errors.rejectValue("youngUpId", "companyLogFailed");
			model.addAttribute("pageName","../Login/staffYoungupLog.jsp");
			return "Main/basicMain";
		}
		
	}
}
