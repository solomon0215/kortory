package Model.GwanriDTO;

import java.sql.Date;

public class AgreementConditionDTO { //협약조건안DTO
	String agreementConditionNum; //협약조건 번호
	String agreementConditionDate; //협약조건 작성일
	float agreementConditionRatio; //업체희망정산비율
	Integer agreementConditionSett; //정산기준시간
	String gwanRiNum; //관리부직원번호
	public String getAgreementConditionNum() {
		return agreementConditionNum;
	}
	public void setAgreementConditionNum(String agreementConditionNum) {
		this.agreementConditionNum = agreementConditionNum;
	}
	public String getAgreementConditionDate() {
		return agreementConditionDate;
	}
	public void setAgreementConditionDate(String agreementConditionDate) {
		this.agreementConditionDate = agreementConditionDate;
	}
	public float getAgreementConditionRatio() {
		return agreementConditionRatio;
	}
	public void setAgreementConditionRatio(float agreementConditionRatio) {
		this.agreementConditionRatio = agreementConditionRatio;
	}
	public Integer getAgreementConditionSett() {
		return agreementConditionSett;
	}
	public void setAgreementConditionSett(Integer agreementConditionSett) {
		this.agreementConditionSett = agreementConditionSett;
	}
	public String getGwanRiNum() {
		return gwanRiNum;
	}
	public void setGwanRiNum(String gwanRiNum) {
		this.gwanRiNum = gwanRiNum;
	}
}

