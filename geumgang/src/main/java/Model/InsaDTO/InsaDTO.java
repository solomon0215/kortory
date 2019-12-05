package Model.InsaDTO;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class InsaDTO implements Serializable {
	String insaName; 
	Date insaBirth;
	String insaEmail;
	String insaGender;
	String insaId;
	String insaPw;
	String insaPh;
	Date insaRegist;
	
	public String getInsaName() {
		return insaName;
	}
	public void setInsaName(String insaName) {
		this.insaName = insaName;
	}
	public Date getInsaBirth() {
		return insaBirth;
	}
	public void setInsaBirth(Date insaBirth) {
		this.insaBirth = insaBirth;
	}
	public String getInsaEmail() {
		return insaEmail;
	}
	public void setInsaEmail(String insaEmail) {
		this.insaEmail = insaEmail;
	}
	public String getInsaGender() {
		return insaGender;
	}
	public void setInsaGender(String insaGender) {
		this.insaGender = insaGender;
	}
	public String getInsaId() {
		return insaId;
	}
	public void setInsaId(String insaId) {
		this.insaId = insaId;
	}
	public String getInsaPw() {
		return insaPw;
	}
	public void setInsaPw(String insaPw) {
		this.insaPw = insaPw;
	}
	public String getInsaPh() {
		return insaPh;
	}
	public void setInsaPh(String insaPh) {
		this.insaPh = insaPh;
	}
	public Date getInsaRegist() {
		return insaRegist;
	}
	public void setInsaRegist(Date insaRegist) {
		this.insaRegist = insaRegist;
	}
	

}
