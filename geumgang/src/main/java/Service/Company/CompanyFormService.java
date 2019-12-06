package Service.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import Repository.Company.CompanySelectRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanySelectRepository companySelectRepository;
	
	public Integer insert() { // ��ü ��� �޼ҵ�
		
		return null;
	}
	
	public void idConfirm(String userId,Errors errors) { //���̵� �ߺ�Ȯ�� �޼ҵ�
		Integer confirm = companySelectRepository.idConfirm(userId);
		if(confirm > 0) {
			errors.rejectValue("companyId", "companyIdConfirm1"); //���̵� ������
		}else {
			errors.rejectValue("companyId", "companyIdConfirm2"); //���̵� ������
		}
	}
}
