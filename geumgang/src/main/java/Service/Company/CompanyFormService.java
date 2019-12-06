package Service.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Company.CompanyBasicRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanyBasicRepository companyBasicRepository;
	
	public Integer insert() { //companyinsert method
		
		return null;
	}
	
	public Integer idConfirm() { //id confirm method
		
		return null;
	}
}
