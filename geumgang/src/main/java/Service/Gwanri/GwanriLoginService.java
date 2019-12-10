package Service.Gwanri;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Gwanri.GwanriSelectRepository;

@Service
public class GwanriLoginService {
	@Autowired
	GwanriSelectRepository gwanriRepository;
	
	
	public String idConfirm(String gwanRiId) {
		Integer confirm = gwanriRepository.idConfirm(gwanRiId);		
		if(confirm > 0) {
			return "Main/gwanriMain";//아이디가 맞을때
		}else {
			return "Login/login"; // 아이디가 틀렸을때
		}
	}
}
