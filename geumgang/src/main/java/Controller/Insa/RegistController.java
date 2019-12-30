package Controller.Insa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistController {
	
	@RequestMapping(value="/insa/registSuccess", method=RequestMethod.GET) //��� ���� include
	public String success(Model model) {
		model.addAttribute("insaPage","../insa/registSuccess.jsp");
		return "Main/insaPage";
	}
	
	@RequestMapping(value="/insa/registFailed", method=RequestMethod.GET) //��� ���� include
	public String failed(Model model) {
		model.addAttribute("insaPage","../insa/registFailed.jsp");
		return "Main/insaPage";
	}
	
	

}
