package Validator.Gwanri;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class GwanriLoginCommandValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "GwanRiId", 
				"required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "GwanRiPw", 
				"required");
	}

}
