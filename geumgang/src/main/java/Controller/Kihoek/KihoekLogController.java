package Controller.Kihoek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Kihoek.KihoekLogService;

@RequestMapping("/staff/kiLogPro")
@Controller
public class KihoekLogController {

	@Autowired
	KihoekLogService kihoekLogService;	
	
	@RequestMapping(method=RequestMethod.POST)
	public String kihoeklogConfirm(@RequestParam("kiHoekId") String kiHoekId, Model model) {
		model.addAttribute("pageName", "../FirstView/firstView.jsp");
		return kihoekLogService.logConfirm(kiHoekId);
	}
	@RequestMapping(method=RequestMethod.GET) 
	public String loginPro() {
		return "redirect:../main"; 		
	} 
}
