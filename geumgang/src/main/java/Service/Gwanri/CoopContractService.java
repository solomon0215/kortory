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

import Command.Gwanri.CoopContractCommand;
import Command.Gwanri.ExpWriteCommand;
import Command.Youngup.ExplorNewWriteCommand;
import Model.CompanyDTO.CompanyAuth;
import Model.GwanriDTO.CoopContractDTO;
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
	
	public void coopList(Model model, HttpSession session) {
		List<CoopContractDTO> coop = gwanriSelectRepository.coopAllSelect();
				String authName = ((GwanriAuthInfo)session.getAttribute("authLog")).getName();
		model.addAttribute("authName", authName);
		model.addAttribute("coop", coop);
	}
	
	public Integer coopInsert(String companyId, CoopContractCommand ccc, HttpServletRequest request, HttpSession session, Model model) {
		CoopContractDTO ccdto = new CoopContractDTO();
		ExplorListDTO expdto = new ExplorListDTO();
		GwanriAuthInfo auth = (GwanriAuthInfo) request.getSession().getAttribute("authLog");
		expdto.setCompanyId(companyId);
		ccdto.setGwanRiNum(auth.getgwanRiNum());
		ccdto.setCompanySelectDate(ccdto.getCompanySelectDate());
		ccdto.setCoopConditionAvailDate(ccdto.getCoopConditionAvailDate());
		ccdto.setCoopConditionAvailTime(ccdto.getCoopConditionAvailTime());
		ccdto.setCoopConditionLimitPer(ccdto.getCoopConditionLimitPer());
		ccdto.setCoopContractCalDate(ccdto.getCoopContractCalDate());
		ccdto.setCoopContractDate(ccdto.getCoopContractDate());
		ccdto.setCoopContractEndDate(ccdto.getCoopContractEndDate());
		ccdto.setCoopContractMarRatio(ccdto.getCoopContractMarRatio());
		ccdto.setCoopContractMethod(ccdto.getCoopContractMethod());
		ccdto.setCoopContractNum(ccdto.getCoopContractNum());
		ccdto.setCoopContractRatio(ccdto.getCoopContractRatio());
		ccdto.setCoopContractSett(ccdto.getCoopContractSett());
		ccdto.setCoopContractState(ccdto.getCoopContractState());
		ccdto.setCoopContractSubject(ccdto.getCoopContractSubject());
		ccdto.setCoopContractSuppRatio(ccdto.getCoopContractSuppRatio());
		ccdto.setCoopContractWrite(ccdto.getCoopContractWrite());
		ccdto.setCoopKind(ccdto.getCoopKind());
		
		model.addAttribute("pageName", "../gwanri/CoopContract/coopContractList.jsp");
				
		return gwanriInsertRepository.coopInsert(ccdto,expdto);
		
	}
	public void coopDetail(Model model, Integer coopContractNum) {
		
		CoopContractDTO dto = new CoopContractDTO();
		dto.setCoopContractNum(coopContractNum);
		CoopContractDTO coop = gwanriSelectRepository.coopDetail(dto);
		model.addAttribute("coop", coop);
		// detail		
	}
	
	public void agreeModify(Model model, Integer coopContractNum) {
		CoopContractDTO dto = new CoopContractDTO();
		dto.setCoopContractNum(coopContractNum);
		int modify = gwanriUpdateRepository.coopModify(dto);
		model.addAttribute("modify", modify);
		}
	}
