package Validator.Insa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Insa.EmployeeCommand;

public class EmployeeCommandValidator implements Validator {
	private static final String emailRegExp = "^[_A-Za-z0-9-](.[_A-Za-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
	private static final String passwordEXP = "[a-z0-9]{6,16}";
	private Pattern emailPattern;
	private Pattern pwPattern;

	public EmployeeCommandValidator() {
		emailPattern = Pattern.compile(emailRegExp);
		pwPattern = Pattern.compile(passwordEXP);
	}

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object target, Errors errors) {
		EmployeeCommand ec = (EmployeeCommand) target;
		if (ec.getEmployeeEmali() == null || ec.getEmployeeEmali().trim().isEmpty()) {// e메일확인
			errors.rejectValue("employeeEmail", "required");
		} else {

			Matcher matcher = emailPattern.matcher(ec.getEmployeeEmali());
			if (!matcher.matches()) { // 이메일형식틀림
				errors.rejectValue("employeeEmail", "emailIncorrect");
			}
		}
		if (ec.getEmployeePw() == null || ec.getEmployeePw().trim().isEmpty()) {
			errors.rejectValue("employeePw", "required");
		} else {
			Matcher matcher = pwPattern.matcher(ec.getEmployeePw());
			if (!matcher.matches()) {
				errors.rejectValue("employeePw", "pwIncorrect");
			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeNum", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeId", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeBirth", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeName", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeGender", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeePh", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeRegist", "required");
		
		}
	}

