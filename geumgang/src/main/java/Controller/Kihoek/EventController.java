package Controller.Kihoek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Kihoek.EventWriteService;

@Controller
public class EventController {
	@Autowired
	EventWriteService eventWriteService;
	
	@RequestMapping("/kihoek/eventForm")
	public String conceptForm(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("authLog") == null) {
			return "redirect:../staff/login";
		}
		eventWriteService.kihoekName(request, model);
		model.addAttribute("pageName", "../kihoek/eventForm.jsp");
		return "Main/kihoekMain";
	}
}
