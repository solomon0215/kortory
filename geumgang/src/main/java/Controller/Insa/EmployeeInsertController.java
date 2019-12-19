package Controller.Insa;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Insa.EmployeeCommand;
import Command.Insa.RecruitRegiCommand;
import Service.Insa.EmployeeInsertService;
import Validator.Insa.EmployeeCommandValidator;

@Controller
public class EmployeeInsertController {
	@Autowired
	EmployeeInsertService employeeInsertService;
	
	@RequestMapping(value="/insa/employeeRegiPro", method=RequestMethod.GET) //사원정보등록 이동
	public String employeeRegistView(Model model) {
		model.addAttribute("insaPage","../insa/employeeInfoInsert.jsp");
		return "insa/insaPage"; //jsp 경로
	}
	
	@RequestMapping(value="/insa/employeeRegiPro", method=RequestMethod.POST)
	public String employeeInsert(EmployeeCommand ec, Errors errors, Model model) {
		new EmployeeCommandValidator().validate(ec,errors);
		if(errors.hasErrors()) { //validator 검사
			return "redirect:/employeeInfoInsert";
		}
		Integer result = employeeInsertService.Insert(ec);
		if(result == null) { //아이디 중복 검사?
			errors.rejectValue("employeeId", "have");
			return "redirect:/employeeInfoInsert";
		}
		return "insa/employeeInsertComplete"; //완료시 이동 페이지
	}
	
	
}
