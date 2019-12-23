package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Youngup.ExplorNewWriteCommand;
import Service.Youngup.ExplorWriteService;

@Controller
public class ExplorWriteController {
	@Autowired
	ExplorWriteService expWriteSer;
	
	@RequestMapping("/youngup/explorNewWirte") //신규업체 사전답사 보고서 작성 페이지 가기
	public String newWrite(ExplorNewWriteCommand explorNewWriteCommand,Model model,HttpServletRequest request,Errors errors,
			@RequestParam(value = "expNum") Integer expNum) {
		if(request.getSession().getAttribute("authLog") == null) { //로그인 확인
			return "Youngup/back";
		}
		expWriteSer.newExpWrite(model,expNum);
		model.addAttribute("pageName", "../Youngup/newExpWrite.jsp");
		return "Main/youngupMain";
	}
	
	//일정 등록
	@RequestMapping(value="/youngup/explorNewWirtePro",method = RequestMethod.POST) 
	public String newWritePro(ExplorNewWriteCommand explorNewWriteCommand,Model model,HttpServletRequest request,Errors errors,
			@RequestParam(value = "explorationSchedule") java.sql.Date explorationSchedule) {
		System.out.println("controller--------------------"+explorNewWriteCommand.getExplorationNum());
		if(request.getSession().getAttribute("authLog") == null) { //로그인 확인
			return "Youngup/back";
		}
		return expWriteSer.newExpWritePro(explorNewWriteCommand,model,explorationSchedule,errors);
	}
}
