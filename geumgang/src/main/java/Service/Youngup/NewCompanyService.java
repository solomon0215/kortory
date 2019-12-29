package Service.Youngup;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Youngup.NewComListCommand;
import Model.CompanyDTO.CompanyDTO;
import Model.YoungupDTO.ExplorListDTO;
import Model.YoungupDTO.ExplorationDTO;
import Model.YoungupDTO.YoungupAuth;
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
		List<ExplorListDTO> expList = youngSelRepo.selectExplorList(); //모든 사전 보고서 불러오기
		System.out.println(expList.size()+"-----------------------------------------------");
		List<CompanyDTO> newComList = companySelectRepository.selectNewCom(expList); //업체 목록에서 검색 (사전보고서에 포함되지 않는)
		model.addAttribute("newComList", newComList);
		model.addAttribute("pageName", "../Youngup/newComList.jsp");
	}
	
	//자신의 담당 업체로 지정하기
	public String newCompanyPro(NewComListCommand newComListCommand,Model model,HttpServletRequest request) {// 자신의 담당업체로 배정하기
		List<ExplorListDTO> expList = youngSelRepo.selectExplorList(); //모든 사전 보고서 불러오기
		System.out.println("expList size"+expList.size()+"-------------------");
		List<ExplorationDTO> list =new ArrayList<ExplorationDTO>();//새로만들 사전 답사 보고서의 정보를 가진 리스트
		List<String> str2= check(expList,newComListCommand); //다른사람 업무인지 검사 메소드 실행
		if(str2 != null && str2.size() != 0) { //다른 사람 꺼라면 
			model.addAttribute("over", str2);
			newCom(model);//신규업체 정보 가져오기
			return "Main/youngupMain";
		}else {
			YoungupAuth auth = (YoungupAuth)request.getSession().getAttribute("authLog"); //가져갈 사원정보
			for(String company :newComListCommand.getCheck()) {                                          
				ExplorationDTO dto = new ExplorationDTO();
				dto.setCompanyId(company);
				dto.setYoungUpNum(auth.getYoungUpNum());
				dto.setExplorationSubmit("NEW");
				System.out.println(auth.getYoungUpNum()+""+auth.getYoungUpNum()+""+auth.getYoungUpNum()+""+auth.getYoungUpNum());
				list.add(dto);
			}
			Integer result = youngInRepo.insertExplor(list);
			model.addAttribute("result", result);
			model.addAttribute("pageName", "../Youngup/newComListPro.jsp");
			return "Main/youngupMain";
		}
	}
	
	public List<String> check(List<ExplorListDTO> expList ,NewComListCommand newComListCommand) { //다른사람 업무인지 체크하는 메소드
		List<String> str2 = new ArrayList<String>();
		if(expList.isEmpty()) {
			return null;
		}
		for(ExplorListDTO expdto : expList) { //사전보고서에 포함된 업체아이디 가져오기
			for(int i = 0 ; i< newComListCommand.getCheck().length ; i++) {                                          
				String str [] = newComListCommand.getCheck();
				System.out.println(str[i] + "-----------------------");
				if(expdto.getCompanyId().equals(str[i])){
					str2.add(str[i]) ;// 만약에 선택한 업체가 이미 사전보고서에 있다면
					continue;
				}
			}
		}
		return str2;
	}
}
