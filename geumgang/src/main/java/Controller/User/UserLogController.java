package Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.User.UserLogCommnand;

@Controller
public class UserLogController {
	@RequestMapping("user/login")
	public String userLogin(UserLogCommnand userLogCommnand) {
		return "Login/userLogin";
	}
}
