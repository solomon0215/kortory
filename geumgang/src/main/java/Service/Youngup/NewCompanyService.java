package Service.Youngup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Youngup.NewComListCommand;
import Model.CompanyDTO.CompanyDTO;
import Model.YoungupDTO.ExplorListDTO;
import Repository.Company.CompanySelectRepository;
import Repository.Youngup.YoungupInsertRepository;
import Repository.Youngup.YoungupSelectRepository;

@Service
public class NewCompanyService {
	@Autowired
	YoungupSelectRepository youngSelRepo;
	@Autowired
	CompanySelectRepository companySelectRepository;
	@Autowired
	YoungupInsertRepository youngInRepo;
	
	//신규업체 불러오기 메소드
	public void newCom(Model model) {
		List<ExplorListDTO> expList = youngSelRepo.selectExplorList(new ExplorListDTO()); //모든 사전 보고서 불러오기
		List<CompanyDTO> newComList = companySelectRepository.selectNewCom(expList); //업체 목록에서 검색 (사전보고서에 포함되지 않는)
		model.addAttribute("newComList", newComList);
		model.addAttribute("pageName", "../Youngup/newComList.jsp");
	}
	
	//자신의 담당 업체로 지정하기
	public String newCompanyPro(NewComListCommand newComListCommand,Model model,Errors errors) {// 자신의 담당업체로 배정하기
		boolean have = false;
		String str2="";
		List<ExplorListDTO> expList = youngSelRepo.selectExplorList(new ExplorListDTO()); //모든 사전 보고서 불러오기
		
		//다른사람이 먼저 담당했을 경우를 대비한 알고리즘
		for(ExplorListDTO expdto : expList) { //사전보고서에 포함된 업체아이디 가져오기
			for(int i = 0 ; i< newComListCommand.getCheck().length ; i++) {                                          
				String str [] = newComListCommand.getCheck();
				if(expdto.getCompanyId().equals(str[i])){
					str2 += str[i]+":";
					have=true; // 만약에 선택한 업체가 이미 사전보고서에 있다면 true
					continue;
				}
			}
		}
		if(have) {
			String [] overlap = str2.split(":");
			model.addAttribute("over", overlap);
			model.addAttribute("pageName", "../Youngup/newComList.jsp");
			return "Main/youngupMain";
		}else {
			
			model.addAttribute("pageName", "../Youngup/newComListPro.jsp");
			return "Main/youngupMain";
		}
	}
}
