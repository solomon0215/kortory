package Service.Company;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Company.CompanyLogCommand;
import Encrypt.Encrypt;
import Model.CompanyDTO.CompanyAuth;
import Model.CompanyDTO.CompanyDTO;
import Repository.Company.CompanySelectRepository;

@Service
public class CompanyLogService { //업체가 로그인 하는 서비스
	@Autowired
	CompanySelectRepository companySelectRepository;
	public String companyLog(Model model, CompanyLogCommand companyLogCommand,HttpSession session,Errors errors) {
		CompanyDTO dto1 = new CompanyDTO(); //로그인 정보가 맞는지 확인하기 위해 보내는 DTO
		dto1.setCompanyId(companyLogCommand.getCompanyId());
		String pw = Encrypt.getEncryption(companyLogCommand.getCompanyPw()); //입력한 비밀번호 암호화
		dto1.setCompanyPw(pw);
		
		CompanyDTO dto2 = companySelectRepository.comlogin(dto1); //확인 여부가 담겨있는 DTO
		
		if(dto2 !=null ) {
			System.out.println("----------------------------------------------------------succese");
			CompanyAuth auth = new CompanyAuth(dto2.getCompanyId(), dto2.getCompanyEmail(), dto2.getCompanyName(),111); // 계약 여부 확인 하는 메소드를 넣지 못해서 임의로 111로 정의
			session.setAttribute("authLog", auth);
			model.addAttribute("pageName","../FirstView/firstView.jsp");
			return "Company/goToMain";
		}else {
			errors.rejectValue("companyId", "companyLogFailed");
			model.addAttribute("pageName","../Login/companyLogin.jsp");
			return "Main/basicMain";
		}
		
	}
}
