package Service.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import Repository.Company.CompanySelectRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanySelectRepository companySelectRepository;
	
	public Integer insert() { // 업체 등록 메소드
		
		return null;
	}
	
	public String idConfirm(String userId) { //아이디 중복확인 메소드
		Integer confirm = companySelectRepository.idConfirm(userId);
		System.out.println("------------------------------------------------------------------------------" +confirm);
		if(confirm > 0) {
			return "Company/confrimId1";//아이디 존재
		}else {
			return "Company/confrimId2"; // 사용가능
		}
	}
}
