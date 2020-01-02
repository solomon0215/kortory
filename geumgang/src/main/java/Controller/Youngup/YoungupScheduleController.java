package Controller.Youngup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Service.Youngup.YoungupScheduleService;

@Controller
public class YoungupScheduleController {
	@Autowired
	YoungupScheduleService youngScheSer;
	
	
}
