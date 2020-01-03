package Service.Youngup;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Model.YoungupDTO.YoungupAuth;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class YoungupScheduleService {

	@Autowired
	YoungupSelectRepository youngSelRepo;
	
	//일정을 구하는 메소드
	public void week(Model model, Integer week,HttpServletRequest request) {
		java.util.Date nowDate = new java.util.Date();
		if(week != 0) {
			long start = week*24*60*60*1000;
			nowDate = new java.util.Date(start);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String choiseDay1 = sdf.format(nowDate);
		model.addAttribute("choiseDay1", choiseDay1); //현재날짜 출력용
		java.sql.Date todayDate = new java.sql.Date(nowDate.getTime());
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationSchedule(todayDate);
		YoungupAuth auth = (YoungupAuth)request.getSession().getAttribute("authLog");
		dto.setYoungUpNum(auth.getYoungUpNum());
		for(int i = 0;i<7;i++) { //7일의 일정 구하기
			Long plus = (long) (i*24*60*60*1000); //더할 시간
			if(i != 0) { //첫번째는 선택한 날짜
				java.util.Date newDate = new java.util.Date(plus); 
				java.sql.Date date = new java.sql.Date(newDate.getTime()); 
				dto.setExplorationSchedule(date);
			}
			String name = "workingDay" + i;
			System.out.println(name);
			List<ExplorListDTO> list = youngSelRepo.incomSchedule(dto);
			model.addAttribute(name, list);
		}
		
		
		
	}
}
