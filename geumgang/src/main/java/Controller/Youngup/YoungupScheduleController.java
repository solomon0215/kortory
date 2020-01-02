package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Youngup.YoungupScheduleService;

@Controller
public class YoungupScheduleController {
	@Autowired
	YoungupScheduleService youngScheSer;
	
	@RequestMapping("/youngup/expSchedule")
	public String youngMain(Model model, HttpServletRequest request,HttpSession session,
			@RequestParam(value = "choise",defaultValue = "0") Integer week) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "Youngup/back";
		}
		youngScheSer.week(model, week, request);
		model.addAttribute("pageName", "../Youngup/incomSchedule.jsp");
		return "Main/youngupMain";
	}
	
}
