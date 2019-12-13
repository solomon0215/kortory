package Service.Kihoek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Kihoek.KihoekSelectRepository;

@Service
public class KihoekLogService {

	@Autowired
	KihoekSelectRepository KihoekRepository;
	
	
	public String logConfirm(String kiHoekId) {
		Integer confirm = KihoekRepository.logConfirm(kiHoekId);		
		if(confirm > 0) {
			return "Main/kihoekMain";//아이디가 맞을때
		}else {
			return "Login/login"; // 아이디가 틀렸을때
		}
	}

}
