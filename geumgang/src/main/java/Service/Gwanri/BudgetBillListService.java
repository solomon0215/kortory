package Service.Gwanri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.Gwanri.DTO.GwanriBoardDAO;

@Service
	public class BudgetBillListService {
	@Autowired
	private GwanriBoardDAO gwanriBoardDAO ;
	public void getBoardList(Model model, Integer page) {
	}
}
