package Command.Youngup;

import java.sql.Date;

public class ExplorNewWriteCommand {
	private Integer explorationNum; //답사 보고서 번호(PK) 
	private String companyId; //업체 아이디(PK)(FK)	
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
	public String getYoungUpNum() {
		return youngUpNum;
	}
	public void setYoungUpNum(String youngUpNum) {
		this.youngUpNum = youngUpNum;
	}
	
}
