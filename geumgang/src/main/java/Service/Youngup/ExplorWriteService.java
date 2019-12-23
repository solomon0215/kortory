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
	
	public void newExpWrite(Model model,Integer expNum) {//정보 검색 해오기
		ExplorationDTO dto = new ExplorationDTO(); 
		System.out.println(expNum+"------------------------------------------------");
		dto.setExplorationNum(expNum);
		ExplorListDTO detail = youngSelRepo.selectExpDetail(dto); //보고서 번호로 검색하기
		model.addAttribute("detail", detail);
	}
	
	public String newExpWritePro(ExplorNewWriteCommand explorNewWriteCommand,Model model,
		java.sql.Date explorationSchedule,Errors errors) {//일정 등록 하기
		System.out.println(explorNewWriteCommand.getExplorationNum()+"---------------------------------------");
		java.util.Date date = new Date(); //현재 날짜
		java.util.Date choise = new Date(explorationSchedule.getTime()); //등록하려는 날짜
		int i = date.compareTo(choise);
		if(i>0) { //현재 날짜가 선택날짜보다 클 경우
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
