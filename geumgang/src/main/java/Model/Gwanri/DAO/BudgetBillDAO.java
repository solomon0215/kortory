package Model.Gwanri.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import Model.Gwanri.DTO.BudgetBillDTO;

public class BudgetBillDAO {
	private JdbcTemplate jdbcTemplate;
	private String sql;
	private final String COLUMN = "BUDGET_BILL_NUM, BUDGET_BILL_PRICE_SUM,"
			+ "					   BUDGET_BILL_LABOR_RATIO,BUDGET_BILL_LABOR_PRICE, "
			+ "					   BUDGET_BILL_GOODS_PRICE, BUDGET_BILL_DATE, GWAN_RI_NUM";
	public BudgetBillDTO mapRow(ResultSet rs, int rowNum) 
				throws SQLException {
	BudgetBillDTO budgetBill = new BudgetBillDTO();
	budgetBill.setBudgetBillNum(rs.getLong("BUDGET_BILL_NUM"));
	budgetBill.setBudgetBillPriceSum(rs.getLong("BUDGET_BILL_PRICE_SUM"));
	budgetBill.setBudgetBillLaborRatio(rs.getFloat("BUDGET_BILL_LABOR_RATIO"));
	budgetBill.setBudgetBillLaborPrice(rs.getLong("BUDGET_BILL_LABOR_PRICE"));
	budgetBill.setBudgetBillGoodsPrice(rs.getLong("BUDGET_BILL_GOODS_PRICE"));
	budgetBill.setBudgetBillDate(rs.getDate("BUDGET_BILL_DATE"));
	budgetBill.setGwanRiNum(rs.getString("GWAN_RI_NUM"));
	
	return budgetBill;
	}

@Autowired
public BudgetBillDAO(DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
}
	
}
	