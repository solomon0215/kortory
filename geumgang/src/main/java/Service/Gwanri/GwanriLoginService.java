package Service.Gwanri;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Gwanri.GwanriLogCommand;
import Encrypt.Encrypt;
import Model.GwanriDTO.GwanriAuthInfo;
import Model.GwanriDTO.GwanriDTO;
import Repository.Gwanri.GwanriRepository;

@Service
public class GwanriLoginService {
	@Autowired
	GwanriRepository gwanriRepository;
	public Integer loginPro(HttpSession session, 
			GwanriLogCommand loginCommand,HttpServletResponse response) {
		Integer result= 0;
		GwanriDTO gwanri = new GwanriDTO();
		gwanri.setGwanRiId(loginCommand.getGwanRiId());
		gwanri = gwanriRepository.gwanriCheck(gwanri);
		GwanriAuthInfo authInfo = null;
		if(gwanri == null) {
			result = 0; // 아이디가 존재하지 않는 경우 
		}else {
			if(gwanri.getGwanRiPw().equals(
					Encrypt.getEncryption(loginCommand.getGwanRiPw()))) {
				authInfo = new GwanriAuthInfo(
						gwanri.getGwanRiId(),gwanri.getGwanRiEmail(),
						gwanri.getGwanRiName(),gwanri.getGwanRiPw());
				session.setAttribute("authInfo", authInfo);
				setCookie(loginCommand, response);
				result = 1; //로그인 된 경우 
			}else {
				result = -1; // 비밀번호가 틀린경우 
			}
		}
		return result;
	}
	public void setCookie(GwanriLogCommand loginCommand,
			HttpServletResponse response) {
		Cookie cookie = 
				new Cookie("idStore",loginCommand.getGwanRiId());
		if(loginCommand.getGwanRiIdStore()) {
			cookie.setMaxAge(60*60*24*30);
		}else {
			cookie.setMaxAge(0);
		}		
	}
}