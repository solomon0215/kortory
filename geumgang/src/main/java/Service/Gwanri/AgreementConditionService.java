package Service.Gwanri;

import java.util.List;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Repository.Gwanri.GwanriSelectRepository;

@Service
public class AgreementConditionService {
	
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	
	public void getBoardList(Model model, Integer page) {	
				
	}

	
	public void boardView(Integer page, Long agreementConditionNum, Model model) {
		// TODO Auto-generated method stub
		
	}

	public void insertAgreement(HttpServletRequest request, HttpSession session, Model model) {
		// TODO Auto-generated method stub
		
	}
}

