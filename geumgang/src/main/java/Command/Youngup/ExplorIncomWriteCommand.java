package Command.Youngup;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class ExplorIncomWriteCommand {
	private Integer explorationNum; //답사 보고서 번호(PK) 
	private String explorationType;	//업체 유형	
	private String explorationManaName;//	업체담당자 이름
	private String explorationEffect;//방문 실시일
	private String startTime;	//업체 방문 가능 시작시간	
	private String endTime;	//업체 방문 가능 종료시간
	private String startDate;	//업체 사용가능 날짜
	private String endDate;	//업체 사용가능 날짜
	private String exploration_avail_holi;//공휴일 사용 가능 여부	여부	VARCHAR2(10)	NULL
	private Integer explorationLimitAge;//업체 방문 제한 나이	
	private Integer explorationLimitPer;//업체 방무문 제한 인원
	private String explorationCondition;//	업체 방문 제한 조건	조건	VARCHAR2(1000)	NULL
	private MultipartFile [] picture; //증빙 사진자료
	
	public String getExplorationEffect() {
		return explorationEffect;
	}
	public void setExplorationEffect(String explorationEffect) {
		this.explorationEffect = explorationEffect;
	}
	public Integer getExplorationNum() {
		return explorationNum;
	}
	public void setExplorationNum(Integer explorationNum) {
		this.explorationNum = explorationNum;
	}
	public String getExplorationType() {
		return explorationType;
	}
	public void setExplorationType(String explorationType) {
		this.explorationType = explorationType;
	}
	public String getExplorationManaName() {
		return explorationManaName;
	}
	public void setExplorationManaName(String explorationManaName) {
		this.explorationManaName = explorationManaName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
	public MultipartFile[] getPicture() {
		return picture;
	}
	public void setPicture(MultipartFile[] picture) {
		this.picture = picture;
	}
	
	
}
