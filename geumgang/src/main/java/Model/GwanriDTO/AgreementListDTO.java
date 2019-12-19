package Model.GwanriDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class AgreementListDTO implements Serializable { //협약조건안(Agreement Condition)+업체이름(Company)
	private Integer agreementConditionNum; //협약조건 번호
	private Date agreementConditionDate; //협약조건 작성일
	private Float agreementConditionRatio; //업체희망정산비율
	private Integer agreementConditionSett; //정산기준시간
	private String gwanRiNum; //관리부직원번호
	private String companyId; //업체아이디
	private String companyName; // 업체이름
	
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
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
