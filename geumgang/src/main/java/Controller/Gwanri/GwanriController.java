package Controller.Gwanri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Gwanri.GwanriLogCommand;

@Controller
public class GwanriController {
	@RequestMapping("/login/gwanri")	
	public String gwanriJoin(GwanriLogCommand gwanriLogCommand) {
			return "Main/GwanriMain";
		}
		
	}

