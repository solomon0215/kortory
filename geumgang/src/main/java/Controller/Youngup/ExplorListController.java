package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Youngup.ExplorListService;

@Controller
public class ExplorListController { //사전답사 보고서 리스트 
	@Autowired
	ExplorListService exListSer;
	
	@RequestMapping("/youngup/explorList") //최초 사전답사보고서 카테고리 입장시
	public String newList(Model model) {
		exListSer.basicList(model);
		model.addAttribute("pageName", "../Youngup/explorList.jsp");
		return "Main/youngupMain";
	}
	
}
