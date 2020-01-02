package Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.InsaDTO.RecruitDTO;

@Service
public class UserRecruitService {
	@Autowired
	Repository.User.UserRecruitRepository userRecruitRepository;

	public void recruitSelect(Model model) {
		List<RecruitDTO> recruitList = userRecruitRepository.recruitAllSelect();
		model.addAttribute("recruit","recruitList");
		
		
	}
	
	

}
