package Validator.Kihoek;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Kihoek.KihoekLogCommand;

public class KiheokLogCommandValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return KihoekLogCommand.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "KiHoekId", "required");
		ValidationUtils.rejectIfEmpty(errors, "kiHoekPw", "required");
	}
	
}
