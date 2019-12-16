package Service.Insa;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Insa.RecruitRegiCommand;
import Model.InsaDTO.InsaAuthInfo;
import Model.InsaDTO.RecruitDTO;
import Repository.Insa.RecruitRepository;

@Service
public class RecruitRegiService {
	@Autowired
	RecruitRepository recruitRepository;

	public Integer recruitRegist(RecruitRegiCommand recruitCommand, HttpSession session) {
		RecruitDTO recruit = new RecruitDTO();
		recruit.setRecruitContent(recruitCommand.getRegiContent());
		recruit.setRecruitPerfer(recruitCommand.getRegiPrefer());
		recruit.setRecruitPersonnel(recruitCommand.getRegiPersonnel());
		recruit.setRecruitQualification(recruitCommand.getRegiQual());
		recruit.setRecruitCost(recruitCommand.getRegiCost());
		recruit.setInSaNum(((InsaAuthInfo)session.getAttribute("insaAuthInfo")).getInSaNum());
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = dt.parse(recruitCommand.getRegiDate());
			java.sql.Date regi = new java.sql.Date(date.getDate());
			recruit.setRecruitRegiDate(regi);
			date = dt.parse(recruitCommand.getEndDate());
			java.sql.Date end = new java.sql.Date(date.getDate());
			recruit.setRecruitEndDate(end);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return recruitRepository.recruitInsert(recruit);
		
	}

}