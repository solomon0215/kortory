package Service.Insa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Command.Insa.ResumeCommand;
import Model.InsaDTO.*;
import Model.UserDTO.UserAuth;
import Repository.Insa.ResumeRepository;

public class ResumeService {
	@Autowired
	ResumeRepository resumeRepository;
	
	ResumeDTO resume = new ResumeDTO();
	
	//이력서 1
	public Integer resumeRegist1(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		
		session = request.getSession();
		resume.setUserId(((UserAuth)session.getAttribute("authLog")).getId());
		resume.setResumeFile(rc.getFile());
		resume.setResumeNational(rc.getNational());
		resume.setResumeBohun(rc.getBohun());
		resume.setResumeDisorder(rc.getDisorder());
		resume.setResumeArmy(rc.getArmy());
		resume.setResumeHighschool(rc.getHighschool());
		resume.setSchoolStart1(rc.getSchoolStart1());
		resume.setSchoolEnd1(rc.getSchoolEnd1());
		resume.setSchoolStart2(rc.getSchoolStart2());
		resume.setSchoolEnd2(rc.getSchoolEnd2());
		resume.setResumeUnivercity(rc.getUnivercity());
		resume.setResumeMajor(rc.getMajor());
		resume.setResumePoint(rc.getPoint());
		
				
		return resumeRepository.resumeInsert1(resume);
	}
	
	//이력서2
	public Integer resumeRegist2(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		session = request.getSession();
		resume.setResumeExpOver(rc.getExpOver());
		resume.setResumeLanguage(rc.getLanguage());
		resume.setResumeGrade(rc.getGrade());
		resume.setResumeLicense(rc.getLicense());
		resume.setFormerWork(rc.getFormerWork());
		resume.setFormerPosition(rc.getFormerPosition());
		resume.setFormerSalary(rc.getFormerSalary());
		resume.setFormerTask(rc.getFormerTask());
		resume.setFormerIntro(rc.getFormerIntro());
		resume.setFormerStart(rc.getFormerStart());
		resume.setFormerEnd(rc.getFormerEnd());
		
		
		return resumeRepository.resumeInsert2(resume);
	}

	//이력서 목록
	public void resumeSelect(Model model, HttpSession session) {
		List<ApplicantDTO> resumeList = resumeRepository.resumeAllSelect();
		System.out.println("아이구");
		model.addAttribute("resume",resumeList);
	}

	//이력서 상세보기
	public void resumeDetail(Model model, Integer resumeNum) {
		ResumeDTO dto = new ResumeDTO();
		dto.setResumeNum(resumeNum);
		ResumeDTO detail = resumeRepository.resumeDetail(dto);
		model.addAttribute("detail",detail);
		
	}
	
  

}
