package Controller.Kihoek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Kihoek.AccomSelectService;
import Service.Kihoek.TransportSelectService;

@Controller
public class AccomSelectController {
	
	@Autowired
	AccomSelectService accomSelectService;
	
	@RequestMapping("/kihoek/accomSelect")
	public String accomSelect(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("authLog") == null) {
			return "redirect:../staff/login";
		}
		accomSelectService.accomSelect(model);
		model.addAttribute("pageName", "../kihoek/accomSelect.jsp");
		return "Main/kihoekMain";
	}
}
