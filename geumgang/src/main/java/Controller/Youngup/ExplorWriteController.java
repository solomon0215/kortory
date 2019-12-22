package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Youngup.ExplorNewWriteCommand;
import Service.Youngup.ExplorWriteService;

@Controller
public class ExplorWriteController {
	@Autowired
	ExplorWriteService expWriteSer;
	
	@RequestMapping("/youngup/explorNewWirte") //�űԾ�ü ������� ���� �ۼ� ������ ����
	public String newWrite(ExplorNewWriteCommand explorNewWriteCommand,Model model,HttpServletRequest request,Errors errors,
			@RequestParam(value = "expNum") Integer expNum) {
		if(request.getSession().getAttribute("authLog") == null) { //�α��� Ȯ��
			return "Youngup/back";
		}
		expWriteSer.newExpWrite(model,expNum);
		model.addAttribute("pageName", "../Youngup/newExpWrite.jsp");
		return "Main/youngupMain";
	}
	
}
