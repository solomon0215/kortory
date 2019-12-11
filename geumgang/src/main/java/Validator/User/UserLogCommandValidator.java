package Validator.User;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserLogCommandValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(arg1, "userPw", "required");
		//�ʼ� �Է� ��ü���̵�
		ValidationUtils.rejectIfEmpty(arg1, "userId", "required");
		
	}

}
