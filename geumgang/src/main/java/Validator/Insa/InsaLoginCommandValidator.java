package Validator.Insa;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class InsaLoginCommandValidator {
	
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "required");
	}

}
