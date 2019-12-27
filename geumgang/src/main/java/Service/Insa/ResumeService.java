package Service.Insa;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import Command.Insa.ResumeCommand;
import Model.InsaDTO.ResumeDTO;
import Repository.Insa.ResumeRepository;

public class ResumeService {
	@Autowired
	ResumeRepository resumeRepository;

	public Integer resumeRegist1(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		ResumeDTO resume = new ResumeDTO();
		session = request.getSession();
		resume.setResumeFile(rc.getFile());
		resume.setResumeNational(rc.getNational());
		resume.setResumeBohun(rc.getBohun());
		resume.setResumeDisoerder(rc.getDisorder());
		resume.setResumeArmy(rc.getArmy());
		resume.setResumeHighschool(rc.getHighschool());
		resume.setResumeUnivercity(rc.getUnivercity());
		resume.setResumeMajor(rc.getMajor());
		resume.setResumePoint(rc.getGradePoint());
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = dt.parse(rc.getSchoolStart1());
			java.sql.Date start1 = new java.sql.Date(date.getTime());
			resume.setSchoolStart1(start1);
			
			date = dt.parse(rc.getSchoolEnd1());
			java.sql.Date end1 = new java.sql.Date(date.getTime());
			resume.setSchoolEnd1(end1);
			
			date = dt.parse(rc.getSchoolStart2());
			java.sql.Date start2 = new java.sql.Date(date.getTime());
			resume.setSchoolStart2(start2);
			
			date = dt.parse(rc.getSchoolEnd2());
			java.sql.Date end2 = new java.sql.Date(date.getTime());
			resume.setSchoolEnd2(end2);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return resumeRepository.resumeInsert1(resume);
	}

}
