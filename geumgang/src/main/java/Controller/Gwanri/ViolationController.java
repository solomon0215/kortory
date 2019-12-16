package Controller.Gwanri;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViolationController {
	@RequestMapping("gwanri/violation")
	public String calculateView(@RequestParam(value="page" ,
	required = false) Integer page, Model model){		
		model.addAttribute("pageName", "../gwanri/violationView.jsp");
		return "Main/gwanriMain";
	}
}
