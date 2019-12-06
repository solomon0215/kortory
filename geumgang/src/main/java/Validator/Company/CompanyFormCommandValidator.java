package Validator.Company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Company.CompanyFormCommand;

public class CompanyFormCommandValidator implements Validator{
	private static final String emailRegExp=
			"^[_A-Za-z0-9-](.[_A-Za-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
	private static final String passwword = "[a-z0-9]{6,16}"; //비밀번호 작성 패턴
	private Pattern pwPattern;
	private Pattern pattern ;
	
	public CompanyFormCommandValidator() {
		pattern =  Pattern.compile(emailRegExp);
		pwPattern = Pattern.compile(passwword);
	}
	
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		CompanyFormCommand comcom = (CompanyFormCommand)target;
		if(comcom.getCompanyEmail() == null || //입력여부 확인
				comcom.getCompanyEmail().trim().isEmpty()) {
			errors.rejectValue("companyEmail", "required");
		}else{
			// 이메일 패턴검사
			Matcher matcher = pattern.matcher(comcom.getCompanyEmail()); 
			if(!matcher.matches()) {
				errors.rejectValue("companyEmail", "companyEmailBad");
			}
		}
		//비밀번호 패턴 
		if(!comcom.getCompanyPw().isEmpty()) {
			Matcher matcher = pwPattern.matcher(comcom.getCompanyPw());
			if(!matcher.matches()) {
				errors.rejectValue("companyPw", "companyPwPattern");
			}
		}
		//필수 입력 업체명
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyName", 
				"required");
		//필수 입력 비밀번호
		ValidationUtils.rejectIfEmpty(errors, "companyPw", "required");
		//필수 입력 업체아이디
		ValidationUtils.rejectIfEmpty(errors, "companyId", "required");
		//필수 입력 사업자번호
		ValidationUtils.rejectIfEmpty(errors, "companyRegNum", "required");
		//필수 입력 주소
		ValidationUtils.rejectIfEmpty(errors, "companyAddr", "required");
		//필수 입력 연락처
		ValidationUtils.rejectIfEmpty(errors, "companyPh", "required");
		//필수 입력 비밀번호 확인
		ValidationUtils.rejectIfEmpty(errors, "companyPwCon", "required");
		//비밀번호 비교
		if(!comcom.getCompanyPw().isEmpty()){
			if(!comcom.isPwEqualToPwCon()) {
				errors.rejectValue("companyPw", "companyPwNoMatch");
			}
		}
		//아이디 Ajax무시 하고 전송시 
		if(comcom.getConfirmNum() != 0) {
			errors.rejectValue("companyId", "companyId");
		}
	}

}
