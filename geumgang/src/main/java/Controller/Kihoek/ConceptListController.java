package Controller.Kihoek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Kihoek.ConceptListService;

@Controller
public class ConceptListController {
	@Autowired
	ConceptListService conceptListService;
	
	@RequestMapping("/kihoek/conceptList")
	public String conceptList(Model model, HttpServletRequest request) {
		model.addAttribute("pageName", "../kihoek/conceptList.jsp");
		return "Main/kihoekMain";
	}
}