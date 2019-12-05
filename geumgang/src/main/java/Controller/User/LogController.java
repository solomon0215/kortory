package Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Company.CompanyLogCommand;
import Command.Guide.GuideLogCommand;
import Command.User.UserLogCommnand;

@Controller
public class LogController {
	//login page to include
	@RequestMapping("user/login")
	public String login(Model model) {
		model.addAttribute("pageName", "../Login/login.jsp");
		return "Main/basicMain";
	}
	
	//companyLog form to Ajax
	@RequestMapping("user/companyLogin")
	public String companyLogin(CompanyLogCommand companyLogCommand) {
		return "Login/companyLogin";
	}
	//userLog form to Ajax	
	@RequestMapping("user/userLogin")
	public String userLogin(UserLogCommnand userLogCommnand) {
		return "Login/userLogin";
	}
	
	//guideLog form to Ajax
	@RequestMapping("user/guideLogin")
	public String guideLogin(GuideLogCommand guideLogCommand) {
		return "Login/guideLogin";
	}
}
