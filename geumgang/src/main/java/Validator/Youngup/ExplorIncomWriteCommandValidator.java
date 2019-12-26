package Validator.Youngup;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import Command.Youngup.ExplorIncomWriteCommand;

public class ExplorIncomWriteCommandValidator implements Validator{
	
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ExplorIncomWriteCommand.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ExplorIncomWriteCommand com = (ExplorIncomWriteCommand) target;
		if(com.getChoise() == 0) {
			errors.rejectValue("choise", "explorChoise");
		}
		if(com.getExplorationType().equals("0")) {
			errors.rejectValue("explorationType", "required");
		}
		ValidationUtils.rejectIfEmpty(errors, "explorationManaName", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationEffect", "required");
		ValidationUtils.rejectIfEmpty(errors, "startTime", "required");
		ValidationUtils.rejectIfEmpty(errors, "endTime", "required");
		ValidationUtils.rejectIfEmpty(errors, "startDate", "required");
		ValidationUtils.rejectIfEmpty(errors, "endDate", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationAvailHoli", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationLimitAge", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationLimitPer", "required");
		ValidationUtils.rejectIfEmpty(errors, "explorationCondition", "required");
	}

}
