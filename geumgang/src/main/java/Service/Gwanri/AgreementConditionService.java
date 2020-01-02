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
public class AgreementConditionService {
	
	@Autowired
	GwanriInsertRepository gwanriInsertRepository;	
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	@Autowired
	GwanriUpdateRepository gwanriUpdateRepository;
	@Autowired
	private YoungupSelectRepository youngSelRepo;

	
	public void expList(Model model, HttpSession session) {
		ExplorListDTO dto = new ExplorListDTO();
		dto.setExplorationSubmit("YES");
		List<ExplorListDTO> complete = youngSelRepo.selectKindExp(dto); 
		model.addAttribute("complete", complete);
		}
	public void expDetail(Model model, Integer explorationNum) { //사전답사보고서 디테일
		System.out.println(explorationNum+"====================");
		
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(explorationNum);
		ExplorListDTO detail = gwanriSelectRepository.selectExpDetail(dto);
				
		System.out.println(detail.getCompanyId()+"id====================");
	
		model.addAttribute("detail", detail);
	}
	public void expDetail2(Model model, Integer explorationNum) {
System.out.println(explorationNum+"====================");
		
		ExplorationDTO dto = new ExplorationDTO();
		dto.setExplorationNum(explorationNum);
		ExplorListDTO detail2 = gwanriSelectRepository.selectExpDetail(dto);
				
		System.out.println(detail2.getCompanyId()+"id====================");
	
		model.addAttribute("detail2", detail2);
	}
	
	}
