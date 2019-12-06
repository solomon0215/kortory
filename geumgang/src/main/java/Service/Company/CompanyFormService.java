package Service.Company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import Command.Company.CompanyFormCommand;
import Encrypt.Encrypt;
import Model.CompanyDTO.CompanyDTO;
import Repository.Company.CompanySelectRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanySelectRepository companySelectRepository;
	@Autowired
	
	private static final String id = "[a-z0-9]{6,16}"; //���̵��ۼ� ����
	private Pattern pattern;
	public Integer insert(CompanyFormCommand companyFormCommand) { // ��ü ��� �޼ҵ�
		//DTO�� ���
		CompanyDTO dto = new CompanyDTO();
		dto.setCompanyId(companyFormCommand.getCompanyId());
		String companyPw = Encrypt.getEncryption(companyFormCommand.getCompanyPw());//��й�ȣ ��ȣȭ
		dto.setCompanyPw(companyPw);
		dto.setCompanyAddr(companyFormCommand.getCompanyAddr());
		dto.setCompanyPh(companyFormCommand.getCompanyPh());
		dto.setCompanyRegNum(companyFormCommand.getCompanyRegNum());
		dto.setCompanyName(companyFormCommand.getCompanyName());
		dto.setCompanyAggApp(companyFormCommand.getCompanyAggApp());
		dto.setCompanyPerApp(companyFormCommand.getCompanyPerApp());
		dto.setCompanyType(companyFormCommand.getCompanyType());
		dto.setCompanyEmail(companyFormCommand.getCompanyEmail());
		
		
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
