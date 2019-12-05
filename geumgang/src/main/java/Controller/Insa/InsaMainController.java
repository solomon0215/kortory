package Controller.Insa;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.InsaLogCommand;
import Service.Insa.InsaMainService;




@Controller
@RequestMapping("/Login/staffInsaLog")
public class InsaMainController {
	@Autowired
	InsaMainService insamainService;
	@RequestMapping(method = RequestMethod.GET)
	public String form(InsaLogCommand insaLogCommand,
			@CookieValue(value="idStore",required = false)
			Cookie inSaIdStore,HttpSession session) {
		if(inSaIdStore != null) {
			insaLogCommand.setInSaIdStore(true);
			insaLogCommand.setInSaId(inSaIdStore.getValue());	
		}
		return "Main/main";
	}

}
