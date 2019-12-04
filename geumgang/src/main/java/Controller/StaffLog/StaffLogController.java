package Controller.StaffLog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaffLogController {
	@RequestMapping("/staff/login")
	public String staffLog() {
		return "Login/staffLog";
	}
}
