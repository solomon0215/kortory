package Controller.Kihoek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class KihoekMainContoller {
	@RequestMapping("/kihoek/main")
	public String kihoekMain(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("authLog") == null) {
			return "redirect:../staff/login";
		}
		model.addAttribute("pageName", "../kihoek/kihoekFirstView.jsp");
		return "Main/kihoekMain";
	}
}
