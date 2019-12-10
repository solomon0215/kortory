package Controller.Gwanri;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Gwanri.GwanriLogoutService;

@Controller
public class GwanriLogoutController {

		@Autowired
		private GwanriLogoutService gls; 
		
		@RequestMapping("staff/logout")
		public String logout(HttpSession session,
				HttpServletResponse response, Model model) {
			gls.logout(session, response);
		model.addAttribute("pageName", "../Login/staffLog.jsp");
			return "Main/basicMain";
		}
	}
