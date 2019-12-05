package Controller.Gwanri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Gwanri.GwanriLogCommand;
import Service.Gwanri.GwanriJoinService;
import Service.Insa.InsaLoginService;

@Controller
@RequestMapping("/login/staffLog")
public class GwanriLogController {
	@Autowired
	GwanriJoinService gwanriJoinService;

	@RequestMapping("/login/gwanri")	
	public String gwanriJoin(GwanriLogCommand gwanriLogCommand) {
			return "Main/GwanriMain";
		}
		
	}

