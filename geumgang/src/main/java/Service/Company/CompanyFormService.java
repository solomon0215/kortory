package Service.Company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import Repository.Company.CompanySelectRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanySelectRepository companySelectRepository;
	private static final String id = "[a-z0-9]{6,16}"; //���̵��ۼ� ����
	private Pattern pattern;
	public Integer insert() { // ��ü ��� �޼ҵ�
		
		return null;
	}
	
	public String idConfirm(String userId) { //���̵� �ߺ�Ȯ�� �޼ҵ�
		Integer confirm = companySelectRepository.idConfirm(userId);
		pattern = Pattern.compile(id);
		Matcher matcher = pattern.matcher(userId); 
		System.out.println(matcher);
		if(!matcher.matches()) {
			return "Company/confrimId3"; //������ ���� ����
		}
		if(confirm > 0) {
			return "Company/confrimId1";//���̵� ����
		}else {
			return "Company/confrimId2"; // ��밡��
		}
	}
}
