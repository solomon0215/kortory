package Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Company.CompanyFormCommand;
import Command.User.UserFormCommand;
import Service.User.UserFormService;
import Validator.Company.CompanyFormCommandValidator;
import Validator.User.UserFormCommandValidator;

@Controller
public class UserFormController {
	@Autowired
	UserFormService userFormService;
	
	@RequestMapping("/user/userForm")
	public String userForm(Model model,UserFormCommand userFormCommand) {
		model.addAttribute("pageName", "../User/userForm.jsp");
		return "Main/basicMain";
	}
	@RequestMapping(value="/user/userInsert", method=RequestMethod.POST)
	public String userInsert(UserFormCommand userFormCommand,Errors errors,Model model) { 
		new UserFormCommandValidator().validate(userFormCommand, errors);
		if(errors.hasErrors()) {
			return "User/userForm";//�Է� ����
		}
		Integer i = userFormService.insert(userFormCommand);
		if(i != null) {
			if(i>0) {
				userFormService.infoEmail(userFormCommand); //���� ������
				model.addAttribute("command", userFormCommand);
				return "User/welcomeUser";//��ϿϷ�
			}
		}
		return "User/failedPage"; //����������
	}
	
	//�ߺ�Ȯ�� 
	@RequestMapping("/user/userIdConfirm")
	public String userIdConfirm(@RequestParam("userId") String userId) {
		return userFormService.idConfirm(userId);
	}
}
