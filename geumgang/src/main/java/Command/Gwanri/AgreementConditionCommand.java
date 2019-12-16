package Command.Gwanri;

import java.sql.Date;

public class AgreementConditionCommand {
	int agreementConditionNum; 
	Date agreementConditionDate; 
	Float agreementConditionRatio; 
	int agreementConditionSett;
	String gwanRiNum;
	
	public int getAgreementConditionNum() {
		return agreementConditionNum;
	}
	public void setAgreementConditionNum(int agreementConditionNum) {
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
	public int getAgreementConditionSett() {
		return agreementConditionSett;
	}
	public void setAgreementConditionSett(int agreementConditionSett) {
		this.agreementConditionSett = agreementConditionSett;
	}
	public String getGwanRiNum() {
		return gwanRiNum;
	}
	public void setGwanRiNum(String gwanRiNum) {
		this.gwanRiNum = gwanRiNum;
	}
	
	
}
