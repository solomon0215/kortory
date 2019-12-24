package Command.Insa;

import java.util.Date;


public class EmployeeCommand {
	public String employeeId;
	public String employeePw;
	public String employeePwCon;
	public String employeeBirth;
	public String employeeName;
	public String employeeGender;
	public String employeePh;
	public String employeeRegist;
	public String employeeEmail;
	public Integer employeeKind;
	
	
	public Integer getEmployeeKind() {
		return employeeKind;
	}
	public void setEmployeeKind(Integer employeeKind) {
		this.employeeKind = employeeKind;
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
	public String getEmployeeRegist() {
		return employeeRegist;
	}
	public void setEmployeeRegist(String employeeRegist) {
		this.employeeRegist = employeeRegist;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
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
