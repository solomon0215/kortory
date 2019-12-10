package Validator.Company;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CompanyLogCommandValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		//필수 입력 비밀번호
		ValidationUtils.rejectIfEmpty(arg1, "companyPw", "required");
		//필수 입력 업체아이디
		ValidationUtils.rejectIfEmpty(arg1, "companyId", "required");
	}

}
