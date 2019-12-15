package Validator.Insa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Command.Insa.EmployeeCommand;

public class EmployeeCommandValidator implements Validator{
	private static final String emailRegExp=
			"^[_A-Za-z0-9-](.[_A-Za-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
	private static final String passwordEXP = "[a-z0-9]{6,16}"; 
	private static final String birthRegExp = "^\\d{4}-\\d{2}-\\d{2}$";
	private Pattern emailPattern;
	private Pattern pwPattern;
	private Pattern birthPattern;
	
	public EmployeeCommandValidator() {
		emailPattern = Pattern.compile(emailRegExp);
		pwPattern = Pattern.compile(passwordEXP);
		birthPattern = Pattern.compile(birthRegExp);
	}
	

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object target, Errors errors) {
		EmployeeCommand ec = (EmployeeCommand)target;
		if(ec.getEmployeeEmali()==null || ec.getEmployeeEmali().trim().isEmpty()) {
			errors.rejectValue("employeeEmail", "required"); //to check if the email box is empty
		}else {
			//to check if the email address that staff filled in is match to pattern or not
			Matcher matcher = emailPattern.matcher(ec.getEmployeeEmali());
			if(!matcher.matches()) { //if it's false, the email address is not match to pattern
				errors.rejectValue("employeeEmail", "emailIncorrect");
			}
		}
		if(ec.getEmployeePw()==null || ec.getEmployeePw().trim().isEmpty()) {
			errors.rejectValue("employeePw", "required");
		}else {
			Matcher matcher = pwPattern.matcher(ec.getEmployeePw());
			if(!matcher.matches()) {
				errors.rejectValue("employeePw", "pwIncorrect");
			}
		}
		if(ec.getEmployeeBirth()==null) {
			errors.rejectValue("employeeBirth", "required");
		}else {
			Matcher matcher = pwPattern.matcher(ec.getEmployeePw());
			if(!matcher.matches()) {
				errors.rejectValue("employeeBirth", "birthIncorrect");
		}
	}
	}
}
