package Controller.Insa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Insa.EmployeeCommand;
import Validator.Insa.EmployeeCommandValidator;

@Controller
public class EmployeeInsertController {
	
	public String employeeInsert(EmployeeCommand ec, Errors errors, Model model,
			@RequestParam(value="employeeBirth") java.sql.Date employeeBirth) {
		new EmployeeCommandValidator().validate(ec,errors);
		return "";
	}
	
}
