package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.EvaluationCommand;
import Service.Insa.EvaluationService;

@Controller
public class EvaluationController {
	@Autowired
	EvaluationService evaluationService;
	
	@RequestMapping(value="/insa/evaluationPro", method=RequestMethod.POST) //인사고과 작성 메소드
	public String regist(EvaluationCommand ec, HttpSession session, HttpServletRequest request) {
		Integer result = evaluationService.regist(ec,session,request);
		if(result == 0) {
			return "insa/registFailed";
		}
		return "insa/registSuccess";
	}

}
