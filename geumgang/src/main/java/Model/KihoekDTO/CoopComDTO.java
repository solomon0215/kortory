package Model.KihoekDTO;

import java.io.Serializable;

public class CoopComDTO implements Serializable {
	java.sql.Date coopContractDate;
	String coopContractState;
	String coopConditionAvailDate;
	String coopConditionAvailTime;
	Integer coopConditionLimitPer;
	java.sql.Date coopContractEndDate;
	String coopKind;
	
	public java.sql.Date getCoopContractDate() {
		return coopContractDate;
	}
	public void setCoopContractDate(java.sql.Date coopContractDate) {
		this.coopContractDate = coopContractDate;
	}
	public String getCoopContractState() {
		return coopContractState;
	}
	public void setCoopContractState(String coopContractState) {
		this.coopContractState = coopContractState;
	}
	public String getCoopConditionAvailDate() {
		return coopConditionAvailDate;
	}
	public void setCoopConditionAvailDate(String coopConditionAvailDate) {
		this.coopConditionAvailDate = coopConditionAvailDate;
	}
	public String getCoopConditionAvailTime() {
		return coopConditionAvailTime;
	}
	public void setCoopConditionAvailTime(String coopConditionAvailTime) {
		this.coopConditionAvailTime = coopConditionAvailTime;
	}
	public Integer getCoopConditionLimitPer() {
		return coopConditionLimitPer;
	}
	public void setCoopConditionLimitPer(Integer coopConditionLimitPer) {
		this.coopConditionLimitPer = coopConditionLimitPer;
	}
	public java.sql.Date getCoopContractEndDate() {
		return coopContractEndDate;
	}
	public void setCoopContractEndDate(java.sql.Date coopContractEndDate) {
		this.coopContractEndDate = coopContractEndDate;
	}
	public String getCoopKind() {
		return coopKind;
	}
	public void setCoopKind(String coopKind) {
		this.coopKind = coopKind;
	}
	
	
}


