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
	private static final String id = "[a-z0-9]{6,16}"; //아이디작성 패턴
	private Pattern pattern;
	public Integer insert() { // 업체 등록 메소드
		
		return null;
	}
	
	public String idConfirm(String userId) { //아이디 중복확인 메소드
		Integer confirm = companySelectRepository.idConfirm(userId);
		pattern = Pattern.compile(id);
		Matcher matcher = pattern.matcher(userId); 
		System.out.println(matcher);
		if(!matcher.matches()) {
			return "Company/confrimId3"; //패턴이 맞지 않음
		}
		if(confirm > 0) {
			return "Company/confrimId1";//아이디 존재
		}else {
			return "Company/confrimId2"; // 사용가능
		}
	}
}
