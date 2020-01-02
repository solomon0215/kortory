package Service.Insa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Insa.EvaluationCommand;
import Model.InsaDTO.EvaluationDTO;
import Model.InsaDTO.InsaAuthInfo;
import Repository.Insa.EvaluationRepository;

@Service
public class EvaluationService {
	@Autowired
	EvaluationRepository evaluationRepository;

	public Integer regist(EvaluationCommand ec, HttpSession session, HttpServletRequest request) {
		EvaluationDTO dto = new EvaluationDTO();
		session = request.getSession();
		dto.setConNum(ec.getConNum());
		dto.setAchive(ec.getAchive());
		dto.setQuality(ec.getQuality());
		dto.setImprove(ec.getImprove());
		dto.setKnowledge(ec.getKnowledge());
		dto.setCreativity(ec.getCreativity());
		dto.setJudgement(ec.getJudgement());
		dto.setPractical(ec.getPractical());
		dto.setResponsibility(ec.getResponsibility());
		dto.setCoop(ec.getCoop());
		dto.setAtti(ec.getAtti());
		dto.setDili(ec.getDili());
		dto.setGraduate(ec.getGraduate());
		dto.setInSaNum(((InsaAuthInfo)session.getAttribute("authLog")).getInSaNum());
		
		return evaluationRepository.evaluationInsert(dto);
		
		
		
	}

}
