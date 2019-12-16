package Model.InsaDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class RecruitDTO implements Serializable {
	private Integer recruitNum;
	private String recruitContent;
	private String recruitPerfer;
	private Integer recruitPersonnel;
	private String recruitQualification;
	private java.sql.Date recruitRegiDate;
	private java.sql.Date recruitEndDate;
	private Integer recruitCost;
	private String inSaNum;
	public RecruitDTO() {}
	
	public RecruitDTO(Integer recruitNum, String recruitContent, String recruitPerfer, Integer recruitPersonnel,
			String recruitQualification, Date recruitRegiDate, Date recruitEndDate, Integer recruitCost,
			String inSaNum) {
		super();
		this.recruitNum = recruitNum;
		this.recruitContent = recruitContent;
		this.recruitPerfer = recruitPerfer;
		this.recruitPersonnel = recruitPersonnel;
		this.recruitQualification = recruitQualification;
		this.recruitRegiDate = recruitRegiDate;
		this.recruitEndDate = recruitEndDate;
		this.recruitCost = recruitCost;
		this.inSaNum = inSaNum;
	}

	public Integer getRecruitNum() {
		return recruitNum;
	}
	public void setRecruitNum(Integer recruitNum) {
		this.recruitNum = recruitNum;
	}
	public String getRecruitContent() {
		return recruitContent;
	}
	public void setRecruitContent(String recruitContent) {
		this.recruitContent = recruitContent;
	}
	public String getRecruitPerfer() {
		return recruitPerfer;
	}
	public void setRecruitPerfer(String recruitPerfer) {
		this.recruitPerfer = recruitPerfer;
	}
	public Integer getRecruitPersonnel() {
		return recruitPersonnel;
	}
	public void setRecruitPersonnel(Integer recruitPersonnel) {
		this.recruitPersonnel = recruitPersonnel;
	}
	public String getRecruitQualification() {
		return recruitQualification;
	}
	public void setRecruitQualification(String recruitQualification) {
		this.recruitQualification = recruitQualification;
	}
	public Date getRecruitRegiDate() {
		return recruitRegiDate;
	}
	public void setRecruitRegiDate(Date recruitRegiDate) {
		this.recruitRegiDate = recruitRegiDate;
	}
	public Date getRecruitEndDate() {
		return recruitEndDate;
	}
	public void setRecruitEndDate(Date recruitEndDate) {
		this.recruitEndDate = recruitEndDate;
	}
	public Integer getRecruitCost() {
		return recruitCost;
	}
	public void setRecruitCost(Integer recruitCost) {
		this.recruitCost = recruitCost;
	}
	public String getInSaNum() {
		return inSaNum;
	}
	public void setInSaNum(String inSaNum) {
		this.inSaNum = inSaNum;
	}
	
	

}