package Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserMainController {
	@RequestMapping("/user/main")
	public String main(Model model) {
		model.addAttribute("userPage", "../FirstView/firstView.jsp");
		return "User/userMain";
	}

}
