package Controller.StaffLog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Gwanri.GwanriLogCommand;
import Command.Insa.InsaLogCommand;

@Controller
public class StaffLogController {
	@RequestMapping("/staff/login")
	public String staffLog(GwanriLogCommand gwanriLogCommand, InsaLogCommand insaLogCommand) {
		return "Login/staffLog";
	}
}
