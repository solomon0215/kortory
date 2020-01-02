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
	
	public Integer coopInsert(CoopContractCommand ccc, HttpServletRequest request, HttpSession session, Model model) {
		CoopContractDTO ccdto = new CoopContractDTO();
		GwanriAuthInfo auth = (GwanriAuthInfo) request.getSession().getAttribute("authLog");
		ccdto.setCompanyId(ccc.getCompanyId());
		ccdto.setGwanRiNum(auth.getgwanRiNum());
		ccdto.setCompanySelectDate(ccc.getCompanySelectDate());
		ccdto.setCoopConditionAvailDate(ccc.getCoopConditionAvailDate());
		ccdto.setCoopConditionAvailTime(ccc.getCoopConditionAvailTime());
		ccdto.setCoopConditionLimitPer(ccc.getCoopConditionLimitPer());
		ccdto.setCoopContractCalDate(ccc.getCoopContractCalDate());
		ccdto.setCoopContractDate(ccc.getCoopContractDate());
		ccdto.setCoopContractEndDate(ccc.getCoopContractEndDate());
		ccdto.setCoopContractMarRatio(ccc.getCoopContractMarRatio());
		ccdto.setCoopContractMethod(ccc.getCoopContractMethod());
		ccdto.setCoopContractNum(ccc.getCoopContractNum());
		ccdto.setCoopContractRatio(ccc.getCoopContractRatio());
		ccdto.setCoopContractSett(ccc.getCoopContractSett());
		ccdto.setCoopContractState(ccc.getCoopContractState());
		ccdto.setCoopContractSubject(ccc.getCoopContractSubject());
		ccdto.setCoopContractSuppRatio(ccc.getCoopContractSuppRatio());
		ccdto.setCoopContractWrite(ccc.getCoopContractWrite());
		ccdto.setCoopKind(ccc.getCoopKind());
		System.out.println(ccdto.getCompanyId());
    	System.out.println(ccdto.getGwanRiNum());
    	System.out.println(ccdto.getCompanySelectDate());
    	System.out.println(ccdto.getCoopConditionAvailDate());
    	System.out.println(ccdto.getCoopConditionAvailTime());
    	System.out.println(ccdto.getCoopConditionLimitPer());
    	System.out.println(ccdto.getCoopContractCalDate());
    	System.out.println(ccdto.getCoopContractDate());
    	System.out.println(ccdto.getCoopContractEndDate());
    	System.out.println(ccdto.getCoopContractMarRatio());
    	System.out.println(ccdto.getCoopContractMethod());
    	System.out.println(ccdto.getCoopContractNum());
    	System.out.println(ccdto.getCoopContractRatio());
    	System.out.println(ccdto.getCoopContractSett());
    	System.out.println(ccdto.getCoopContractState());
    	System.out.println(ccdto.getCoopContractSubject());
    	System.out.println(ccdto.getCoopContractSuppRatio());
    	System.out.println(ccdto.getCoopContractWrite());
    	System.out.println(ccdto.getCoopKind());
		model.addAttribute("pageName", "../gwanri/CoopContract/coopContractList.jsp");
				
		return gwanriInsertRepository.coopInsert(ccdto);
		
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
