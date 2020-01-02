package Service.Youngup;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.YoungupDTO.ExplorationDTO;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class YoungupMainService {
	@Autowired
	YoungupSelectRepository youngSelRepo;

	public void workingState(Model model) {// 오늘의 업무 현황 가져오기
		java.util.Date today = new java.util.Date();
		java.sql.Date dbToday = new java.sql.Date(today.getTime());
		ExplorationDTO searchDto = new ExplorationDTO();
		searchDto.setExplorationSchedule(dbToday);
		Integer incomeCount = youngSelRepo.selectToday(searchDto); // 총업무량
		searchDto.setExplorationSubmit("YES");
		Integer nowIncom = youngSelRepo.selectToday(searchDto); // 남은 업무량
		model.addAttribute("nowIncom", nowIncom); // 남은업무
		model.addAttribute("incomeCount", incomeCount); // 총업무
		if (incomeCount == 0) { // 할당량 업무가 없다면
			model.addAttribute("incomPer", 100); // 미완료 사전답사 보고 업무 현황
		} else { // 만약 있다면
			Integer total = incomeCount;
			double i = 100 / total; // 100나누기 업무량 기준이 되는 퍼센트
			double j = incomeCount * i; // 현재 남은량 곱하기 기준퍼센트 = 현재 남은 업무
			double per = 100 - j; // 100 - 현재남은 업무 = 업무 진행도
			model.addAttribute("incomPer", per);
		}
	}

}
