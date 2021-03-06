package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Insa.ResumeCommand;
import Command.User.UserLogCommand;
import Model.UserDTO.UserDTO;
import Service.Insa.ApplicantMailService;
import Service.Insa.ResumeService;

@Controller
public class ResumeController {
	@Autowired
	ResumeService resumeService;
	@Autowired
	ApplicantMailService applicantMailService;

	@RequestMapping(value = "/insa/resumeList", method = RequestMethod.GET) // 이력서 목록 include
	public String resumeList(ResumeCommand rc, Model model, HttpSession session) {
		resumeService.resumeSelect(model, session);
		model.addAttribute("insaPage", "../insa/resumeList.jsp");
		return "insa/insaPage";
	}

	@RequestMapping(value = "/user/apply", method = RequestMethod.GET) // 이력서메인 include
	public String resumeMain(Model model) {
		model.addAttribute("userPage", "../User/resumeMain.jsp");
		return "User/userMain";
	}

	@RequestMapping(value = "/user/resume1", method = RequestMethod.GET) // 이력서1 include
	public String resume1(ResumeCommand rc, Model model) {
		model.addAttribute("rc", rc);
		model.addAttribute("userPage", "../User/resume1.jsp");
		return "User/userMain";
	}

	@RequestMapping(value = "/user/resume2", method = RequestMethod.GET) // 이력서2 include
	public String resume2(ResumeCommand rc, Model model) {
		model.addAttribute("userPage", "../User/resume2.jsp");
		return "User/userMain";
	}

	@RequestMapping(value = "/user/resumeInsert1", method = RequestMethod.POST) // 이력서1 작성메소드
	public String resume1Write(@ModelAttribute("rc") ResumeCommand rc, HttpSession session, HttpServletRequest request, Model model) {
		Integer result = resumeService.resumeRegist1(rc, session, request);
		model.addAttribute("userPage","../User/save.jsp");
		return "User/userMain";
	}

	@RequestMapping(value = "/user/resumeInsert2", method = RequestMethod.POST) // 이력서 2 작성 메소드
	public String resume2Write(@ModelAttribute("rc") ResumeCommand rc, HttpSession session, HttpServletRequest request, Model model) {
		Integer result1 = resumeService.resumeRegist2(rc, session, request);
		model.addAttribute("userPage","../User/save.jsp");
		return "User/userMain";
	}

	@RequestMapping(value = "/insa/resumeDetailView") // 이력서 상세보기
	public String recruitDetail(@RequestParam(value = "num", required = false) Integer resumeNum, Model model) {
		resumeService.resumeDetail(model, resumeNum);
		model.addAttribute("insaPage", "../insa/resumeDetail.jsp");
		return "insa/insaPage";
	}

	@RequestMapping(value = "/insa/sendEmail") // 합격자 이메일 통보 실행창
	public String sendEmail(Model model, @RequestParam(value = "userId") String userId) {
		UserDTO dto = new UserDTO();
		dto.setUserId(userId);
		String userEmail = resumeService.findUserEmail(dto, model);
		applicantMailService.sendMail(userEmail, userId);

		model.addAttribute("insaPage", "../insa/sendEmail.jsp");
		return "insa/insaPage";
	}

}
