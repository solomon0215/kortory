package Controller.Kihoek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Kihoek.KihoekLogService;

@Controller
public class KihoekMainContoller {
	@Autowired
	KihoekLogService kihoekLogService;
	

}
