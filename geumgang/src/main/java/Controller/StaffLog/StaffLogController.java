package Controller.StaffLog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Gwanri.GwanriLogCommand;
import Command.Insa.InsaLogCommand;
import Command.Kihoek.KihoekLogCommand;
import Command.Youngup.YoungupLogCommand;

@Controller
public class StaffLogController {
	//login page
	@RequestMapping("/staff/login")
	public String staffLog(Model model) {
		model.addAttribute("pageName", "../Login/staffLog.jsp");
		return "Main/basicMain";
	}
	
	//gwanri Log formn Ajax
	@RequestMapping("/staff/gwanLog")
	public String gwanLog(GwanriLogCommand gwanriLogCommand) {
		return "Login/staffGwanriLog";
	}
	
	//youngup Log formn Ajax
	@RequestMapping("/staff/youngLog")
	public String youngLog(YoungupLogCommand youngupLogCommand) {
		return "Login/staffYounupLog";
	}
	
	//insa Log formn Ajax
	@RequestMapping("/staff/inLog")
	public String inLog(InsaLogCommand insaLogCommand) {
		return "Login/staffInsaLog";
	}
	
	//kihoek Log formn Ajax
	@RequestMapping("/staff/kiLog")
	public String kiLog(KihoekLogCommand kihoekLogCommand) {
		return "Login/staffKihoekLog";
	}
	
}
