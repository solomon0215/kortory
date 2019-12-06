package Service.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Company.CompanySelectRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanySelectRepository companyBasicRepository;
	
	public Integer insert() { // 업체 등록 메소드
		
		return null;
	}
	
	public Integer idConfirm() { //아이디 중복확인 메소드
		
		return null;
	}
}
