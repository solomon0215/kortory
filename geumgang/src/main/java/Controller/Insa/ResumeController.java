package Controller.Insa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResumeController {
	
	@RequestMapping(value="/insa/resumeList", method=RequestMethod.GET) 
	public String recruitList(Model model) {
		model.addAttribute("insaPage","../insa/resumeList.jsp");
		return "insa/insaPage";
	}
	

}
