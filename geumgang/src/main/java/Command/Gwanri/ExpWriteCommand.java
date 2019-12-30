package Command.Gwanri;

import org.springframework.web.multipart.MultipartFile;

public class ExpWriteCommand {
	private Integer explorationNum; //��� ���� ��ȣ(PK)
	private String explorationType;
	private String explorationManaName;//	��ü����� �̸�
	private String explorationEffect;//�湮 �ǽ���
	private String startTime;	//��ü �湮 ���� ���۽ð�	
	private String endTime;	//��ü �湮 ���� ����ð�
	private String startDate;	//��ü ��밡�� ��¥
	private String endDate;	//��ü ��밡�� ��¥
	private String explorationAvailHoli;//������ ��� ���� ����	����	VARCHAR2(10)	NULL
	private Integer explorationLimitAge;//��ü �湮 ���� ����	
	private Integer explorationLimitPer;//��ü �湫�� ���� �ο�
	private String explorationCondition;//	��ü �湮 ���� ����	����	VARCHAR2(1000)	NULL
	private MultipartFile [] picture; //���� �����ڷ�
	private Integer choise;//����/�ӽú��� ����
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
	public String getExplorationEffect() {
		return explorationEffect;
	}
	public void setExplorationEffect(String explorationEffect) {
		this.explorationEffect = explorationEffect;
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
	public MultipartFile[] getPicture() {
		return picture;
	}
	public void setPicture(MultipartFile[] picture) {
		this.picture = picture;
	}
	public Integer getChoise() {
		return choise;
	}
	public void setChoise(Integer choise) {
		this.choise = choise;
	}
	
	

}
