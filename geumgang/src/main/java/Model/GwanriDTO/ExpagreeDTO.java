package Model.GwanriDTO;

import java.sql.Date;

public class ExpagreeDTO { //사전답사보고서DTO + 협약조건안DTO
	private Integer explorationNum; 
	private String companyId;
	private String explorationType;
	private Date explorationSchedule;	
	private Date explorationEffect;	
	private String explorationManaName;
	private String explorationAvailTime;	
	private String explorationAvailDate;	
	private String explorationAvailHoli;
	private Integer explorationLimitAge;
	private Integer explorationLimitPer;
	private String explorationCondition;
	private String explorationFile;
	private String explorationSubmit;
	private String youngUpNum;
	private Integer agreementConditionNum; //협약조건 번호
	private String agreementConditionSubject; //협약조건 제목
	private java.sql.Date agreementConditionDate; //협약조건 작성일
	private float agreementConditionRatio; //업체희망정산비율
	private Integer agreementConditionSett; //정산기준시간
	private String gwanRiNum;
	public Integer getExplorationNum() {
		return explorationNum;
	}
	public void setExplorationNum(Integer explorationNum) {
		this.explorationNum = explorationNum;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getExplorationType() {
		return explorationType;
	}
	public void setExplorationType(String explorationType) {
		this.explorationType = explorationType;
	}
	public Date getExplorationSchedule() {
		return explorationSchedule;
	}
	public void setExplorationSchedule(Date explorationSchedule) {
		this.explorationSchedule = explorationSchedule;
	}
	public Date getExplorationEffect() {
		return explorationEffect;
	}
	public void setExplorationEffect(Date explorationEffect) {
		this.explorationEffect = explorationEffect;
	}
	public String getExplorationManaName() {
		return explorationManaName;
	}
	public void setExplorationManaName(String explorationManaName) {
		this.explorationManaName = explorationManaName;
	}
	public String getExplorationAvailTime() {
		return explorationAvailTime;
	}
	public void setExplorationAvailTime(String explorationAvailTime) {
		this.explorationAvailTime = explorationAvailTime;
	}
	public String getExplorationAvailDate() {
		return explorationAvailDate;
	}
	public void setExplorationAvailDate(String explorationAvailDate) {
		this.explorationAvailDate = explorationAvailDate;
	}
	public String getExplorationAvailHoli() {
		return explorationAvailHoli;
	}
	public void setExplorationAvailHoli(String explorationAvailHoli) {
		this.explorationAvailHoli = explorationAvailHoli;
	}
	public Integer getExplorationLimitAge() {
		return explorationLimitAge;
	}
	public void setExplorationLimitAge(Integer explorationLimitAge) {
		this.explorationLimitAge = explorationLimitAge;
	}
	public Integer getExplorationLimitPer() {
		return explorationLimitPer;
	}
	public void setExplorationLimitPer(Integer explorationLimitPer) {
		this.explorationLimitPer = explorationLimitPer;
	}
	public String getExplorationCondition() {
		return explorationCondition;
	}
	public void setExplorationCondition(String explorationCondition) {
		this.explorationCondition = explorationCondition;
	}
	public String getExplorationFile() {
		return explorationFile;
	}
	public void setExplorationFile(String explorationFile) {
		this.explorationFile = explorationFile;
	}
	public String getExplorationSubmit() {
		return explorationSubmit;
	}
	public void setExplorationSubmit(String explorationSubmit) {
		this.explorationSubmit = explorationSubmit;
	}
	public String getYoungUpNum() {
		return youngUpNum;
	}
	public void setYoungUpNum(String youngUpNum) {
		this.youngUpNum = youngUpNum;
	}
	public Integer getAgreementConditionNum() {
		return agreementConditionNum;
	}
	public void setAgreementConditionNum(Integer agreementConditionNum) {
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
