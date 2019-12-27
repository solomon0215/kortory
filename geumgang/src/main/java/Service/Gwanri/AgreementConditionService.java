package Service.Gwanri;



import java.util.List;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.GwanriDTO.AgreementConditionDTO;
import Model.GwanriDTO.GwanriAuthInfo;
import Model.GwanriDTO.GwanriDTO;
import Model.InsaDTO.InsaAuthInfo;
import Model.InsaDTO.RecruitDTO;
import Repository.Gwanri.GwanriInsertRepository;
import Repository.Gwanri.GwanriSelectRepository;

@Service
public class AgreementConditionService {
	
	@Autowired
	GwanriInsertRepository gwanriInsertRepository;
	
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	
	public void agreeList(Model model, HttpSession session) {
		List<AgreementConditionDTO> agreeList = gwanriSelectRepository.agreeAllSelect();
				String authName = ((GwanriAuthInfo)session.getAttribute("authLog")).getName();
		model.addAttribute("authName", authName);
		model.addAttribute("agree", agreeList);
	}
	
	public Integer agreeInsert(HttpServletRequest request, HttpSession session, Model model, String agreementConditionSubject, java.sql.Date agreementConditionDate, Integer agreementConditionSett, float agreementConditionRatio) {
		AgreementConditionDTO dto = new AgreementConditionDTO();
		GwanriAuthInfo auth = (GwanriAuthInfo) request.getSession().getAttribute("authLog");
		dto.setGwanRiNum(auth.getgwanRiNum());
		dto.setAgreementConditionSubject(agreementConditionSubject);
		dto.setAgreementConditionDate(agreementConditionDate);
		dto.setAgreementConditionSett(agreementConditionSett);
		dto.setAgreementConditionRatio(agreementConditionRatio);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_list.jsp");
		return gwanriInsertRepository.agreeInsert(dto);
		
	}
	@Transactional
	public void agreeDetail(Model model, Long agreementConditionNum) {
		
		AgreementConditionDTO dto = new AgreementConditionDTO();
		dto.setAgreementConditionNum(agreementConditionNum);
		AgreementConditionDTO detail = gwanriSelectRepository.agreeDetail(dto);
		model.addAttribute("detail", detail);
		// detail
		
	}
	}
