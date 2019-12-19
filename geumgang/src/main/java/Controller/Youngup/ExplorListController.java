package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Youngup.ExplorListService;

@Controller
public class ExplorListController { //������� ���� ����Ʈ 
	@Autowired
	ExplorListService exListSer;
	
	@RequestMapping("/youngup/explorList") //���� ������纸�� ī�װ� �����
	public String newList(Model model) {
		exListSer.basicList(model);
		model.addAttribute("pageName", "../Youngup/explorList.jsp");
		return "Main/youngupMain";
	}
	
}
