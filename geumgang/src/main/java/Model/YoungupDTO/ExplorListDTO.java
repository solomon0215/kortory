package Model.YoungupDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class ExplorListDTO implements Serializable{ //사전답사보고서 테이블(exploration) + 업체테이블(company)
	private String companyId; 				//업체 아이디
	private String companyRegNum; 			//업체 사업자번호
	private String companyPw;				//업체 비밀번호
	private String companyName;				//업체 명
	private String companyAddr;				//업체 주소
	private String companyPh;				//업체 번호
	private String companyType;				//업체 유형
	private String companyEmail;			//업체 이메일
	private Integer explorationNum;			//답사 보고서 번호(PK)	서류번호	NUMBER	
	private String explorationType; 		//업체 유형	유형	VARCHAR2(20)	
	private Date explorationSchedule;		//사전답사 예정일	예정일	DATE	
	private Date explorationEffect;			//사전답사 실시일	실시일	DATE	
	private String explorationManaName;		//업체담당자 이름	이름	VARCHAR2(50)	
	private String explorationAvailTime;	//업체 방문 가능시간	가능시간	VARCHAR2(1000)
	private String explorationAvailDate;	//업체 사용가능 날짜	가능날짜	VARCHAR2(2000)
	private String explorationAvailHoli;	//공휴일 사용 가능 여부	여부	VARCHAR2(10)	
	private Integer explorationLimitAge;	//업체 방문 제한 나이	나이	NUMBER	
	private Integer explorationLimitPer;	//업체 방무문 제한 인원	인원	NUMBER	
	private String explorationCondition;	//업체 방문 제한 조건	조건	VARCHAR2(1000)
	private String explorationFile	;		//증빙자료	자료	VARCHAR2(2000)	
	private String explorationSubmit;		//제출여부	여부	VARCHAR2(10)	
	private String youngUpNum;				//영업부 직원번호(FK)	직원번호	VARCHAR2(30)	
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyRegNum() {
		return companyRegNum;
	}
	public void setCompanyRegNum(String companyRegNum) {
		this.companyRegNum = companyRegNum;
	}
	public String getCompanyPw() {
		return companyPw;
	}
	public void setCompanyPw(String companyPw) {
		this.companyPw = companyPw;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	public String getCompanyPh() {
		return companyPh;
	}
	public void setCompanyPh(String companyPh) {
		this.companyPh = companyPh;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
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
	
}

