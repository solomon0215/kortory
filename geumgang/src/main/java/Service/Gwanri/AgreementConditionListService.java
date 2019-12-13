package Service.Gwanri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Repository.Gwanri.GwanriSelectRepository;

@Service
public class AgreementConditionListService {
	
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	
	public void getBoardList(Model model, Integer page) {
		
	}
	
	
 }

