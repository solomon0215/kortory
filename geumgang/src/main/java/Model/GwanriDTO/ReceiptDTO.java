package Model.GwanriDTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ReceiptDTO implements Serializable {
	Integer receiptNum;
	Integer receiptAppNum;
	Integer workConNum;
	String receiptSubject;
	String receiptPurpose; 
	String receiptFile;
	Integer receiptPrice;
	String receiptApp;
	public Integer getReceiptNum() {
		return receiptNum;
	}
	public void setReceiptNum(Integer receiptNum) {
		this.receiptNum = receiptNum;
	}
	public Integer getReceiptAppNum() {
		return receiptAppNum;
	}
	public void setReceiptAppNum(Integer receiptAppNum) {
		this.receiptAppNum = receiptAppNum;
	}
	public Integer getWorkConNum() {
		return workConNum;
	}
	public void setWorkConNum(Integer workConNum) {
		this.workConNum = workConNum;
	}
	public String getReceiptSubject() {
		return receiptSubject;
	}
	public void setReceiptSubject(String receiptSubject) {
		this.receiptSubject = receiptSubject;
	}
	public String getReceiptPurpose() {
		return receiptPurpose;
	}
	public void setReceiptPurpose(String receiptPurpose) {
		this.receiptPurpose = receiptPurpose;
	}
	public String getReceiptFile() {
		return receiptFile;
	}
	public void setReceiptFile(String receiptFile) {
		this.receiptFile = receiptFile;
	}
	public Integer getReceiptPrice() {
		return receiptPrice;
	}
	public void setReceiptPrice(Integer receiptPrice) {
		this.receiptPrice = receiptPrice;
	}
	public String getReceiptApp() {
		return receiptApp;
	}
	public void setReceiptApp(String receiptApp) {
		this.receiptApp = receiptApp;
	} 
	
	

}
