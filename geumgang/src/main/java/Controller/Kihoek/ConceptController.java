package Controller.Kihoek;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Kihoek.ConceptCommand;
import Service.Kihoek.ConceptWriteService;

@Controller
public class ConceptController {
	@Autowired
	ConceptWriteService conceptWriteService;
	
	@RequestMapping("/kihoek/conceptForm")
	public String conceptForm(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("authLog") == null) {
			return "redirect:../staff/login";
		}
		conceptWriteService.kihoekName(request, model);
		model.addAttribute("pageName", "../kihoek/conceptForm.jsp");
		return "Main/kihoekMain";
	}
	
	@RequestMapping("/kihoek/conceptWritePro")
	public String conceptWrite(ConceptCommand conceptCommand, HttpServletRequest request , HttpSession session, Model model,
			@RequestParam(value = "conceptScale",required = false) Long conceptScale
			) {
		conceptWriteService.insertConcept(conceptCommand, request, session, model, conceptScale);
		model.addAttribute("pageName", "../kihoek/conceptList.jsp");
		if (request.getSession().getAttribute("authLog") == null) {
			return "redirect:../staff/login";
		}
		return "Main/kihoekMain";
	}
}
