package Model.InsaDTO;

public class InsaAuthInfo {
	private String id;
	private String email;
	private String name;
	private int kind;
	private String inSaNum;
	
	public InsaAuthInfo() {}
	public InsaAuthInfo(String id, String email, String name, int kind, String inSaNum) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.kind = kind;
		this.inSaNum = inSaNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public String getInSaNum() {
		return inSaNum;
	}
	public void setInSaNum(String inSaNum) {
		this.inSaNum = inSaNum;
	}
}