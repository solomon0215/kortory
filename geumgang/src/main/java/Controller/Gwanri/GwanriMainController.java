package Controller.Gwanri;


import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class GwanriMainController {
	@RequestMapping("/gwanri/main")
	public String gwanriMain(Model model, HttpServletRequest request) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "gwanri/back";
		}
		model.addAttribute("pageName", "../gwanri/welcome.jsp");
		return "Main/gwanriMain";
	}
}
