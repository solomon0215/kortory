package Controller.Youngup;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoungupMainController {
	@RequestMapping("/youngup/main")
	public String youngMain(Model model, HttpServletRequest request) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "redirect: ../staff/login";
		}
		model.addAttribute("pageName", "../FirstView/youngFirst.jsp");
		return "Main/youngupMain";
	}
}
