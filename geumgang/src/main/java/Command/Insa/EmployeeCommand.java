package Command.Insa;

import java.util.Date;


public class EmployeeCommand {
	public String employeeNum;
	public String employeeId;
	public String employeePw;
	public String employeePwCon;
	public String employeeBirth;
	public String employeeName;
	public char employeeGender;
	public String employeePh;
	public String employeeRegist;
	public String employeeEmali;
	public String employeeKind;
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
	public String getEmployeeBirth() {
		return employeeBirth;
	}
	public void setEmployeeBirth(String employeeBirth) {
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
	public String getEmployeeRegist() {
		return employeeRegist;
	}
	public void setEmployeeRegist(String employeeRegist) {
		this.employeeRegist = employeeRegist;
	}
	public String getEmployeeEmali() {
		return employeeEmali;
	}
	public void setEmployeeEmali(String employeeEmali) {
		this.employeeEmali = employeeEmali;
	}
	
	public String getEmployeePwCon() {
		return employeePwCon;
	}
	public void setEmployeePwCon(String employeePwCon) {
		this.employeePwCon = employeePwCon;
	}
	public boolean isPwEqualToPwCon() {
		if(employeePw.equals(employeePwCon)) return true;
		return false;
	}
 
}
