package Service.Insa;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.User.UserLogCommand;
import Encrypt.Encrypt;
import Model.UserDTO.UserDTO;
import Repository.Insa.ContractRepository;
@Service
public class ApplicantLogService {

	public String log(Model model, UserLogCommand logCommand, HttpSession session, Errors errors) {
		UserDTO dto1 = new UserDTO();
		dto1.setUserId(logCommand.getUserId());
		String pw = Encrypt.getEncryption(logCommand.getUserPw());
		dto1.setUserPw(pw);
		
		return "";
	}



}
