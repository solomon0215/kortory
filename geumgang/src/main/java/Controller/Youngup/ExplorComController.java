package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Youngup.ExplorComService;

@Controller
public class ExplorComController { //작성 완료된 사전답사 보고서 관련 컨트롤러
	@Autowired
	ExplorComService expComSer;
	
	//상세보기
		@RequestMapping("/youngup/explorCompleDetail") //상세보기 
		public String incomExpDetail(Model model,HttpServletRequest request,
				@RequestParam(value = "expNum") Integer expNum) {
			if(request.getSession().getAttribute("authLog") == null) { //로그인 확인
				return "Youngup/back";
			}
			expComSer.comExpDetail(model,expNum);
			model.addAttribute("pageName", "../Youngup/comExpDetail.jsp");
			return "Main/youngupMain";
		}
	
}
