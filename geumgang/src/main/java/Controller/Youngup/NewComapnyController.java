package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Youngup.NewComListCommand;
import Service.Youngup.NewCompanyService;

@Controller
public class NewComapnyController {
	@Autowired
	NewCompanyService newComSer;
	
	@RequestMapping("/youngup/newcompany") //사전보고서가 작성되지 않은 업체 리스트 뽑기
	public String newComList(Model model, HttpServletRequest request, NewComListCommand newComListCommand) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "Youngup/back";
		}
		newComSer.newCom(model);
		return "Main/youngupMain";
	}
	
	
	@RequestMapping(value="/youngup/newCompanyPro",method = RequestMethod.POST)
	public String newCompanyPro(NewComListCommand newComListCommand, Model model, HttpServletRequest request) {
		if(newComListCommand.getCheck().length == 0) {//선택을 안했을때
			newComSer.newCom(model);
			model.addAttribute("msg", "선택하신 업체가 없어서 담당업무로 가져가지 못했어요"); //안내 메시지
			model.addAttribute("pageName", "../Youngup/newComList.jsp");
			return "Main/youngupMain";
		}
		newComSer.newCompanyPro(newComListCommand,model,request);
		return "Main/youngupMain";
	}
	
	
}
