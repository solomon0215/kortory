package Controller.Gwanri;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaxController {
	@RequestMapping("gwanri/taxList")
	public String boardList(@RequestParam(value="page" ,
	required = false) Integer page, Model model){		
		model.addAttribute("pageName", "../gwanri/Tax/tax_list.jsp");
		return "Main/gwanriMain";
	}
}

