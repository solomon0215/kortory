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
public class CompanyLogService { //��ü�� �α��� �ϴ� ����
	@Autowired
	CompanySelectRepository companySelectRepository;
	public String companyLog(Model model, CompanyLogCommand companyLogCommand,HttpSession session,Errors errors) {
		CompanyDTO dto1 = new CompanyDTO(); //�α��� ������ �´��� Ȯ���ϱ� ���� ������ DTO
		dto1.setCompanyId(companyLogCommand.getCompanyId());
		String pw = Encrypt.getEncryption(companyLogCommand.getCompanyPw()); //�Է��� ��й�ȣ ��ȣȭ
		dto1.setCompanyPw(pw);
		
		CompanyDTO dto2 = companySelectRepository.comlogin(dto1); //Ȯ�� ���ΰ� ����ִ� DTO
		
		if(dto2 !=null ) {
			System.out.println("----------------------------------------------------------succese");
			CompanyAuth auth = new CompanyAuth(dto2.getCompanyId(), dto2.getCompanyEmail(), dto2.getCompanyName(),111); // ��� ���� Ȯ�� �ϴ� �޼ҵ带 ���� ���ؼ� ���Ƿ� 111�� ����
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
