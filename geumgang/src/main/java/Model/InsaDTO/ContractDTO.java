package Model.InsaDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class ContractDTO implements Serializable {
	private Integer conNum;
	private String conCompany;
	private String conPh;
	private String conLocation;
	private String conCeo;
	private String conRegiNum;
	private java.sql.Date conStart;
	private Integer conSalary;
	private java.sql.Date conEnd;
	private Integer conIncentive;
	private byte [] conDetail;
	private String resumeNum;
	private String userId;
	
	public ContractDTO() {}

	public ContractDTO(Integer conNum, String conCompany, String conPh, String conLocation, String conCeo,
			String conRegiNum, Date conStart, Integer conSalary, Date conEnd, Integer conIncentive, byte[] conDetail,
			String resumeNum, String userId) {
		super();
		this.conNum = conNum;
		this.conCompany = conCompany;
		this.conPh = conPh;
		this.conLocation = conLocation;
		this.conCeo = conCeo;
		this.conRegiNum = conRegiNum;
		this.conStart = conStart;
		this.conSalary = conSalary;
		this.conEnd = conEnd;
		this.conIncentive = conIncentive;
		this.conDetail = conDetail;
		this.resumeNum = resumeNum;
		this.userId = userId;
	}

	public Integer getConNum() {
		return conNum;
	}

	public void setConNum(Integer conNum) {
		this.conNum = conNum;
	}

	public String getConCompany() {
		return conCompany;
	}

	public void setConCompany(String conCompany) {
		this.conCompany = conCompany;
	}

	public String getConPh() {
		return conPh;
	}

	public void setConPh(String conPh) {
		this.conPh = conPh;
	}

	public String getConLocation() {
		return conLocation;
	}

	public void setConLocation(String conLocation) {
		this.conLocation = conLocation;
	}

	public String getConCeo() {
		return conCeo;
	}

	public void setConCeo(String conCeo) {
		this.conCeo = conCeo;
	}

	public String getConRegiNum() {
		return conRegiNum;
	}

	public void setConRegiNum(String conRegiNum) {
		this.conRegiNum = conRegiNum;
	}

	public Date getConStart() {
		return conStart;
	}

	public void setConStart(Date conStart) {
		this.conStart = conStart;
	}

	public Integer getConSalary() {
		return conSalary;
	}

	public void setConSalary(Integer conSalary) {
		this.conSalary = conSalary;
	}

	public Date getConEnd() {
		return conEnd;
	}

	public void setConEnd(Date conEnd) {
		this.conEnd = conEnd;
	}

	public Integer getConIncentive() {
		return conIncentive;
	}

	public void setConIncentive(Integer conIncentive) {
		this.conIncentive = conIncentive;
	}

	public byte[] getConDetail() {
		return conDetail;
	}

	public void setConDetail(byte[] conDetail) {
		this.conDetail = conDetail;
	}

	public String getResumeNum() {
		return resumeNum;
	}

	public void setResumeNum(String resumeNum) {
		this.resumeNum = resumeNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
