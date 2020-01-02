package Model.GwanriDTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TaxDTO implements Serializable{
	Integer taxNum;
	String taxSubject;
	Integer taxPeriod;
	java.sql.Date taxProofDate;
	String taxProofFile;
	java.sql.Date taxDate;
	Integer taxCost;
	String gwanRiNum;
	public Integer getTaxNum() {
		return taxNum;
	}
	public void setTaxNum(Integer taxNum) {
		this.taxNum = taxNum;
	}
	public String getTaxSubject() {
		return taxSubject;
	}
	public void setTaxSubject(String taxSubject) {
		this.taxSubject = taxSubject;
	}
	public Integer getTaxPeriod() {
		return taxPeriod;
	}
	public void setTaxPeriod(Integer taxPeriod) {
		this.taxPeriod = taxPeriod;
	}
	public java.sql.Date getTaxProofDate() {
		return taxProofDate;
	}
	public void setTaxProofDate(java.sql.Date taxProofDate) {
		this.taxProofDate = taxProofDate;
	}
	public String getTaxProofFile() {
		return taxProofFile;
	}
	public void setTaxProofFile(String taxProofFile) {
		this.taxProofFile = taxProofFile;
	}
	public java.sql.Date getTaxDate() {
		return taxDate;
	}
	public void setTaxDate(java.sql.Date taxDate) {
		this.taxDate = taxDate;
	}
	public Integer getTaxCost() {
		return taxCost;
	}
	public void setTaxCost(Integer taxCost) {
		this.taxCost = taxCost;
	}
	public String getGwanRiNum() {
		return gwanRiNum;
	}
	public void setGwanRiNum(String gwanRiNum) {
		this.gwanRiNum = gwanRiNum;
	}
	
	
}
