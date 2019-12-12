package Service.Insa;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
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

	public Integer recruitRegist(RecruitRegiCommand recruitCommand, HttpServletRequest request,
			HttpSession session) {
		RecruitDTO recruit = new RecruitDTO();
		recruit.setRecruitContent(recruitCommand.getRegiContent());
		recruit.setRecruitPerfer(recruitCommand.getRegiPrefer());
		recruit.setRecruitPersonnel(recruitCommand.getRegiPersonnel());
		recruit.setRecruitQualification(recruitCommand.getRegiQual());
		recruit.setRecruitRegiDate((Date)recruitCommand.getRegiDate());
		recruit.setRecruitEndDate((Date)recruitCommand.getEndDate());
		recruit.setRecruitCost(recruitCommand.getRegiCost());
		recruit.setInSaNum(((InsaAuthInfo)session.getAttribute("insaAuthInfo")).getInSaNum());
		return recruitRepository.recruitInsert(recruit);
		
	}

}