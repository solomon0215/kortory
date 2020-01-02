package Controller.Kihoek;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Kihoek.ConceptDetailService;

@Controller
public class ConceptDetailController {
	@Autowired
	ConceptDetailService conceptDetailService;
	
	@RequestMapping("/kihoek/conceptDetail")
	public String conceptDetail(Model model, @RequestParam(value="num",required = false) Integer conceptNum) {
		conceptDetailService.conceptDetail(conceptNum, model);
		model.addAttribute("pageName", "../kihoek/conceptDetail.jsp");
		return "Main/kihoekMain";
	}
}
