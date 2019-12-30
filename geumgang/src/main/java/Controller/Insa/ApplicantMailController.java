package Controller.Insa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Insa.ApplicantOKService;



@Controller
@RequestMapping("applicantMail")
public class ApplicantMailController {
	@Autowired
	ApplicantOKService applicantOKService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Integer applicantMail(@RequestParam("num") String num, @RequestParam("applicant") String applicant,
			@RequestParam("name")String name) {
		Integer path = applicantOKService.updateCheck(num,applicant,name);
		return path;
	}

}
