package Command.Youngup;

import java.sql.Date;

public class ExplorNewWriteCommand {
	private Integer explorationNum; //��� ���� ��ȣ(PK) 
	private String companyId; //��ü ���̵�(PK)(FK)	
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
	public String getYoungUpNum() {
		return youngUpNum;
	}
	public void setYoungUpNum(String youngUpNum) {
		this.youngUpNum = youngUpNum;
	}
	
}
