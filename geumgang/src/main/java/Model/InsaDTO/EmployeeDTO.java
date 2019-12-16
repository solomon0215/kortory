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
	char employeeGender;
	String employeePh;
	java.sql.Date employeeRegist;
	String employeeEmail;
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
	public char getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(char employeeGender) {
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
