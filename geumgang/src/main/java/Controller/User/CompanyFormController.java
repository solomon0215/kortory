package Controller.User;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Company.CompanyFormCommand;
import Service.Company.CompanyFormService;
import Validator.Company.CompanyFormCommandValidator;

@Controller
public class CompanyFormController {
	@Autowired
	CompanyFormService companyFormService;
	
	//업체 등록 페이지
	@RequestMapping("/user/companyForm")
	public String companyForm(Model model,CompanyFormCommand companyFormCommand) {
		model.addAttribute("pageName", "../Company/companyForm.jsp");
		return "Main/basicMain";
	}
	
	
	//업체 정보 인설트
	@RequestMapping(value="/user/companyInsert", method=RequestMethod.POST)
	public String companyInsert(CompanyFormCommand companyFormCommand,Errors errors,Model model) { 
		new CompanyFormCommandValidator().validate(companyFormCommand, errors);
		if(errors.hasErrors()) {
			return "Company/companyForm";//�Է� ����
		}
		Integer i = companyFormService.insert(companyFormCommand);
		if(i != null) {
			if(i>0) {
				companyFormService.infoEmail(companyFormCommand); //���� ������
				model.addAttribute("command", companyFormCommand);
				return "Company/welcomeCompany";//��ϿϷ�
			}
		}
		return "Company/failedPage"; //����������
	}
	
	//업체 아이디 확인
	@RequestMapping("/user/companyIdConfirm")
	public String companyIdConfirm(@RequestParam("userId") String userId) {
		return companyFormService.idConfirm(userId);
	}
	
	@RequestMapping("company/info")
	public String companyInfo(@RequestParam(value="page" ,
		required = false)HttpSession session, Integer page, Model model){		
			model.addAttribute("pageName", "../Company/companyDetail.jsp");
			return "Main/companyMain";
		}
	
}
