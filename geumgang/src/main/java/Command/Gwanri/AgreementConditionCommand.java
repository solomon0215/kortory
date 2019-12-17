package Command.Gwanri;

import java.sql.Date;

public class AgreementConditionCommand {
	Long agreementConditionNum; 
	Date agreementConditionDate; 
	Float agreementConditionRatio; 
	Long agreementConditionSett;
	String gwanRiNum;
	
	public Long getAgreementConditionNum() {
		return agreementConditionNum;
	}
	public void setAgreementConditionNum(Long agreementConditionNum) {
		this.agreementConditionNum = agreementConditionNum;
	}
	public Date getAgreementConditionDate() {
		return agreementConditionDate;
	}
	public void setAgreementConditionDate(Date agreementConditionDate) {
		this.agreementConditionDate = agreementConditionDate;
	}
	public Float getAgreementConditionRatio() {
		return agreementConditionRatio;
	}
	public void setAgreementConditionRatio(Float agreementConditionRatio) {
		this.agreementConditionRatio = agreementConditionRatio;
	}
	public Long getAgreementConditionSett() {
		return agreementConditionSett;
	}
	public void setAgreementConditionSett(Long agreementConditionSett) {
		this.agreementConditionSett = agreementConditionSett;
	}
	public String getGwanRiNum() {
		return gwanRiNum;
	}
	public void setGwanRiNum(String gwanRiNum) {
		this.gwanRiNum = gwanRiNum;
	}
}
