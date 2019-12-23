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
import Validator.Youngup.ExplorIncomWriteCommandValidator;

@Controller
public class ExplorIncomController {
	@Autowired
	ExplorIncomService expInSer;
	
	//�󼼺���
	@RequestMapping("/youngup/explorIncomDetail") 
	public String incomExpDetail(Model model,HttpServletRequest request,
			@RequestParam(value = "expNum") Integer expNum) {
		if(request.getSession().getAttribute("authLog") == null) { //�α��� Ȯ��
			return "Youngup/back";
		}
		expInSer.incomExpDetail(model,expNum);
		model.addAttribute("pageName", "../Youngup/incomExpDetail.jsp");
		return "Main/youngupMain";
	}
	
	//������� ���� �ۼ������� 
	@RequestMapping("/youngup/incomExpWrite") 
	public String incomExpWrite(ExplorIncomWriteCommand explorIncomWriteCommand,Model model,HttpServletRequest request,Errors errors,
			@RequestParam(value = "expNum") Integer expNum) {
		if(request.getSession().getAttribute("authLog") == null) { //�α��� Ȯ��
			return "Youngup/back";
		}
		expInSer.incomExpDetail(model,expNum);
		model.addAttribute("pageName", "../Youngup/incomExpWrite.jsp");
		return "Main/youngupMain";
	}
	
	//������� ���� �ۼ� ����
	@RequestMapping(value= "/youngup/incomExpWritePro", method = RequestMethod.POST) 
	public String incomExpWritePro(ExplorIncomWriteCommand explorIncomWriteCommand,Model model,Errors errors,HttpServletRequest req) {
		if(req.getSession().getAttribute("authLog") == null) { //�α��� Ȯ��
			return "Youngup/back";
		}
		new ExplorIncomWriteCommandValidator().validate(explorIncomWriteCommand, errors);
		if(errors.hasErrors()) {
			expInSer.incomExpDetail(model,explorIncomWriteCommand.getExplorationNum());
			model.addAttribute("pageName", "../Youngup/incomExpWrite.jsp");
			return "Main/youngupMain";
		}
		
		expInSer.incomExpUpdate(explorIncomWriteCommand,model,errors);
		return "Main/youngupMain";
	}
	
	
	
}
