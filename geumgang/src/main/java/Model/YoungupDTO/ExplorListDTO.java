package Model.YoungupDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class ExplorListDTO implements Serializable{ //������纸�� ���̺�(exploration) + ��ü���̺�(company)
	private String companyId; 				//��ü ���̵�
	private String companyRegNum; 			//��ü ����ڹ�ȣ
	private String companyPw;				//��ü ��й�ȣ
	private String companyName;				//��ü ��
	private String companyAddr;				//��ü �ּ�
	private String companyPh;				//��ü ��ȣ
	private String companyType;				//��ü ����
	private String companyEmail;			//��ü �̸���
	private Integer explorationNum;			//��� ���� ��ȣ(PK)	������ȣ	NUMBER	
	private String explorationType; 		//��ü ����	����	VARCHAR2(20)	
	private Date explorationSchedule;		//������� ������	������	DATE	
	private Date explorationEffect;			//������� �ǽ���	�ǽ���	DATE	
	private String explorationManaName;		//��ü����� �̸�	�̸�	VARCHAR2(50)	
	private String explorationAvailTime;	//��ü �湮 ���ɽð�	���ɽð�	VARCHAR2(1000)
	private String explorationAvailDate;	//��ü ��밡�� ��¥	���ɳ�¥	VARCHAR2(2000)
	private String explorationAvailHoli;	//������ ��� ���� ����	����	VARCHAR2(10)	
	private Integer explorationLimitAge;	//��ü �湮 ���� ����	����	NUMBER	
	private Integer explorationLimitPer;	//��ü �湫�� ���� �ο�	�ο�	NUMBER	
	private String explorationCondition;	//��ü �湮 ���� ����	����	VARCHAR2(1000)
	private String explorationFile	;		//�����ڷ�	�ڷ�	VARCHAR2(2000)	
	private String explorationSubmit;		//���⿩��	����	VARCHAR2(10)	
	private String youngUpNum;				//������ ������ȣ(FK)	������ȣ	VARCHAR2(30)	
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

