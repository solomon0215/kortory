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
	
	@RequestMapping("/youngup/newcompany") //���������� �ۼ����� ���� ��ü ����Ʈ �̱�
	public String newComList(Model model, HttpServletRequest request, NewComListCommand newComListCommand) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "Youngup/back";
		}
		newComSer.newCom(model);
		return "Main/youngupMain";
	}
	
	
	@RequestMapping(value="/youngup/newCompanyPro",method = RequestMethod.POST)
	public String newCompanyPro(NewComListCommand newComListCommand, Model model, HttpServletRequest request) {
		if(newComListCommand.getCheck().length == 0) {//������ ��������
			newComSer.newCom(model);
			model.addAttribute("msg", "�����Ͻ� ��ü�� ��� �������� �������� ���߾��"); //�ȳ� �޽���
			model.addAttribute("pageName", "../Youngup/newComList.jsp");
			return "Main/youngupMain";
		}
		newComSer.newCompanyPro(newComListCommand,model,request);
		return "Main/youngupMain";
	}
	
	
}
