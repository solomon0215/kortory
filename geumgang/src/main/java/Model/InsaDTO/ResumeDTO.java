package Model.InsaDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class ResumeDTO implements Serializable {
	private Integer resumeNum;
	private String userId;
	private String resumeFile;
	private String resumeNational;
	private String resumeBohun;
	private String resumeDisorder;
	private String resumeArmy;
	private String resumeExpOver;
	private String resumeHighschool;
	private String resumeUnivercity;
	private java.sql.Date schoolStart1;
	private java.sql.Date schoolEnd1;
	private java.sql.Date schoolStart2;
	private java.sql.Date schoolEnd2;
	private String resumeMajor;
	private double resumePoint;
	private String resumeLanguage;
	private String resumeGrade;
	private String resumeLicense;
	private String formerWork;
	private String formerPosition;
	private java.sql.Date formerStart;
	private java.sql.Date formerEnd;
	private Integer formerSalary;
	private String formerTask;
	private String formerIntro;
	private String resumeGrow;
	private String resumeGood;
	private String resumeBad;
	private String resumePerInfo;
	public ResumeDTO() {}
	
	public ResumeDTO(Integer resumeNum, String userId, String resumeFile, String resumeNational, String resumeBohun,
			String resumeDisorder, String resumeArmy, String resumeExpOver, String resumeHighschool,
			String resumeUnivercity, Date schoolStart1, Date schoolEnd1, Date schoolStart2, Date schoolEnd2,
			String resumeMajor, double resumePoint, String resumeLanguage, String resumeGrade, String resumeLicense,
			String formerWork, String formerPosition, Date formerStart, Date formerEnd, Integer formerSalary,
			String formerTask, String formerIntro, String resumeGrow, String resumeGood, String resumeBad,
			String resumePerInfo) {
		super();
		this.resumeNum = resumeNum;
		this.userId = userId;
		this.resumeFile = resumeFile;
		this.resumeNational = resumeNational;
		this.resumeBohun = resumeBohun;
		this.resumeDisorder = resumeDisorder;
		this.resumeArmy = resumeArmy;
		this.resumeExpOver = resumeExpOver;
		this.resumeHighschool = resumeHighschool;
		this.resumeUnivercity = resumeUnivercity;
		this.schoolStart1 = schoolStart1;
		this.schoolEnd1 = schoolEnd1;
		this.schoolStart2 = schoolStart2;
		this.schoolEnd2 = schoolEnd2;
		this.resumeMajor = resumeMajor;
		this.resumePoint = resumePoint;
		this.resumeLanguage = resumeLanguage;
		this.resumeGrade = resumeGrade;
		this.resumeLicense = resumeLicense;
		this.formerWork = formerWork;
		this.formerPosition = formerPosition;
		this.formerStart = formerStart;
		this.formerEnd = formerEnd;
		this.formerSalary = formerSalary;
		this.formerTask = formerTask;
		this.formerIntro = formerIntro;
		this.resumeGrow = resumeGrow;
		this.resumeGood = resumeGood;
		this.resumeBad = resumeBad;
		this.resumePerInfo = resumePerInfo;
	}
	public Integer getResumeNum() {
		return resumeNum;
	}
	public void setResumeNum(Integer resumeNum) {
		this.resumeNum = resumeNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getResumeFile() {
		return resumeFile;
	}
	public void setResumeFile(String resumeFile) {
		this.resumeFile = resumeFile;
	}
	public String getResumeNational() {
		return resumeNational;
	}
	public void setResumeNational(String resumeNational) {
		this.resumeNational = resumeNational;
	}
	public String getResumeBohun() {
		return resumeBohun;
	}
	public void setResumeBohun(String resumeBohun) {
		this.resumeBohun = resumeBohun;
	}
	public String getResumeDisorder() {
		return resumeDisorder;
	}
	public void setResumeDisorder(String resumeDisorder) {
		this.resumeDisorder = resumeDisorder;
	}
	public String getResumeArmy() {
		return resumeArmy;
	}
	public void setResumeArmy(String resumeArmy) {
		this.resumeArmy = resumeArmy;
	}
	public String getResumeExpOver() {
		return resumeExpOver;
	}
	public void setResumeExpOver(String resumeExpOver) {
		this.resumeExpOver = resumeExpOver;
	}
	public String getResumeHighschool() {
		return resumeHighschool;
	}
	public void setResumeHighschool(String resumeHighschool) {
		this.resumeHighschool = resumeHighschool;
	}
	public String getResumeUnivercity() {
		return resumeUnivercity;
	}
	public void setResumeUnivercity(String resumeUnivercity) {
		this.resumeUnivercity = resumeUnivercity;
	}

	public String getResumeMajor() {
		return resumeMajor;
	}
	public void setResumeMajor(String resumeMajor) {
		this.resumeMajor = resumeMajor;
	}
	public double getResumePoint() {
		return resumePoint;
	}
	public void setResumePoint(double resumePoint) {
		this.resumePoint = resumePoint;
	}
	public String getResumeLanguage() {
		return resumeLanguage;
	}
	public void setResumeLanguage(String resumeLanguage) {
		this.resumeLanguage = resumeLanguage;
	}
	public String getResumeGrade() {
		return resumeGrade;
	}
	public void setResumeGrade(String resumeGrade) {
		this.resumeGrade = resumeGrade;
	}
	public String getResumeLicense() {
		return resumeLicense;
	}
	public void setResumeLicense(String resumeLicense) {
		this.resumeLicense = resumeLicense;
	}
	public String getFormerWork() {
		return formerWork;
	}
	public void setFormerWork(String formerWork) {
		this.formerWork = formerWork;
	}
	public String getFormerPosition() {
		return formerPosition;
	}
	public void setFormerPosition(String formerPosition) {
		this.formerPosition = formerPosition;
	}
	public Integer getFormerSalary() {
		return formerSalary;
	}
	public void setFormerSalary(Integer formerSalary) {
		this.formerSalary = formerSalary;
	}
	public String getFormerTask() {
		return formerTask;
	}
	public void setFormerTask(String formerTask) {
		this.formerTask = formerTask;
	}
	public String getFormerIntro() {
		return formerIntro;
	}
	public void setFormerIntro(String formerIntro) {
		this.formerIntro = formerIntro;
	}
	public String getResumeGrow() {
		return resumeGrow;
	}
	public void setResumeGrow(String resumeGrow) {
		this.resumeGrow = resumeGrow;
	}
	public String getResumeGood() {
		return resumeGood;
	}
	public void setResumeGood(String resumeGood) {
		this.resumeGood = resumeGood;
	}
	public String getResumeBad() {
		return resumeBad;
	}
	public void setResumeBad(String resumeBad) {
		this.resumeBad = resumeBad;
	}
	public String getResumePerInfo() {
		return resumePerInfo;
	}
	public void setResumePerInfo(String resumePerInfo) {
		this.resumePerInfo = resumePerInfo;
	}

	public java.sql.Date getSchoolStart1() {
		return schoolStart1;
	}

	public void setSchoolStart1(java.sql.Date schoolStart1) {
		this.schoolStart1 = schoolStart1;
	}

	public java.sql.Date getSchoolEnd1() {
		return schoolEnd1;
	}

	public void setSchoolEnd1(java.sql.Date schoolEnd1) {
		this.schoolEnd1 = schoolEnd1;
	}

	public java.sql.Date getSchoolStart2() {
		return schoolStart2;
	}

	public void setSchoolStart2(java.sql.Date schoolStart2) {
		this.schoolStart2 = schoolStart2;
	}

	public java.sql.Date getSchoolEnd2() {
		return schoolEnd2;
	}

	public void setSchoolEnd2(java.sql.Date schoolEnd2) {
		this.schoolEnd2 = schoolEnd2;
	}

	public java.sql.Date getFormerStart() {
		return formerStart;
	}

	public void setFormerStart(java.sql.Date formerStart) {
		this.formerStart = formerStart;
	}

	public java.sql.Date getFormerEnd() {
		return formerEnd;
	}

	public void setFormerEnd(java.sql.Date formerEnd) {
		this.formerEnd = formerEnd;
	}
	

}
