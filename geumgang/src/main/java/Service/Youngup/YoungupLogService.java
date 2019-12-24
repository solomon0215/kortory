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
	
	public String youngupLogPro(YoungupLogCommand youngupLogCommand,Model model, Errors errors,HttpSession session) { //�α��� �õ� 
		YoungupDTO dto1 = new YoungupDTO();
		dto1.setYoungUpId(youngupLogCommand.getYoungUpId()); //���̵� ���
		String pw = Encrypt.getEncryption(youngupLogCommand.getYoungUpPw()); //��ȣȭ
		System.out.println(pw);
		dto1.setYoungUpPw(pw); //��ȣȭ �н����� ���
		YoungupDTO dto2 = youngSelRepo.youngupLog(dto1); //�α��� ���� ���ο� DTO�� ���
		if(dto2 !=null ) { //�α����� ��ٸ�
			System.out.println("-----------------------------------------log-----------------------------------");
			YoungupAuth auth = new YoungupAuth(dto2.getYoungUpEmail(), dto2.getYoungUpName(), 304, dto2.getYoungUpNum());
			session.setAttribute("authLog", auth);
			return "Login/youngupLogPro";
		}else {// �ȵȴٸ�
			System.out.println("-----------------------------------------no-----------------------------------");
			errors.rejectValue("youngUpId", "companyLogFailed");
			model.addAttribute("pageName","../Login/staffYounupLog.jsp");
			return "Main/basicMain";
		}
		
	}
}
