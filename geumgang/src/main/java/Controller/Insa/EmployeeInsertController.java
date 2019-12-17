package Controller.Insa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Insa.EmployeeCommand;
import Service.Insa.EmployeeInsertService;
import Validator.Insa.EmployeeCommandValidator;

@Controller
public class EmployeeInsertController {
	@Autowired
	EmployeeInsertService employeeInsertService;
	
	@RequestMapping(value="/insa/employeeRegiPro", method=RequestMethod.POST)
	public String employeeInsert(EmployeeCommand ec, Errors errors, Model model,
			@RequestParam(value="employeeBirth") java.sql.Date employeeBirth) {
		new EmployeeCommandValidator().validate(ec,errors);
		if(errors.hasErrors()) {
			return "insa/employeeInfoInsert";
		}
		Integer result = employeeInsertService.Insert(ec);
		if(result == null) {
			errors.rejectValue("employeeId", "have");
			return "insa/employeeInfoInsert";
		}
		return "insa/employeeInsertComplete";
	}
	
}
