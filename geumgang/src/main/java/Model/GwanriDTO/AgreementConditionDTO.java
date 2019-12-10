package Model.GwanriDTO;

import java.sql.Date;

public class AgreementConditionDTO { //협약조건안DTO
	Long AgreementConditionNum; //협약조건 번호
	Date AgreementConditionDate; //협약조건 작성일
	Float AgreementConditionRatio; //업체희망정산비율
	Long AgreementConditionSett; //정산기준시간
	String GwanRiNum; //관리부직원번호
	
	public Long getAgreementConditionNum() {
		return AgreementConditionNum;
	}
	public void setAgreementConditionNum(Long agreementConditionNum) {
		AgreementConditionNum = agreementConditionNum;
	}
	public Date getAgreementConditionDate() {
		return AgreementConditionDate;
	}
	public void setAgreementConditionDate(Date agreementConditionDate) {
		AgreementConditionDate = agreementConditionDate;
	}
	public Float getAgreementConditionRatio() {
		return AgreementConditionRatio;
	}
	public void setAgreementConditionRatio(Float agreementConditionRatio) {
		AgreementConditionRatio = agreementConditionRatio;
	}
	public Long getAgreementConditionSett() {
		return AgreementConditionSett;
	}
	public void setAgreementConditionSett(Long agreementConditionSett) {
		AgreementConditionSett = agreementConditionSett;
	}
	public String getGwanRiNum() {
		return GwanRiNum;
	}
	public void setGwanRiNum(String gwanRiNum) {
		GwanRiNum = gwanRiNum;
	}
	
	
}
