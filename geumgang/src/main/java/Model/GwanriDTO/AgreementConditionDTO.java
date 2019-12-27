package Model.GwanriDTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AgreementConditionDTO implements Serializable { //협약조건안DTO
	Long agreementConditionNum; //협약조건 번호
	String agreementConditionSubject; //협약조건 제목
	java.sql.Date agreementConditionDate; //협약조건 작성일
	float agreementConditionRatio; //업체희망정산비율
	Integer agreementConditionSett; //정산기준시간
	String gwanRiNum; //관리부직원번호
	public Long getAgreementConditionNum() {
		return agreementConditionNum;
	}
	public void setAgreementConditionNum(Long agreementConditionNum) {
		this.agreementConditionNum = agreementConditionNum;
	}
	public String getAgreementConditionSubject() {
		return agreementConditionSubject;
	}
	public void setAgreementConditionSubject(String agreementConditionSubject) {
		this.agreementConditionSubject = agreementConditionSubject;
	}
	public java.sql.Date getAgreementConditionDate() {
		return agreementConditionDate;
	}
	public void setAgreementConditionDate(java.sql.Date agreementConditionDate) {
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

