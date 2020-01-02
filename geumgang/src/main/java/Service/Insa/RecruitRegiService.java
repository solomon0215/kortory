package Service.Insa;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Insa.RecruitRegiCommand;
import Model.InsaDTO.InsaAuthInfo;
import Model.InsaDTO.RecruitDTO;
import Repository.Insa.RecruitRepository;

@Service
public class RecruitRegiService {
	@Autowired
	RecruitRepository recruitRepository;

	public Integer recruitRegist(RecruitRegiCommand recruitCommand, HttpSession session, HttpServletRequest request) {
		RecruitDTO recruit = new RecruitDTO();
		session = request.getSession();
		recruit.setRecruitTitle(recruitCommand.getRegiTitle());
		recruit.setRecruitContent(recruitCommand.getRegiContent().getBytes());
		recruit.setRecruitPrefer(recruitCommand.getRegiPrefer());
		recruit.setRecruitPersonnel(recruitCommand.getRegiPersonnel());
		recruit.setRecruitQualification(recruitCommand.getRegiQual());
		recruit.setRecruitCost(recruitCommand.getRegiCost());
		recruit.setInSaNum(((InsaAuthInfo)session.getAttribute("authLog")).getInSaNum());
		
		String  str = new String(recruit.getRecruitContent());//바이트를 문자로 해석하여 저장
		System.out.println(str);
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = dt.parse(recruitCommand.getRegiDate());
			java.sql.Date regi = new java.sql.Date(date.getTime());
			recruit.setRecruitRegiDate(regi);
			date = dt.parse(recruitCommand.getEndDate());
			java.sql.Date end = new java.sql.Date(date.getTime());
			recruit.setRecruitEndDate(end);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return recruitRepository.recruitInsert(recruit);
		
	}

	public void recruitSelect(Model model, HttpSession session) {
		List<RecruitDTO> recruitList = recruitRepository.recruitAllSelect();
		/*for(RecruitDTO c : recruitList) {
			System.out.println(c.getRecruitTitle());
		}*/
		String authName = ((InsaAuthInfo)session.getAttribute("authLog")).getName();
		
		model.addAttribute("authName", authName);
		model.addAttribute("recruit",recruitList);
	}

	public void recruitDetail(Model model, Integer recruitNum) {
		RecruitDTO dto = new RecruitDTO();
		dto.setRecruitNum(recruitNum);
		RecruitDTO detail = recruitRepository.recruitDetail(dto); 
		String recruitContent = new String(detail.getRecruitContent());//blob 타입 상세보기
		System.out.println("recruitContent : " + recruitContent);
		model.addAttribute("detail",detail);
		model.addAttribute("recruitContent",recruitContent);
	}


}