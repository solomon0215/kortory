package Service.Insa;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import Command.Insa.InsaLogCommand;
import Encrypt.Encrypt;
import Model.InsaDTO.InsaAuthInfo;
import Model.InsaDTO.InsaDTO;
import Repository.Insa.InsaRepository;

public class InsaLoginService {
	@Autowired
	InsaRepository insaRepository;
	
	
	//�α��� �޼ҵ�
	public Integer loginPro(HttpSession session, InsaLogCommand insaLogCommand, HttpServletResponse response) {
		Integer result = 0;
		InsaDTO insa = new InsaDTO();
		insa.setInsaId(insaLogCommand.getInSaId());
		insa = insaRepository.userCheck(insa);
		
		InsaAuthInfo authInfo = null;
		if(insa == null) {
			result = 0;
		} else {
			if(insa.getInsaPw().equals(Encrypt.getEncryption(insaLogCommand.getInSaPw()))) {
				authInfo = new InsaAuthInfo(insa.getInsaId(), insa.getInsaEmail(), 
						insa.getInsaName(), 303, insa.getInsaNum());
				session.setAttribute("authLog", authInfo);
				result = 1;
			}else {
				result = -1;
			}
		}
		return result;
	}
	
	public void setCookie( InsaLogCommand insaLogCommand,
			HttpServletResponse response) {
		Cookie cookie = 
				new Cookie("inSaIdStore",insaLogCommand.getInSaId());
		if(insaLogCommand.getInSaIdStore()) {
			cookie.setMaxAge(60*60*24*30);
		}else {
			cookie.setMaxAge(0);
		}

	}
}

