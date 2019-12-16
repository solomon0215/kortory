package Validator.Youngup;

import org.apache.el.util.Validation;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Youngup.YoungupLogCommand;

public class YoungupLogCommandValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors, "youngUpId", "required");
		ValidationUtils.rejectIfEmpty(errors, "youngUpPw", "required");
	}

}
