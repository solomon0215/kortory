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
	
	ResumeDTO resume = new ResumeDTO();
	SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
	
	
	//이력서 1
	public Integer resumeRegist1(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		
		session = request.getSession();
		resume.setResumeFile(rc.getFile());
		resume.setResumeNational(rc.getNational());
		resume.setResumeBohun(rc.getBohun());
		resume.setResumeDisorder(rc.getDisorder());
		resume.setResumeArmy(rc.getArmy());
		resume.setResumeHighschool(rc.getHighschool());
		resume.setResumeUnivercity(rc.getUnivercity());
		resume.setResumeMajor(rc.getMajor());
		resume.setResumePoint(rc.getPoint());
		
		//String타입 date로 변환
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
	
	//이력서2
	public Integer resumeRegist2(ResumeCommand rc, HttpSession session, HttpServletRequest request) {
		session = request.getSession();
		resume.setResumeExpOver(rc.getExpOver());
		resume.setResumeLanguage(rc.getLanguage());
		resume.setResumegrade(rc.getGrade());
		resume.setResumeLicense(rc.getLicense());
		resume.setFormerWork(rc.getFormerWork());
		resume.setFormerPosition(rc.getFormerPosition());
		resume.setFormerSalary(rc.getFormerSalary());
		resume.setFormerTask(rc.getFormerTask());
		resume.setFormerIntro(rc.getFormerIntro());
		
		//String타입 date로 변환
		try {
			Date date = dt.parse(rc.getFormerStart());
			java.sql.Date start = new java.sql.Date(date.getTime());
			resume.setFormerStart(start);
			
			date = dt.parse(rc.getFormerEnd());
			java.sql.Date end = new java.sql.Date(date.getTime());
			resume.setFormerEnd(end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resumeRepository.resumeInsert2(resume);
	}
	
  

}
