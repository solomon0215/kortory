package Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Company.CompanyFormCommand;

@Controller
public class CompanyFormController {
	@RequestMapping("/user/companyForm")
	public String companyForm(Model model,CompanyFormCommand companyFormCommand) { //업체가 등록하는 페이지가기
		return "Company/companyForm";
	}
}
