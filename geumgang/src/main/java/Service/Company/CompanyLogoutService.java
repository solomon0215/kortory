package Service.Company;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Command.Company.CompanyLogCommand;

public class CompanyLogoutService {
	public void logout(HttpSession session, HttpServletResponse response, CompanyLogCommand clc) {
		session.invalidate();
	}
}
