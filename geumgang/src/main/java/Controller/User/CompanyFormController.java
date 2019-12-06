package Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Company.CompanyFormCommand;
import Service.Company.CompanyFormService;
import Validator.Company.CompanyFormCommandValidator;

@Controller
public class CompanyFormController {
	@Autowired
	CompanyFormService companyFormService;
	
	//��û�� �ۼ� ������ ����
	@RequestMapping("/user/companyForm")
	public String companyForm(Model model,CompanyFormCommand companyFormCommand) { 
		return "Company/companyForm";
	}
	
	//��ü���
	@RequestMapping("/user/companyInsert")
	public String companyInsert(@RequestParam("userId") String userId,Errors errors,CompanyFormCommand companyFormCommand) { 
		new CompanyFormCommandValidator().validate(companyFormCommand, errors);
		if(errors.hasErrors()) {
			return "Company/companyForm";
		}
		return "Company/companyForm";
	}
	
	//�ߺ�Ȯ�� 
	@RequestMapping("/user/companyIdConfirm")
	public String companyIdConfirm(@RequestParam("userId") String userId) {
		return companyFormService.idConfirm(userId);
	}
}
