package Model.GwanriDTO;

import java.sql.Date;

public class AgreementConditionDTO { //협약조건안DTO
	private Integer agreementConditionNum; //협약조건 번호
	private Date agreementConditionDate; //협약조건 작성일
	private Float agreementConditionRatio; //업체희망정산비율
	private Integer agreementConditionSett; //정산기준시간
	private String gwanRiNum; //관리부직원번호

	public Integer getAgreementConditionNum() {
		return agreementConditionNum;
	}
	public void setAgreementConditionNum(Integer agreementConditionNum) {
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

