package Service.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.User.UserLogCommand;
import Encrypt.Encrypt;
import Model.CompanyDTO.CompanyAuth;
import Model.CompanyDTO.CompanyDTO;
import Model.UserDTO.UserAuth;
import Model.UserDTO.UserDTO;
import Repository.User.UserSelectRepository;

@Service
public class UserLogService { //��ü�� �α��� �ϴ� ����
	@Autowired
	UserSelectRepository userSelectRepository;
	
	public String userLog(Model model, UserLogCommand userLogCommand,HttpSession session,Errors errors) {
		UserDTO dto1 = new UserDTO(); //�α��� ������ �´��� Ȯ���ϱ� ���� ������ DTO
		dto1.setUserId(userLogCommand.getUserId());
		String pw = Encrypt.getEncryption(userLogCommand.getUserPw()); //�Է��� ��й�ȣ ��ȣȭ
		dto1.setUserPw(pw);
		
		UserDTO dto2 = userSelectRepository.userlogin(dto1); //Ȯ�� ���ΰ� ����ִ� DTO
		
		if(dto2 !=null ) {
			System.out.println("----------------------------------------------------------succese");
			UserAuth auth = new UserAuth(dto2.getUserId(), dto2.getUserEmail(), dto2.getUserName(),111); // ��� ���� Ȯ�� �ϴ� �޼ҵ带 ���� ���ؼ� ���Ƿ� 111�� ����
			session.setAttribute("authLog", auth);
			model.addAttribute("pageName","../FirstView/firstView.jsp");
			return "Main/basicMain";
		}else {
			errors.rejectValue("userId", "userLogFailed");
			model.addAttribute("pageName","../Login/userLogin.jsp");
			return "Main/basicMain";
		}
		
	}
}
	
	
