package Model.GwanriDTO;

import java.io.Serializable;


import java.sql.Date;

@SuppressWarnings("serial")
public class BudgetBillDTO implements Serializable {
	Long budgetBillNum;
	Long budgetBillPriceSum;
	Float budgetBillLaborRatio;
	Long budgetBillLaborPrice;
	Long budgetBillGoodsPrice;
	Date budgetBillDate;
	String gwanRiNum;
	
	public Long getBudgetBillNum() {
		return budgetBillNum;
	}
	public void setBudgetBillNum(Long budgetBillNum) {
		this.budgetBillNum = budgetBillNum;
	}
	public Long getBudgetBillPriceSum() {
		return budgetBillPriceSum;
	}
	public void setBudgetBillPriceSum(Long budgetBillPriceSum) {
		this.budgetBillPriceSum = budgetBillPriceSum;
	}
	public Float getBudgetBillLaborRatio() {
		return budgetBillLaborRatio;
	}
	public void setBudgetBillLaborRatio(Float budgetBillLaborRatio) {
		this.budgetBillLaborRatio = budgetBillLaborRatio;
	}
	public Long getBudgetBillLaborPrice() {
		return budgetBillLaborPrice;
	}
	public void setBudgetBillLaborPrice(Long budgetBillLaborPrice) {
		this.budgetBillLaborPrice = budgetBillLaborPrice;
	}
	public Long getBudgetBillGoodsPrice() {
		return budgetBillGoodsPrice;
	}
	public void setBudgetBillGoodsPrice(Long budgetBillGoodsPrice) {
		this.budgetBillGoodsPrice = budgetBillGoodsPrice;
	}
	public Date getBudgetBillDate() {
		return budgetBillDate;
	}
	public void setBudgetBillDate(Date budgetBillDate) {
		this.budgetBillDate = budgetBillDate;
	}
	public String getGwanRiNum() {
		return gwanRiNum;
	}
	public void setGwanRiNum(String gwanRiNum) {
		this.gwanRiNum = gwanRiNum;
	}	
}
