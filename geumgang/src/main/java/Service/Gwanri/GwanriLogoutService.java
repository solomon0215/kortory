package Service.Gwanri;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GwanriLogoutService {
	public void logout(HttpSession session, HttpServletResponse response) {
		session.invalidate();

	}
}
