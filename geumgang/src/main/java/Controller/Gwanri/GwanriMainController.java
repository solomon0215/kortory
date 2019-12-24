package Controller.Gwanri;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class GwanriMainController {
	@RequestMapping("/gwanri/main")
	public String gwanriMain(Model model, HttpServletRequest request, HttpSession session) {
		if (session != null) {
			session.getAttribute("authLog");
		}
		
		/*if(request.getSession().getAttribute("authLog") == null) {
			return "redirect:../staff/login";
		}*/
		model.addAttribute("pageName", "../Main/gwanriMain.jsp");
		return "Main/gwanriMain";
	}
}
