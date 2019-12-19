package Model.GwanriDTO;

import java.io.Serializable;


import java.sql.Date;

@SuppressWarnings("serial")
public class BudgetBillDTO implements Serializable {
	private Integer budgetBillNum;
	private Integer budgetBillPriceSum;
	private Float budgetBillLaborRatio;
	private Integer budgetBillLaborPrice;
	private Integer budgetBillGoodsPrice;
	private Date budgetBillDate;
	private String gwanRiNum;
	
	public Integer getBudgetBillNum() {
		return budgetBillNum;
	}
	public void setBudgetBillNum(Integer budgetBillNum) {
		this.budgetBillNum = budgetBillNum;
	}
	public Integer getBudgetBillPriceSum() {
		return budgetBillPriceSum;
	}
	public void setBudgetBillPriceSum(Integer budgetBillPriceSum) {
		this.budgetBillPriceSum = budgetBillPriceSum;
	}
	public Float getBudgetBillLaborRatio() {
		return budgetBillLaborRatio;
	}
	public void setBudgetBillLaborRatio(Float budgetBillLaborRatio) {
		this.budgetBillLaborRatio = budgetBillLaborRatio;
	}
	public Integer getBudgetBillLaborPrice() {
		return budgetBillLaborPrice;
	}
	public void setBudgetBillLaborPrice(Integer budgetBillLaborPrice) {
		this.budgetBillLaborPrice = budgetBillLaborPrice;
	}
	public Integer getBudgetBillGoodsPrice() {
		return budgetBillGoodsPrice;
	}
	public void setBudgetBillGoodsPrice(Integer budgetBillGoodsPrice) {
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
