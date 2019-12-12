package Command.User;

public class UserFormCommand {
	String userId;
	String userPw;
	String userPwCon;
	String userEmail;
	String userPh;
	String userAddr;
	String userName;
	String userGender;
	Integer confirmNum;
	
	public boolean isPwEqualToPwCon() {
		return this.userPw.equals(this.userPwCon);
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserPwCon() {
		return userPwCon;
	}
	public void setUserPwCon(String userPwCon) {
		this.userPwCon = userPwCon;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPh() {
		return userPh;
	}
	public void setUserPh(String userPh) {
		this.userPh = userPh;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}	
	
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public Integer getConfirmNum() {
		return confirmNum;
	}
	public void setConfirmNum(Integer confirmNum) {
		this.confirmNum = confirmNum;
	}	
		
}
