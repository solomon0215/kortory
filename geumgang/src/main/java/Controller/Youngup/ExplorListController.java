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
	
	@RequestMapping("/youngup/explorList")
	public String basicList(Model model,
			@RequestParam(value = "num",defaultValue = "0") String num,
			@RequestParam(value = "companyId",defaultValue = "0") String companyName,
			HttpServletRequest request) {
		if(request.getSession().getAttribute("authLog") == null) {
			return "Youngup/back";
		}
		if(!num.equals("0") || !companyName.equals("0")) {
			exListSer.conditionList(model, num, companyName);
		}else {
			exListSer.basicList(model);
		}
		model.addAttribute("pageName", "../Youngup/explorList.jsp");
		return "Main/youngupMain";
	}
}
