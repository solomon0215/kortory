package Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Company.CompanyFormCommand;

@Controller
public class CompanyFormController {
	@RequestMapping("/user/companyForm")
	public String companyForm(Model model,CompanyFormCommand companyFormCommand) { //��ü�� ����ϴ� ����������
		return "Company/companyForm";
	}
}
