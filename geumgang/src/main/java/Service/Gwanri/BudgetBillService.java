package Service.Gwanri;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Command.Gwanri.BudgetBillCommand;
import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.ExpagreeDTO;
import Model.GwanriDTO.GwanriAuthInfo;
import Repository.Gwanri.GwanriDeleteRepository;
import Repository.Gwanri.GwanriInsertRepository;
import Repository.Gwanri.GwanriSelectRepository;
import Repository.Gwanri.GwanriUpdateRepository;

@Service
public class BudgetBillService {

	@Autowired
	GwanriInsertRepository gwanriInsertRepository;
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	@Autowired
	GwanriUpdateRepository gwanriUpdateRepository;
	@Autowired
	GwanriDeleteRepository gwanriDeleteRepository;

	public void budgetList(Model model, HttpSession session) {
		List<BudgetBillDTO> budget = gwanriSelectRepository.budgetAllSelect();
		String authName = ((GwanriAuthInfo) session.getAttribute("authLog")).getName();
		model.addAttribute("authName", authName);
		model.addAttribute("budget", budget);
	}

	public Integer budgetInsert(BudgetBillCommand bbc, HttpServletRequest request, HttpSession session, Model model) {
		BudgetBillDTO dto = new BudgetBillDTO();
		GwanriAuthInfo auth = (GwanriAuthInfo) request.getSession().getAttribute("authLog");
		dto.setGwanRiNum(auth.getgwanRiNum());
		dto.setBudgetBillSubject(bbc.getBudgetBillSubject());
		dto.setBudgetBillPriceSum(bbc.getBudgetBillPriceSum());
		dto.setBudgetBillDate(bbc.getBudgetBillDate());
		dto.setBudgetBillGoodsPrice(bbc.getBudgetBillGoodsPrice());
		dto.setBudgetBillLaborPrice(bbc.getBudgetBillLaborPrice());
		dto.setBudgetBillLaborRatio(bbc.getBudgetBillLaborRatio());
		dto.setBudgetBillNum(bbc.getBudgetBillNum());
		model.addAttribute("pageName", "../gwanri/BudgetBill/budgetBillList.jsp");

		return gwanriInsertRepository.budgetInsert(dto);
	}

	public void budgetDetail(Model model, Integer budgetBillNum) {

		BudgetBillDTO dto = new BudgetBillDTO();
		dto.setBudgetBillNum(budgetBillNum);
		BudgetBillDTO detail = gwanriSelectRepository.budgetDetail(dto);
		model.addAttribute("detail", detail);
		// detail
	}

	public void budgetModify(BudgetBillCommand bbc, Integer budgetBillNum, HttpServletRequest request,
			HttpSession session, Model model) {
		BudgetBillDTO dto = new BudgetBillDTO();
		dto.setBudgetBillNum(budgetBillNum);
		BudgetBillDTO detail = gwanriSelectRepository.budgetDetail(dto);
		model.addAttribute("detail", detail);
		GwanriAuthInfo auth = (GwanriAuthInfo) request.getSession().getAttribute("authLog");
		bbc.setGwanRiNum(auth.getgwanRiNum());
		bbc.setBudgetBillSubject(dto.getBudgetBillSubject());
		bbc.setBudgetBillPriceSum(dto.getBudgetBillPriceSum());
		bbc.setBudgetBillDate(dto.getBudgetBillDate());
		bbc.setBudgetBillGoodsPrice(dto.getBudgetBillGoodsPrice());
		bbc.setBudgetBillLaborPrice(dto.getBudgetBillLaborPrice());
		bbc.setBudgetBillLaborRatio(dto.getBudgetBillLaborRatio());
		bbc.setBudgetBillNum(dto.getBudgetBillNum());
		model.addAttribute("bbc", bbc);

	}
	public void budgetDelete(Model model, Integer budgetBillNum) {

		BudgetBillDTO dto = new BudgetBillDTO();
		dto.setBudgetBillNum(budgetBillNum);
		gwanriDeleteRepository.budgetDelete(dto);
		// detail
	}
}
