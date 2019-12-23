package Service.Gwanri;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Gwanri.AgreementConditionCommand;
import Model.GwanriDTO.AgreementConditionDTO;
import Model.GwanriDTO.GwanriAuthInfo;
import Repository.Gwanri.GwanriInsertRepository;
import Repository.Gwanri.GwanriSelectRepository;

@Service
public class AgreementConditionService {
	
	@Autowired
	GwanriInsertRepository gwanriInsertRepository;
	
	public void getBoardList(Model model, Integer page) {	
				
	}

	
	public void boardView(Integer page, Long agreementConditionNum, Model model) {
		// TODO Auto-generated method stub
		
	}

	public Integer agreeInsert(AgreementConditionCommand agreementConditionCommand, HttpServletRequest request, HttpSession session, Model model) {
		AgreementConditionDTO acdto = new AgreementConditionDTO();
		session = request.getSession();
		acdto.setAgreementConditionNum(agreementConditionCommand.getAgreementConditionNum());
		acdto.setAgreementConditionRatio(agreementConditionCommand.getAgreementConditionRatio());
		acdto.setAgreementConditionSett(agreementConditionCommand.getAgreementConditionSett());
		acdto.setGwanRiNum(((GwanriAuthInfo)session.getAttribute("authLog")).getgwanRiNum());
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = dt.parse(agreementConditionCommand.getAgreementConditionDate());
			java.sql.Date da = new java.sql.Date(date.getTime());
			acdto.setAgreementConditionDate(da);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return gwanriInsertRepository.agreeInsert(acdto);
		
	}
}
