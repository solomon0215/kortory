package Controller.Youngup;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Youngup.YoungupMainService;

@Controller
public class YoungupMainController {
	@Autowired
	YoungupMainService youngMainSer;
	
	@RequestMapping("/youngup/main")
	public String youngMain(Model model, HttpServletRequest request,HttpSession session) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "Youngup/back";
		}
		youngMainSer.workingState(model);
		model.addAttribute("pageName", "../FirstView/youngFirst.jsp");
		return "Main/youngupMain";
	}
}
