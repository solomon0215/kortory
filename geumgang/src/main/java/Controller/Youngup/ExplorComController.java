package Controller.Youngup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Youngup.ExplorComService;

@Controller
public class ExplorComController { //�ۼ� �Ϸ�� ������� ���� ���� ��Ʈ�ѷ�
	@Autowired
	ExplorComService expComSer;
	
	//�󼼺���
		@RequestMapping("/youngup/explorCompleDetail") //�󼼺��� 
		public String incomExpDetail(Model model,HttpServletRequest request,
				@RequestParam(value = "expNum") Integer expNum) {
			if(request.getSession().getAttribute("authLog") == null) { //�α��� Ȯ��
				return "Youngup/back";
			}
			expComSer.comExpDetail(model,expNum);
			model.addAttribute("pageName", "../Youngup/comExpDetail.jsp");
			return "Main/youngupMain";
		}
	
}
