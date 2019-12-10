package Controller.User;

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
	
	//신청서 작성 페이지 가기
	@RequestMapping("/user/companyForm")
	public String companyForm(Model model,CompanyFormCommand companyFormCommand) {
		model.addAttribute("pageName", "../Company/companyForm.jsp");
		return "Main/basicMain";
	}
	
	//업체등록
	@RequestMapping(value="/user/companyInsert", method=RequestMethod.POST)
	public String companyInsert(CompanyFormCommand companyFormCommand,Errors errors,Model model) { 
		new CompanyFormCommandValidator().validate(companyFormCommand, errors);
		if(errors.hasErrors()) {
			return "Company/companyForm";//입력 문제
		}
		Integer i = companyFormService.insert(companyFormCommand);
		if(i != null) {
			if(i>0) {
				companyFormService.infoEmail(companyFormCommand); //메일 보내기
				model.addAttribute("command", companyFormCommand);
				return "Company/welcomeCompany";//등록완료
			}
		}
		return "Company/failedPage"; //에러페이지
	}
	
	//중복확인 
	@RequestMapping("/user/companyIdConfirm")
	public String companyIdConfirm(@RequestParam("userId") String userId) {
		return companyFormService.idConfirm(userId);
	}
}
