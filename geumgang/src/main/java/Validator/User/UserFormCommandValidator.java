package Validator.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import Command.User.UserFormCommand;

public class UserFormCommandValidator {
	private static final String emailRegExp=
			"^[_A-Za-z0-9-](.[_A-Za-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
	private static final String passwword = "[a-z0-9]{6,16}"; //��й�ȣ �ۼ� ����
	private Pattern pwPattern;
	private Pattern pattern ;
	
	public UserFormCommandValidator() {
		pattern =  Pattern.compile(emailRegExp);
		pwPattern = Pattern.compile(passwword);
	}
	
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		UserFormCommand ufc = (UserFormCommand)target;
		if(ufc.getUserEmail() == null || //�Է¿��� Ȯ��
				ufc.getUserEmail().trim().isEmpty()) {
			errors.rejectValue("userEmail", "required");
		}else{
			
			Matcher matcher = pattern.matcher(ufc.getUserEmail()); 
			if(!matcher.matches()) {
				errors.rejectValue("userEmail", "userEmailBad");
			}
		}
		if(!ufc.getUserPw().isEmpty()) {
			Matcher matcher = pwPattern.matcher(ufc.getUserPw());
			if(!matcher.matches()) {
				errors.rejectValue("userPw", "userPwPattern");
			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", 
				"required");
		
		ValidationUtils.rejectIfEmpty(errors, "userPw", "required");
		
		ValidationUtils.rejectIfEmpty(errors, "userId", "required");
	
		ValidationUtils.rejectIfEmpty(errors, "userAddr", "required");
		
		ValidationUtils.rejectIfEmpty(errors, "userPh", "required");
		
		ValidationUtils.rejectIfEmpty(errors, "userPwCon", "required");
		
		ValidationUtils.rejectIfEmpty(errors, "userBirth", "required");
		
		if(!ufc.getUserPw().isEmpty()){
			if(!ufc.isPwEqualToPwCon()) {
				errors.rejectValue("userPw", "userPwNoMatch");
			}
		}
		
		if(ufc.getConfirmNum() != 0) {
			errors.rejectValue("userId", "userId");
		}
	}

}

