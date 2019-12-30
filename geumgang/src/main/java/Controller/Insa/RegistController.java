package Controller.Insa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistController {
	
	@RequestMapping(value="/insa/registSuccess", method=RequestMethod.GET) //등록 성공 include
	public String success(Model model) {
		model.addAttribute("insaPage","../insa/registSuccess.jsp");
		return "Main/insaPage";
	}
	
	@RequestMapping(value="/insa/registFailed", method=RequestMethod.GET) //등록 실패 include
	public String failed(Model model) {
		model.addAttribute("insaPage","../insa/registFailed.jsp");
		return "Main/insaPage";
	}
	
	

}
