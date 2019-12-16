package Controller.Youngup;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoungupMainController {
	@RequestMapping("/youngup/main")
	public String youngMain(Model model) {
		model.addAttribute("pageName", "../FirstView/youngFirst.jsp");
		return "Main/youngupMain";
	}
}
