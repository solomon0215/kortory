package Service.Youngup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Youngup.NewComListCommand;
import Model.CompanyDTO.CompanyDTO;
import Model.YoungupDTO.ExplorListDTO;
import Repository.Company.CompanySelectRepository;
import Repository.Youngup.YoungupInsertRepository;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class NewCompanyService {
	@Autowired
	YoungupSelectRepository youngSelRepo;
	@Autowired
	CompanySelectRepository companySelectRepository;
	@Autowired
	YoungupInsertRepository youngInRepo;
	
	//�űԾ�ü �ҷ����� �޼ҵ�
	public void newCom(Model model) {
		List<ExplorListDTO> expList = youngSelRepo.selectExplorList(new ExplorListDTO()); //��� ���� ���� �ҷ�����
		List<CompanyDTO> newComList = companySelectRepository.selectNewCom(expList); //��ü ��Ͽ��� �˻� (���������� ���Ե��� �ʴ�)
		model.addAttribute("newComList", newComList);
		model.addAttribute("pageName", "../Youngup/newComList.jsp");
	}
	
	//�ڽ��� ��� ��ü�� �����ϱ�
	public String newCompanyPro(NewComListCommand newComListCommand,Model model,Errors errors) {// �ڽ��� ����ü�� �����ϱ�
		boolean have = false;
		String str2="";
		List<ExplorListDTO> expList = youngSelRepo.selectExplorList(new ExplorListDTO()); //��� ���� ���� �ҷ�����
		
		//�ٸ������ ���� ������� ��츦 ����� �˰���
		for(ExplorListDTO expdto : expList) { //���������� ���Ե� ��ü���̵� ��������
			for(int i = 0 ; i< newComListCommand.getCheck().length ; i++) {                                          
				String str [] = newComListCommand.getCheck();
				if(expdto.getCompanyId().equals(str[i])){
					str2 += str[i]+":";
					have=true; // ���࿡ ������ ��ü�� �̹� ���������� �ִٸ� true
					continue;
				}
			}
		}
		if(have) {
			String [] overlap = str2.split(":");
			model.addAttribute("over", overlap);
			model.addAttribute("pageName", "../Youngup/newComList.jsp");
			return "Main/youngupMain";
		}else {
			
			model.addAttribute("pageName", "../Youngup/newComListPro.jsp");
			return "Main/youngupMain";
		}
	}
}
