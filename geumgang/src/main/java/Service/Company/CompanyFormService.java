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
	
	public String idConfirm(String userId) { //���̵� �ߺ�Ȯ�� �޼ҵ�
		Integer confirm = companySelectRepository.idConfirm(userId);
		System.out.println("------------------------------------------------------------------------------" +confirm);
		if(confirm > 0) {
			return "Company/confrimId1";//���̵� ����
		}else {
			return "Company/confrimId2"; // ��밡��
		}
	}
}
