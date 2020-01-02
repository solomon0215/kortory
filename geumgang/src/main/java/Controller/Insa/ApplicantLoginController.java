package Controller.Insa;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.User.UserLogCommand;
import Service.Insa.ApplicantLogService;
import Validator.User.UserLogCommandValidator;

@Controller
public class ApplicantLoginController {
	@Autowired
	ApplicantLogService applicantLogService;
	
	@RequestMapping(value = "/insa/applicantLogin") //��ũ�� �α��� (�ش� �հ��� ���̵� ����)
	public String applicantLogin(@RequestParam(value = "userId") String userId, UserLogCommand userLogCommand, Model model) {
		
		model.addAttribute("pageName","../insa/applicantLogin.jsp");
		return "Main/basicMain";
	}
	
	@RequestMapping(value = "/insa/applicantLogPro") //�α��� ���� �� �ٷΰ�༭ ����
	public String applicantLogPro(UserLogCommand userLogCommand, Model model, HttpSession session) {
		
		model.addAttribute("pageName","../insa/applicantContract.jsp");
		return "insa/applicantContract";
	}
	
}
