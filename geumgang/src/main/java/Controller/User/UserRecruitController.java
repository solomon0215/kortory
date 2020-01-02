package Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Insa.RecruitRegiCommand;
import Service.User.UserRecruitService;

@Controller
public class UserRecruitController {
	@Autowired
	UserRecruitService userRecruitService;
	
	@RequestMapping(value="/user/recruitList", method=RequestMethod.GET)
	public String recruitList(RecruitRegiCommand rc, Model model) {
		userRecruitService.recruitSelect(model);
		model.addAttribute("userPage","../user/recruitList.jsp");
		return "User/userMain";
	}

}
