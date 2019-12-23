package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Youngup.ExplorIncomWriteCommand;
import Service.Youngup.ExplorIncomService;

@Controller
public class ExplorIncomController {
	@Autowired
	ExplorIncomService expInSer;
	
	//상세보기
	@RequestMapping("/youngup/explorIncomDetail") 
	public String incomExpDetail(Model model,HttpServletRequest request,
			@RequestParam(value = "expNum") Integer expNum) {
		if(request.getSession().getAttribute("authLog") == null) { //로그인 확인
			return "Youngup/back";
		}
		expInSer.incomExpDetail(model,expNum);
		model.addAttribute("pageName", "../Youngup/incomExpDetail.jsp");
		return "Main/youngupMain";
	}
	
	//사전답사 내용 작성
	@RequestMapping("/youngup/incomExpWrite") 
	public String incomExpWrite(ExplorIncomWriteCommand explorIncomWriteCommand,Model model,HttpServletRequest request,Errors errors,
			@RequestParam(value = "expNum") Integer expNum) {
		if(request.getSession().getAttribute("authLog") == null) { //로그인 확인
			return "Youngup/back";
		}
		expInSer.incomExpDetail(model,expNum);
		model.addAttribute("pageName", "../Youngup/incomExpWrite.jsp");
		return "Main/youngupMain";
	}
	@RequestMapping(value= "/youngup/incomExpWritePro", method = RequestMethod.POST) 
	public String incomExpWritePro(ExplorIncomWriteCommand explorIncomWriteCommand) {
		System.out.println(explorIncomWriteCommand.getStartTime());
		System.out.println(explorIncomWriteCommand.getEndTime());
		System.out.println(explorIncomWriteCommand.getStartDate());
		System.out.println(explorIncomWriteCommand.getEndDate());
		System.out.println(explorIncomWriteCommand.getExploration_avail_holi());
		return "Main/youngupMain";
	}
	
	
	
}
