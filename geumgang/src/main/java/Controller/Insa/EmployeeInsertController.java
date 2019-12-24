package Controller.Insa;

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
import Service.Insa.EmployeeInsertService;
import Validator.Insa.EmployeeCommandValidator;

@Controller
public class EmployeeInsertController {
	
	@Autowired
	EmployeeInsertService employeeInsertService;
	
	@RequestMapping(value="/insa/employeeInfoInsert", method=RequestMethod.GET)
	public String asf(@ModelAttribute("ec") EmployeeCommand ec) {
		return "insa/employeeInfoInsert";
	}
	
	@RequestMapping(value="/insa/employeeRegiPro", method=RequestMethod.GET) //������ include
	public String employeeRegistView(Model model) {
		model.addAttribute("insaPage","../insa/employeeInfoInsert.jsp");
		return "insa/insaPage"; 
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
