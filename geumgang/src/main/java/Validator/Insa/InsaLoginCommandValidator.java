package Validator.Insa;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class InsaLoginCommandValidator {
	
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "inSaId", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "inSaPw", "required");
	}

}
