package Service.Youngup;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Youngup.ExplorNewWriteCommand;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Repository.Youngup.YoungupSelectRepository;
import Repository.Youngup.YoungupUpdateRepository;

@Service
public class ExplorWriteService {
	@Autowired
	YoungupSelectRepository youngSelRepo;
	@Autowired
	YoungupUpdateRepository youngUpRepo;
	
	public void newExpWrite(Model model,Integer expNum) {//���� �˻� �ؿ���
		ExplorationDTO dto = new ExplorationDTO(); 
		System.out.println(expNum+"------------------------------------------------");
		dto.setExplorationNum(expNum);
		ExplorListDTO detail = youngSelRepo.selectExpDetail(dto); //���� ��ȣ�� �˻��ϱ�
		model.addAttribute("detail", detail);
	}
	
	public String newExpWritePro(ExplorNewWriteCommand explorNewWriteCommand,Model model,
		java.sql.Date explorationSchedule,Errors errors) {//���� ��� �ϱ�
		System.out.println(explorNewWriteCommand.getExplorationNum()+"---------------------------------------");
		java.util.Date date = new Date(); //���� ��¥
		java.util.Date choise = new Date(explorationSchedule.getTime()); //����Ϸ��� ��¥
		int i = date.compareTo(choise);
		if(i>0) { //���� ��¥�� ���ó�¥���� Ŭ ���
			errors.rejectValue("explorationNum", "expScheduleBefore");
			model.addAttribute("pageName", "../Youngup/newExpWrite.jsp");
			newExpWrite(model, explorNewWriteCommand.getExplorationNum());
			return "Main/youngupMain";
		}
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(explorNewWriteCommand.getExplorationNum());
		dto.setExplorationSchedule(explorationSchedule);
		youngUpRepo.explorSchedule(dto);
		
		model.addAttribute("pageName", "../Youngup/newExpWritePro.jsp");
		return "Main/youngupMain";
	}
}
