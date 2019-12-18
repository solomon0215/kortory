package Model.YoungupDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class ExplorationDTO implements Serializable {
	private Integer explorationNum; //답사 보고서 번호(PK) 
	private String companyId; //업체 아이디(PK)(FK)	
	private String explorationType;	//업체 유형	
	private Date explorationSchedule;	//사전답사 예정일
	private Date explorationEffect;	//사전답사 실시일
	private String explorationManaName;//	업체담당자 이름
	private String explorationAvailTime;	//업체 방문 가능시간	
	private String explorationAvailDate;	//업체 사용가능 날짜	
	private String exploration_avail_holi;//공휴일 사용 가능 여부	여부	VARCHAR2(10)	NULL
	private Integer explorationLimitAge;//업체 방문 제한 나이	
	private Integer explorationLimitPer;//업체 방무문 제한 인원
	private String explorationCondition;//	업체 방문 제한 조건	조건	VARCHAR2(1000)	NULL
	private String explorationFile;//증빙자료
	private String explorationSubmit;//제출여부	여부	
	private String youngUpNum;//영업부 직원번호(FK)
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
	public String getExploration_avail_holi() {
		return exploration_avail_holi;
	}
	public void setExploration_avail_holi(String exploration_avail_holi) {
		this.exploration_avail_holi = exploration_avail_holi;
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
	
	

}
