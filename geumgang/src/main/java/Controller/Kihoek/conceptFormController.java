package Controller.Kihoek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class conceptFormController {
	@RequestMapping("/kihoek/conceptForm")
	public String kihoekMain(Model model, HttpServletRequest request) {
		model.addAttribute("pageName", "../kihoek/conceptForm.jsp");
		return "Main/kihoekMain";
	}
}
