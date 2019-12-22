package Model.GwanriDTO;

public class GwanriAuthInfo {
	private String email;
	private String name;
	private int kind;
	private String gwanRiNum;
	
	
	public GwanriAuthInfo() {}
	public GwanriAuthInfo(String email, String name, int kind, String gwanRiNum) {
							super();
							this.email = email;
							this.name = name;
							this.kind = kind;
							this.gwanRiNum = gwanRiNum;
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
	public String getgwanRiNum() {
		return gwanRiNum;
	}
	public void setgwanRiNum(String gwanRiNum) {
		this.gwanRiNum = gwanRiNum;
	}
	
}
