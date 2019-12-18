package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Youngup.NewComListCommand;
import Service.Youngup.NewCompanyService;

@Controller
public class NewComapnyController {
	@Autowired
	NewCompanyService newComSer;
	
	@RequestMapping("/youngup/newcompany") //���������� �ۼ����� ���� ��ü ����Ʈ �̱�
	public String newComList(Model model, HttpServletRequest request, NewComListCommand newComListCommand) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "Youngup/back";
		}
		newComSer.newCom(model);
		return "Main/youngupMain";
	}
	
	
	@RequestMapping(value="/youngup/newCompanyPro")
	public String newCompanyPro(NewComListCommand newComListCommand, Model model, Errors errors) {
		newComSer.newCompanyPro(newComListCommand,model,errors);
		return "Main/youngupMain";
	}
	
	
}
