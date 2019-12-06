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
	
	public void idConfirm(String userId,Errors errors) { //아이디 중복확인 메소드
		Integer confirm = companySelectRepository.idConfirm(userId);
		if(confirm > 0) {
			errors.rejectValue("companyId", "companyIdConfirm1"); //아이디가 있을때
		}else {
			errors.rejectValue("companyId", "companyIdConfirm2"); //아이디가 없을때
		}
	}
}
