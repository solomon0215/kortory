package Model.InsaDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class RecruitDTO implements Serializable {
	private String recruitTitle;
	private Integer recruitNum;
	private byte [] recruitContent;
	private String recruitPrefer;
	private Integer recruitPersonnel;
	private String recruitQualification;
	private java.sql.Date recruitRegiDate;
	private java.sql.Date recruitEndDate;
	private Integer recruitCost;
	private String inSaNum;
	public RecruitDTO() {}
	
	public RecruitDTO(String recruitTitle,Integer recruitNum, byte [] recruitContent, String recruitPerfer, Integer recruitPersonnel,
			String recruitQualification, Date recruitRegiDate, Date recruitEndDate, Integer recruitCost,
			String inSaNum, String recruitPrefer) {
		super();
		this.recruitTitle = recruitTitle;
		this.recruitNum = recruitNum;
		this.recruitContent = recruitContent;
		this.recruitPrefer = recruitPrefer;
		this.recruitPersonnel = recruitPersonnel;
		this.recruitQualification = recruitQualification;
		this.recruitRegiDate = recruitRegiDate;
		this.recruitEndDate = recruitEndDate;
		this.recruitCost = recruitCost;
		this.inSaNum = inSaNum;
	}

	public String getRecruitTitle() {
		return recruitTitle;
	}

	public void setRecruitTitle(String recruitTitle) {
		this.recruitTitle = recruitTitle;
	}

	public Integer getRecruitNum() {
		return recruitNum;
	}

	public void setRecruitNum(Integer recruitNum) {
		this.recruitNum = recruitNum;
	}

	public byte[] getRecruitContent() {
		return recruitContent;
	}

	public void setRecruitContent(byte [] recruitContent) {
		this.recruitContent = recruitContent;
	}

	public String getRecruitPrefer() {
		return recruitPrefer;
	}

	public void setRecruitPrefer(String recruitPrefer) {
		this.recruitPrefer = recruitPrefer;
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

	public java.sql.Date getRecruitRegiDate() {
		return recruitRegiDate;
	}

	public void setRecruitRegiDate(java.sql.Date recruitRegiDate) {
		this.recruitRegiDate = recruitRegiDate;
	}

	public java.sql.Date getRecruitEndDate() {
		return recruitEndDate;
	}

	public void setRecruitEndDate(java.sql.Date recruitEndDate) {
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