package Service.Main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class MainService {
	public String main(Model model, HttpServletRequest request,HttpSession session) {
		session = request.getSession();
		
		if(session.getAttribute("loginKind") != null) {
			String loginKind = session.getAttribute("loginKind").toString();
			return null;
		}else {
			model.addAttribute("pageName", "../FirstView/firstView.jsp");
			return "Main/basicMain";
		}
	}
}
