package Model.GwanriDTO;

import java.sql.Date;

public class AgreementConditionDTO { //협약조건안DTO
	Long agreementConditionNum; //협약조건 번호
	Date agreementConditionDate; //협약조건 작성일
	Float agreementConditionRatio; //업체희망정산비율
	Long agreementConditionSett; //정산기준시간
	String gwanRiNum; //관리부직원번호
	
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
