package Service.Youngup;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.multipart.MultipartFile;

import Command.Youngup.ExplorIncomWriteCommand;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Repository.Youngup.YoungupSelectRepository;
import Repository.Youngup.YoungupUpdateRepository;

@Service
public class ExplorIncomService {
	@Autowired
	YoungupSelectRepository youngSelRepo;
	@Autowired
	YoungupUpdateRepository youngUpRepo;
	
	String originalFileExtension = null;
	String store = null;
	
	
	//상세 보기
	public void incomExpDetail(Model model,Integer expNum) {
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(expNum);
		ExplorListDTO detail = youngSelRepo.selectExpDetail(dto);
		model.addAttribute("detail", detail);
	}
	
	//작성하기
	public String incomExpUpdate(ExplorIncomWriteCommand explorIncomWriteCommand,Model model,Errors errors,HttpServletRequest request) {
		String storeTotal = "";
		
		for(MultipartFile mf : explorIncomWriteCommand.getPicture()) {
			String original =  mf.getOriginalFilename();
			String check = 
					original.substring(original.lastIndexOf("."));
			System.out.println();
			System.out.println(check);
			System.out.println();
			if(check.equals(".jpg") || check.equals(".png")) { // jpg||png파일이 맞다면
				store =  UUID.randomUUID().toString().replaceAll(";","")
						+ check;
				storeTotal += store +";";
				
				String path = request.getServletContext().getRealPath("/");
				path += "view/Youngup/upload/";
				System.out.println();
				System.out.println(path);
				System.out.println();
				File file = new File(path + store);
				try {
					mf.transferTo(file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else { //파일 확장자가 다른 거면
				incomExpDetail(model,explorIncomWriteCommand.getExplorationNum());
				model.addAttribute("msg", "선택하신 파일 중 맞지 않는 형식이 있습니다.");
				model.addAttribute("pageName", "../Youngup/incomExpWrite.jsp");
				return "Main/youngupMain";
			}
		}
		ExplorationDTO dto = new ExplorationDTO();
		String availTime = explorIncomWriteCommand.getStartTime() +"~"+explorIncomWriteCommand.getEndTime(); //데이터베이스에 맞게 만들기
		String availDate = explorIncomWriteCommand.getStartDate() +"~"+explorIncomWriteCommand.getEndDate();//데이터베이스에 맞게 만들기
		dto.setExplorationAvailTime(availTime); //사용 가능 시간
		dto.setExplorationAvailDate(availDate); //사용 가능 날짜 
		dto.setExplorationFile(storeTotal);
		dto.setExplorationNum(explorIncomWriteCommand.getExplorationNum());
		dto.setExplorationType(explorIncomWriteCommand.getExplorationType());
		java.sql.Date effect =  java.sql.Date.valueOf(explorIncomWriteCommand.getExplorationEffect());
		System.out.println(effect+"---------------");
		dto.setExplorationEffect(effect);
		dto.setExplorationManaName(explorIncomWriteCommand.getExplorationManaName());
		dto.setExplorationAvailHoli(explorIncomWriteCommand.getExplorationAvailHoli());
		dto.setExplorationLimitAge(explorIncomWriteCommand.getExplorationLimitAge());
		dto.setExplorationLimitPer(explorIncomWriteCommand.getExplorationLimitPer());
		dto.setExplorationCondition(explorIncomWriteCommand.getExplorationCondition());
		if(explorIncomWriteCommand.getChoise() == 1) {
			dto.setExplorationSubmit("YES");
		}else {
			dto.setExplorationSubmit("NOT");
		}
		
		Integer result = youngUpRepo.explorUpdate(dto);
		if(result >0 ) {
			model.addAttribute("docu", dto);
			model.addAttribute("pageName", "../Youngup/incomExpWritePro.jsp");
			return "Main/youngupMain";
		}else {
			incomExpDetail(model,explorIncomWriteCommand.getExplorationNum());
			model.addAttribute("failed", "업로드에 실패하였습니다. 잠시후 다시 시도 해주세요.");
			model.addAttribute("pageName", "../Youngup/incomExpWrite.jsp");
			return "Main/youngupMain";
		}
	
	}
}
