package Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Company.CompanyFormCommand;
import Service.Company.CompanyFormService;

@Controller
public class CompanyFormController {
	@Autowired
	CompanyFormService companyFormService;
	
	@RequestMapping("/user/companyForm")
	public String companyForm(Model model,CompanyFormCommand companyFormCommand) { //��ü�� ����ϴ� ����������
		return "Company/companyForm";
	}
}
