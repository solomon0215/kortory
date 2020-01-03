package Controller.Kihoek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Kihoek.TransportSelectService;


@Controller
public class TransportSelectController {
	
	@Autowired
	TransportSelectService transportSelectService;
	
	@RequestMapping("/kihoek/transportSelect")
	public String transportSelect(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("authLog") == null) {
			return "redirect:../staff/login";
		}
		transportSelectService.transportSelect(model);
		model.addAttribute("pageName", "../kihoek/transportSelect.jsp");
		return "Main/kihoekMain";
	}
}
