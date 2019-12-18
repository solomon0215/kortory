package Model.YoungupDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class ExplorationDTO implements Serializable {
	private Integer explorationNum; //��� ���� ��ȣ(PK) 
	private String companyId; //��ü ���̵�(PK)(FK)	
	private String explorationType;	//��ü ����	
	private Date explorationSchedule;	//������� ������
	private Date explorationEffect;	//������� �ǽ���
	private String explorationManaName;//	��ü����� �̸�
	private String explorationAvailTime;	//��ü �湮 ���ɽð�	
	private String explorationAvailDate;	//��ü ��밡�� ��¥	
	private String exploration_avail_holi;//������ ��� ���� ����	����	VARCHAR2(10)	NULL
	private Integer explorationLimitAge;//��ü �湮 ���� ����	
	private Integer explorationLimitPer;//��ü �湫�� ���� �ο�
	private String explorationCondition;//	��ü �湮 ���� ����	����	VARCHAR2(1000)	NULL
	private String explorationFile;//�����ڷ�
	private String explorationSubmit;//���⿩��	����	
	private String youngUpNum;//������ ������ȣ(FK)
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
