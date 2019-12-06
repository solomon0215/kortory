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
	private static final String passwword = "[a-z0-9]{6,16}"; //��й�ȣ �ۼ� ����
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
		if(comcom.getCompanyEmail() == null || //�Է¿��� Ȯ��
				comcom.getCompanyEmail().trim().isEmpty()) {
			errors.rejectValue("companyEmail", "required");
		}else{
			// �̸��� ���ϰ˻�
			Matcher matcher = pattern.matcher(comcom.getCompanyEmail()); 
			if(!matcher.matches()) {
				errors.rejectValue("companyEmail", "companyEmailBad");
			}
		}
		//��й�ȣ ���� 
		if(!comcom.getCompanyPw().isEmpty()) {
			Matcher matcher = pwPattern.matcher(comcom.getCompanyPw());
			if(!matcher.matches()) {
				errors.rejectValue("companyPw", "companyPwPattern");
			}
		}
		//�ʼ� �Է� ��ü��
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyName", 
				"required");
		//�ʼ� �Է� ��й�ȣ
		ValidationUtils.rejectIfEmpty(errors, "companyPw", "required");
		//�ʼ� �Է� ��ü���̵�
		ValidationUtils.rejectIfEmpty(errors, "companyId", "required");
		//�ʼ� �Է� ����ڹ�ȣ
		ValidationUtils.rejectIfEmpty(errors, "companyRegNum", "required");
		//�ʼ� �Է� �ּ�
		ValidationUtils.rejectIfEmpty(errors, "companyAddr", "required");
		//�ʼ� �Է� ����ó
		ValidationUtils.rejectIfEmpty(errors, "companyPh", "required");
		//�ʼ� �Է� ��й�ȣ Ȯ��
		ValidationUtils.rejectIfEmpty(errors, "companyPwCon", "required");
		//��й�ȣ ��
		if(!comcom.getCompanyPw().isEmpty()){
			if(!comcom.isPwEqualToPwCon()) {
				errors.rejectValue("companyPw", "companyPwNoMatch");
			}
		}
		//���̵� Ajax���� �ϰ� ���۽� 
		if(comcom.getConfirmNum() != 0) {
			errors.rejectValue("companyId", "companyId");
		}
	}

}
