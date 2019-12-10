package Service.Company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import Command.Company.CompanyFormCommand;
import Encrypt.Encrypt;
import Model.CompanyDTO.CompanyDTO;
import Repository.Company.CompanyInsertRepository;
import Repository.Company.CompanySelectRepository;

@Service
public class CompanyFormService {
	@Autowired
	CompanySelectRepository companySelectRepository;//select �������丮
	@Autowired
	CompanyInsertRepository companyInsertRepository;//insert �������丮
	
	private static final String id = "[a-z0-9]{6,16}"; //���̵��ۼ� ����
	private Pattern pattern;
	
	
	public Integer insert(CompanyFormCommand companyFormCommand) { // ��ü ��� �޼ҵ�
		//DTO�� ���
		CompanyDTO dto = new CompanyDTO();
		dto.setCompanyId(companyFormCommand.getCompanyId()); //�ƾƵ�
		String companyPw = Encrypt.getEncryption(companyFormCommand.getCompanyPw());//��й�ȣ ��ȣȭ
		dto.setCompanyPw(companyPw);//��й�ȣ
		dto.setCompanyAddr(companyFormCommand.getCompanyAddr());//�ּ�
		dto.setCompanyPh(companyFormCommand.getCompanyPh());//��ȭ��ȣ
		dto.setCompanyRegNum(companyFormCommand.getCompanyRegNum()); //����ڹ�ȣ
		dto.setCompanyName(companyFormCommand.getCompanyName());//��ü��
		dto.setCompanyAggApp(companyFormCommand.getCompanyAggApp());//��ü���� ���� ����
		dto.setCompanyPerApp(companyFormCommand.getCompanyPerApp()); //�������� ��ȣ ���� ���� ����
		dto.setCompanyType(companyFormCommand.getCompanyType());//��ü ����
		dto.setCompanyEmail(companyFormCommand.getCompanyEmail()); //��ü �̸����ּ�
		
		companyInsertRepository.companyInsert(dto);
		
		return companyInsertRepository.companyInsert(dto);
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
