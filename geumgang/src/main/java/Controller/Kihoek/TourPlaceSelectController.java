package Controller.Kihoek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Kihoek.CoopComCommand;
import Command.Kihoek.KihoekLogCommand;
import Service.Kihoek.TourPlaceSelectService;

@Controller
public class TourPlaceSelectController {

	@Autowired
	TourPlaceSelectService tourPlaceSelectService;
	
	@RequestMapping("/kihoek/tourPlaceSelect")
	public String tourPlaceSelect(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("authLog") == null) {
			return "redirect:../staff/login";
		}
		tourPlaceSelectService.tourPlaceSelect(model);
		model.addAttribute("pageName", "../kihoek/tourPlaceSelect.jsp");
		return "Main/kihoekMain";
	}
	
	@RequestMapping("/kihoek/tourPlace")
	public String tourPlaceSelectAction(CoopComCommand coopComCommand) {
		return "Login/staffKihoekLog";
	}
}
