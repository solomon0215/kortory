package Service.Gwanri;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import Command.Gwanri.BudgetBillCommand;
import Command.Gwanri.TaxCommand;
import Model.GwanriDTO.BudgetBillDTO;
import Model.GwanriDTO.GwanriAuthInfo;
import Model.GwanriDTO.TaxDTO;
import Repository.Gwanri.GwanriDeleteRepository;
import Repository.Gwanri.GwanriInsertRepository;
import Repository.Gwanri.GwanriSelectRepository;
import Repository.Gwanri.GwanriUpdateRepository;

public class TaxService {
	@Autowired
	GwanriInsertRepository gwanriInsertRepository;
	@Autowired
	GwanriSelectRepository gwanriSelectRepository;
	@Autowired
	GwanriUpdateRepository gwanriUpdateRepository;
	@Autowired
	GwanriDeleteRepository gwanriDeleteRepository;

	public void taxList(Model model, HttpSession session) {
		List<TaxDTO> tax = gwanriSelectRepository.taxAllSelect();
		String authName = ((GwanriAuthInfo) session.getAttribute("authLog")).getName();
		model.addAttribute("authName", authName);
		model.addAttribute("tax", tax);
	}

	public Integer taxInsert(TaxCommand tc, HttpServletRequest request, HttpSession session, Model model) {
		TaxDTO dto = new TaxDTO();
		GwanriAuthInfo auth = (GwanriAuthInfo) request.getSession().getAttribute("authLog");
		dto.setGwanRiNum(auth.getgwanRiNum());
		dto.setTaxCost(tc.getTaxCost());
		dto.setTaxDate(tc.getTaxDate());
		dto.setTaxNum(tc.getTaxNum());
		dto.setTaxPeriod(tc.getTaxPeriod());
		dto.setTaxProofDate(tc.getTaxProofDate());
		dto.setTaxProofFile(tc.getTaxProofFile());
		dto.setTaxSubject(tc.getTaxSubject());
		model.addAttribute("pageName", "../gwanri/BudgetBill/budgetBillList.jsp");

		return gwanriInsertRepository.taxInsert(dto);
	}

	public void taxDetail(Model model, Integer taxNum) {

		TaxDTO dto = new TaxDTO();
		dto.setTaxNum(taxNum);
		TaxDTO detail = gwanriSelectRepository.taxDetail(dto);
		model.addAttribute("detail", detail);
		// detail
	}

	public static List<TaxDTO> selectGroupList(TaxDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TaxDTO> List(HttpServletRequest request, HttpServletResponse response, TaxDTO dto, ModelMap modelMap) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
