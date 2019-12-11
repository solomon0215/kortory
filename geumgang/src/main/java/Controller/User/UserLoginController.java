package Controller.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.User.UserLogCommand;
import Service.User.UserLogService;
import Validator.User.UserLogCommandValidator;

@Controller
public class UserLoginController {
	@Autowired
	UserLogService userLogService;
	@RequestMapping(value="/user/userLoginPro",method = RequestMethod.POST)
	public String userLogin(Model model, UserLogCommand userLogCommand,HttpSession session ,Errors errors) {
		new UserLogCommandValidator().validate(userLogCommand, errors);
		if(errors.hasErrors()) {
			model.addAttribute("pageName", "../Login/userLogin.jsp");
			return "Main/basicMain";
		}
		
		return userLogService.userLog(model, userLogCommand,session ,errors);
	}
}