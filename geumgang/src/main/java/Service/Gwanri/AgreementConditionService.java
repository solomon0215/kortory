package Service.Gwanri;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.GwanriDTO.AgreementConditionDTO;
import Repository.Gwanri.GwanriInsertRepository;

@Service
public class AgreementConditionService {
	
	@Autowired
	GwanriInsertRepository gwanriInsertRepository;
	
	public void getBoardList(Model model, Integer page) {					
	}
	public void boardView(Integer page, Long agreementConditionNum, Model model) {
		// TODO Auto-generated method stub
		}
	public Integer agreeInsert(HttpServletRequest request, HttpSession session, Model model, java.sql.Date agreementConditionDate) {
		AgreementConditionDTO dto = new AgreementConditionDTO();
		dto.setAgreementConditionDate(agreementConditionDate);	
		model.addAttribute("pageName", "../gwanri/AgreementCondition/agreement_condition_list.jsp");
		return gwanriInsertRepository.agreeInsert(dto);
		
	}
}
