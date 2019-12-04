package Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.User.UserLogCommnand;
import Service.User.UserLoginServie;

@Controller
public class UserLogController {
	@Autowired
	UserLoginServie userLoginServie;
	@RequestMapping("user/login")
	public String userLogin(UserLogCommnand userLogCommnand, Model model) {
		model.addAttribute("pageName", "../Login/userLogin.jsp");
		return "Main/basicMain";
	}
}
