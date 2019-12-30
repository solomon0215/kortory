package Service.Gwanri;



import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.List;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Command.Gwanri.ExpWriteCommand;
import Model.CompanyDTO.CompanyAuth;
import Model.GwanriDTO.AgreementConditionDTO;
import Model.GwanriDTO.ExpagreeDTO;
import Model.GwanriDTO.GwanriAuthInfo;
import Model.GwanriDTO.GwanriDTO;
import Model.InsaDTO.InsaAuthInfo;
import Model.InsaDTO.RecruitDTO;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Repository.Gwanri.GwanriInsertRepository;
import Repository.Gwanri.GwanriSelectRepository;
import Repository.Gwanri.GwanriUpdateRepository;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class CoopContractService {
	
	@Autowired
	GwanriInsertRepository gwanriInsertRepository;	
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	@Autowired
	GwanriUpdateRepository gwanriUpdateRepository;
	@Autowired
	private YoungupSelectRepository youngSelRepo;
	
	public void agreeList(Model model, HttpSession session) {
		List<AgreementConditionDTO> agreeList = gwanriSelectRepository.agreeAllSelect();
				String authName = ((GwanriAuthInfo)session.getAttribute("authLog")).getName();
		model.addAttribute("authName", authName);
		model.addAttribute("agree", agreeList);
	}
	
	public Integer agreeInsert(HttpServletRequest request, HttpSession session, Model model, String agreementConditionSubject, java.sql.Date agreementConditionDate, Integer agreementConditionSett, float agreementConditionRatio, Integer explorationNum) {
		ExpagreeDTO dto = new ExpagreeDTO();
		GwanriAuthInfo auth = (GwanriAuthInfo) request.getSession().getAttribute("authLog");
		dto.setGwanRiNum(auth.getgwanRiNum());
		dto.setAgreementConditionSubject(agreementConditionSubject);
		dto.setAgreementConditionDate(agreementConditionDate);
		dto.setAgreementConditionSett(agreementConditionSett);
		dto.setAgreementConditionRatio(agreementConditionRatio);
		dto.setExplorationNum(explorationNum);
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_list.jsp");
		gwanriInsertRepository.agreeInsert(dto);
		gwanriInsertRepository.expInsert(dto);
		
		return gwanriInsertRepository.agreeInsert(dto);
		
	}
	public void agreeDetail(Model model, Integer agreementConditionNum) {
		
		AgreementConditionDTO dto = new AgreementConditionDTO();
		dto.setAgreementConditionNum(agreementConditionNum);
		AgreementConditionDTO detail = gwanriSelectRepository.agreeDetail(dto);
		model.addAttribute("detail", detail);
		// detail		
	}
	
	public void agreeModify(Model model, Integer agreementConditionNum) {
		AgreementConditionDTO dto = new AgreementConditionDTO();
		dto.setAgreementConditionNum(agreementConditionNum);
		int modify = gwanriUpdateRepository.agreeModify(dto);
		model.addAttribute("modify", modify);
		}
	
	public void expList(Model model, HttpSession session) {
		ExplorListDTO dto = new ExplorListDTO();
		dto.setExplorationSubmit("YES");
		List<ExplorListDTO> complete = youngSelRepo.selectKindExp(dto); 
		model.addAttribute("complete", complete);
		}
	public void expDetail(Model model, Integer explorationNum) {
		System.out.println(explorationNum+"====================");
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(explorationNum);
		ExplorListDTO detail = gwanriSelectRepository.selectExpDetail(dto);
		model.addAttribute("detail", detail);
	}
	public void expDetail2(Model model, Integer explorationNum) {
		System.out.println(explorationNum+"====================");
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(explorationNum);
		ExplorListDTO detail2 = gwanriSelectRepository.selectExpDetail2(dto);
		model.addAttribute("detail2", detail2);
	}
	
	
	}
