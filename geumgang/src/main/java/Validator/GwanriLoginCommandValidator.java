package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class GwanriLoginCommandValidator {

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required");
	}


}
