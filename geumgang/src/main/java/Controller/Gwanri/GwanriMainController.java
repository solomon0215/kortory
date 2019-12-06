package Controller.Gwanri;

import javax.servlet.http.Cookie;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Gwanri.GwanriLogCommand;
import Service.Gwanri.GwanriMainService;


@Controller
@RequestMapping("/Login/staffGwanriLog")
public class GwanriMainController {
	@Autowired
	GwanriMainService gwanrimainService;
	@RequestMapping(method = RequestMethod.GET)
	public String form(GwanriLogCommand gwanriLogCommand,
			@CookieValue(value="idStore",required = false)
			Cookie gwanRiIdStore,HttpSession session) {
		if(gwanRiIdStore != null) {
			gwanriLogCommand.setGwanRiIdStore(true);
			gwanriLogCommand.setGwanRiId(gwanRiIdStore.getValue());	
		}
		return "Main/gwanriMain";
	}

}
