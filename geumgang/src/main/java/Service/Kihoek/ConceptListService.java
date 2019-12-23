package Service.Kihoek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Repository.Kihoek.KihoekSelectRepository;

public class ConceptListService {
	@Autowired
	KihoekSelectRepository kihoekSelectRepository;
	
	public void conceptList(Model model) {
		
	}
}
