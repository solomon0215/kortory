package Service.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Company.CompanySelectRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanySelectRepository companyBasicRepository;
	
	public Integer insert() { // ��ü ��� �޼ҵ�
		
		return null;
	}
	
	public Integer idConfirm() { //���̵� �ߺ�Ȯ�� �޼ҵ�
		
		return null;
	}
}
