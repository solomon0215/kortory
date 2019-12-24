package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Insa.EmployeeCommand;
import Command.Insa.RecruitRegiCommand;
import Model.InsaDTO.InsaAuthInfo;
import Service.Insa.EmployeeInsertService;
import Validator.Insa.EmployeeCommandValidator;

@Controller
public class EmployeeInsertController {
	
	@Autowired
	EmployeeInsertService employeeInsertService;
	
	@RequestMapping(value="/insa/employeeInfoInsert", method=RequestMethod.GET)
	public String asf(@ModelAttribute("ec") EmployeeCommand ec, Model model,HttpServletRequest request) {
		if(request.getSession().getAttribute("authLog")==null) {//�α����� �ȵǾ� �ִٸ� ���� ���ϰ� �ϱ�
			return "insa/goToLogin";
		}else {
			InsaAuthInfo auth =(InsaAuthInfo)request.getSession().getAttribute("authLog");
			if(auth.getKind() == 303) { 
				model.addAttribute("insaPage","../insa/employeeInfoInsert.jsp");
				return "insa/insaPage";
			}else { //�α����� �ߴµ� �ٸ� �μ� 
				return "insa/goToLogin";	
			}
		}
	}
	

	@RequestMapping(value="/insa/employeeRegiPro", method=RequestMethod.POST)
	public String employeeInsert(EmployeeCommand ec, Model model, Errors errors) {
		new EmployeeCommandValidator().validate(ec,errors);
		if(errors.hasErrors()) { //��� ��� �� ���� Ȯ��
			return "insa/employeeInfoInsert";
		}
		Integer result = employeeInsertService.Insert(ec);
		if(result == null) { //���̵� �ߺ� Ȯ��
			errors.rejectValue("employeeId", "have");
			return "insa/employeeInfoInsert";
		}
		return "insa/main"; //��� �Ϸ� �� ������������ ���ư���
	}
	
	
}
