package Model.CompanyDTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CompanyDTO implements Serializable{
	String companyId; //아이디
	String companyRegNum; //사업자 번호
	String companyPw;//비밀번호
	String companyName;//업체명
	String companyAddr;//업체 주소
	String companyPh; //업체 전화번호
	String companyType;//업체 유형(공기업/민간)
	String companyEmail;//업체 이메일주소
	String companyPerApp; // 개인정보 수집 절차 동의 여부
	String companyAggApp;// 업체정보 제공 동의여부
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
	public String getCompanyPerApp() {
		return companyPerApp;
	}
	public void setCompanyPerApp(String companyPerApp) {
		this.companyPerApp = companyPerApp;
	}
	public String getCompanyAggApp() {
		return companyAggApp;
	}
	public void setCompanyAggApp(String companyAggApp) {
		this.companyAggApp = companyAggApp;
	}
	
}
