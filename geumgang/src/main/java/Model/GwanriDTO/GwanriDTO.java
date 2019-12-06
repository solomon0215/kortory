package Model.GwanriDTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class GwanriDTO implements Serializable {
	
	String GwanRiNum;
	String GwanRiId;
	String GwanRiPw;
	Date GwanRiBirth;
	String GwanRiName;
	String GwanRiGender;
	String GwanRiPh;
	Date GwanRiRegist;
	String GwanRiEmail;
	
	public String getGwanRiNum() {
		return GwanRiNum;
	}
	public void setGwanRiNum(String gwanRiNum) {
		GwanRiNum = gwanRiNum;
	}
	public String getGwanRiId() {
		return GwanRiId;
	}
	public void setGwanRiId(String gwanRiId) {
		GwanRiId = gwanRiId;
	}
	public String getGwanRiPw() {
		return GwanRiPw;
	}
	public void setGwanRiPw(String gwanRiPw) {
		GwanRiPw = gwanRiPw;
	}
	public Date getGwanRiBirth() {
		return GwanRiBirth;
	}
	public void setGwanRiBirth(Date gwanRiBirth) {
		GwanRiBirth = gwanRiBirth;
	}
	public String getGwanRiName() {
		return GwanRiName;
	}
	public void setGwanRiName(String gwanRiName) {
		GwanRiName = gwanRiName;
	}
	public String getGwanRiGender() {
		return GwanRiGender;
	}
	public void setGwanRiGender(String gwanRiGender) {
		GwanRiGender = gwanRiGender;
	}
	public String getGwanRiPh() {
		return GwanRiPh;
	}
	public void setGwanRiPh(String gwanRiPh) {
		GwanRiPh = gwanRiPh;
	}
	public Date getGwanRiRegist() {
		return GwanRiRegist;
	}
	public void setGwanRiRegist(Date gwanRiRegist) {
		GwanRiRegist = gwanRiRegist;
	}
	public String getGwanRiEmail() {
		return GwanRiEmail;
	}
	public void setGwanRiEmail(String gwanRiEmail) {
		GwanRiEmail = gwanRiEmail;
	}
}
