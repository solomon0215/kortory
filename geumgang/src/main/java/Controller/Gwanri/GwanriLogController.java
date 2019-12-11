package Controller.Gwanri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Gwanri.GwanriLoginService;


@RequestMapping("/staff/gwanLogPro")
@Controller
public class GwanriLogController {
	
	@Autowired
	GwanriLoginService gwanriLoginService;	
	
	@RequestMapping(method=RequestMethod.POST)
	public String gwanriIdConfirm(@RequestParam("gwanRiId") String gwanRiId, Model model) {
		model.addAttribute("pageName", "../FirstView/firstView.jsp");
		return gwanriLoginService.idConfirm(gwanRiId);
	}

	@RequestMapping(method=RequestMethod.GET) 
	public String loginPro() {
		return "redirect:../main"; 		
	} 
}
