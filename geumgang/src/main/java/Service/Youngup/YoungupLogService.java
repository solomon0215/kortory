package Service.Youngup;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Youngup.YoungupLogCommand;
import Encrypt.Encrypt;
import Model.CompanyDTO.CompanyAuth;
import Model.YoungupDTO.YoungupAuth;
import Model.YoungupDTO.YoungupDTO;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class YoungupLogService {
	@Autowired
	YoungupSelectRepository youngSelRepo;
	
	public String youngupLogPro(YoungupLogCommand youngupLogCommand,Model model, Errors errors,HttpSession session) { //로그인 시도 
		YoungupDTO dto1 = new YoungupDTO();
		dto1.setYoungUpId(youngupLogCommand.getYoungUpId()); //아이디 담기
		String pw = Encrypt.getEncryption(youngupLogCommand.getYoungUpPw()); //암호화
		System.out.println(pw);
		dto1.setYoungUpPw(pw); //암호화 패스워드 담기
		YoungupDTO dto2 = youngSelRepo.youngupLog(dto1); //로그인 정보 새로운 DTO에 담기
		if(dto2 !=null ) { //로그인이 됬다면
			System.out.println("-----------------------------------------log-----------------------------------");
			YoungupAuth auth = new YoungupAuth(dto2.getYoungUpEmail(), dto2.getYoungUpName(), 304, dto2.getYoungUpEmail());
			session.setAttribute("authLog", auth);
			return "Login/youngupLogPro";
		}else {// 안된다면
			System.out.println("-----------------------------------------no-----------------------------------");
			errors.rejectValue("youngUpId", "companyLogFailed");
			model.addAttribute("pageName","../Login/staffYounupLog.jsp");
			return "Main/basicMain";
		}
		
	}
}
