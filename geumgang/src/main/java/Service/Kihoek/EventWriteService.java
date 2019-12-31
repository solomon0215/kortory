package Service.Kihoek;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.KihoekDTO.KihoekAuthInfo;
import Model.KihoekDTO.KihoekDTO;
import Repository.Kihoek.KihoekInsertRepository;

@Service
public class EventWriteService {
	@Autowired
	KihoekInsertRepository kihoekInsertRepository;
	
	@Transactional
	public void kihoekName(HttpServletRequest request, Model model) {
		KihoekDTO kDto = new KihoekDTO();
		KihoekAuthInfo info = (KihoekAuthInfo)request.getSession().getAttribute("authLog");
		kDto.setKiHoekNum(info.getNum());
		kDto.setKiHoekName(info.getName());
		model.addAttribute("kihoek", kDto);
	}
}
