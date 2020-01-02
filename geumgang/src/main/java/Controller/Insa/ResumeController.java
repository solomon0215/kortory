package Controller.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping(value = "/insa/resumeList", method = RequestMethod.GET) // �̷¼� ��� include
	public String resumeList(ResumeCommand rc, Model model, HttpSession session) {
		resumeService.resumeSelect(model, session);
		model.addAttribute("insaPage", "../insa/resumeList.jsp");
		return "insa/insaPage";
	}

	@RequestMapping(value = "/user/apply", method = RequestMethod.GET) // �̷¼����� include
	public String resumeMain(Model model) {
		model.addAttribute("userPage", "../User/resumeMain.jsp");
		return "User/userMain";
	}

	@RequestMapping(value = "/user/resume1", method = RequestMethod.GET) // �̷¼�1 include
	public String resume1(ResumeCommand rc, Model model) {
		model.addAttribute("rc", rc);
		model.addAttribute("userPage", "../User/resume1.jsp");
		return "User/userMain";
	}

	@RequestMapping(value = "/user/resume2", method = RequestMethod.GET) // �̷¼�2 include
	public String resume2(ResumeCommand rc, Model model) {
		model.addAttribute("userPage", "../User/resume2.jsp");
		return "User/userMain";
	}

	@RequestMapping(value = "/user/resumeInsert1", method = RequestMethod.POST) // �̷¼�1 �ۼ��޼ҵ�
	public String resume1Write(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		Integer result = resumeService.resumeRegist1(rc, session, request);
		return "insa/resume1";
	}

	@RequestMapping(value = "/user/resumeInsert2", method = RequestMethod.POST) // �̷¼� 2 �ۼ� �޼ҵ�
	public String resume2Write(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		Integer result = resumeService.resumeRegist2(rc, session, request);
		return "insa/resume2";
	}

	@RequestMapping(value = "/insa/resumeDetailView") // �̷¼� �󼼺���
	public String recruitDetail(@RequestParam(value = "num", required = false) Integer resumeNum, Model model) {
		resumeService.resumeDetail(model, resumeNum);
		model.addAttribute("insaPage", "../insa/resumeDetail.jsp");
		return "insa/insaPage";
	}

	@RequestMapping(value = "/insa/sendEmail") // �հ��� �̸��� �뺸 ����â
	public String sendEmail(Model model, @RequestParam(value = "userId") String userId) {
		UserDTO dto = new UserDTO();
		dto.setUserId(userId);
		String userEmail = resumeService.findUserEmail(dto, model);
		applicantMailService.sendMail(userEmail, userId);

		model.addAttribute("insaPage", "../insa/sendEmail.jsp");
		return "insa/insaPage";
	}

}
