package Service.Youngup;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Youngup.NewComListCommand;
import Model.CompanyDTO.CompanyDTO;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Model.YoungupDTO.YoungupAuth;
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
		List<ExplorListDTO> expList = youngSelRepo.selectExplorList(); //��� ���� ���� �ҷ�����
		System.out.println(expList.size()+"-----------------------------------------------");
		List<CompanyDTO> newComList = companySelectRepository.selectNewCom(expList); //��ü ��Ͽ��� �˻� (���������� ���Ե��� �ʴ�)
		model.addAttribute("newComList", newComList);
		model.addAttribute("pageName", "../Youngup/newComList.jsp");
	}
	
	//�ڽ��� ��� ��ü�� �����ϱ�
	public String newCompanyPro(NewComListCommand newComListCommand,Model model,HttpServletRequest request) {// �ڽ��� ����ü�� �����ϱ�
		List<ExplorListDTO> expList = youngSelRepo.selectExplorList(); //��� ���� ���� �ҷ�����
		System.out.println("expList size"+expList.size()+"-------------------");
		List<ExplorationDTO> list =new ArrayList<ExplorationDTO>();//���θ��� ���� ��� ������ ������ ���� ����Ʈ
		List<String> str2= check(expList,newComListCommand); //�ٸ���� �������� �˻� �޼ҵ� ����
		if(str2 != null && str2.size() != 0) { //�ٸ� ��� ����� 
			model.addAttribute("over", str2);
			newCom(model);//�űԾ�ü ���� ��������
			return "Main/youngupMain";
		}else {
			YoungupAuth auth = (YoungupAuth)request.getSession().getAttribute("authLog"); //������ �������
			for(String company :newComListCommand.getCheck()) {                                          
				ExplorationDTO dto = new ExplorationDTO();
				dto.setCompanyId(company);
				dto.setYoungUpNum(auth.getYoungUpNum());
				dto.setExplorationSubmit("NEW");
				System.out.println(auth.getYoungUpNum()+""+auth.getYoungUpNum()+""+auth.getYoungUpNum()+""+auth.getYoungUpNum());
				list.add(dto);
			}
			Integer result = youngInRepo.insertExplor(list);
			model.addAttribute("result", result);
			model.addAttribute("pageName", "../Youngup/newComListPro.jsp");
			return "Main/youngupMain";
		}
	}
	
	public List<String> check(List<ExplorListDTO> expList ,NewComListCommand newComListCommand) { //�ٸ���� �������� üũ�ϴ� �޼ҵ�
		List<String> str2 = new ArrayList<String>();
		if(expList.isEmpty()) {
			return null;
		}
		for(ExplorListDTO expdto : expList) { //���������� ���Ե� ��ü���̵� ��������
			for(int i = 0 ; i< newComListCommand.getCheck().length ; i++) {                                          
				String str [] = newComListCommand.getCheck();
				System.out.println(str[i] + "-----------------------");
				if(expdto.getCompanyId().equals(str[i])){
					str2.add(str[i]) ;// ���࿡ ������ ��ü�� �̹� ���������� �ִٸ�
					continue;
				}
			}
		}
		return str2;
	}
}
