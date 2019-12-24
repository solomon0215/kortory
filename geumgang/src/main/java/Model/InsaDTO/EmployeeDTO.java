package Model.InsaDTO;

import java.io.Serializable;

import org.springframework.core.serializer.Serializer;

@SuppressWarnings("serial")
public class EmployeeDTO implements Serializable  {
	String employeeNum;
	String employeeId;
	String employeePw;
	java.sql.Date employeeBirth;
	String employeeName;
	String employeeGender;
	String employeePh;
	java.sql.Date employeeRegist;
	String employeeEmail;
	Integer employeeKind;
	
	public Integer getEmployeeKind() {
		return employeeKind;
	}
	public void setEmployeeKind(Integer employeeKind) {
		this.employeeKind = employeeKind;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeePw() {
		return employeePw;
	}
	public void setEmployeePw(String employeePw) {
		this.employeePw = employeePw;
	}
	public java.sql.Date getEmployeeBirth() {
		return employeeBirth;
	}
	public void setEmployeeBirth(java.sql.Date employeeBirth) {
		this.employeeBirth = employeeBirth;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeePh() {
		return employeePh;
	}
	public void setEmployeePh(String employeePh) {
		this.employeePh = employeePh;
	}
	public java.sql.Date getEmployeeRegist() {
		return employeeRegist;
	}
	public void setEmployeeRegist(java.sql.Date employeeRegist) {
		this.employeeRegist = employeeRegist;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	

}
