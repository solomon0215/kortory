package Model.KihoekDTO;

public class KihoekAuthInfo {
	private String id;
	private String email;
	private String name;
	private int kind;  //로그인한 사람의 형태 업체(계약 전 =111,계약 후 = 112), 가이드 =202, 회원=201, 직원(관리 =301,기획=302,인사=303, 영업=304)
	private String num;
	

	public KihoekAuthInfo(String id, String email, String name, int kind, String num) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.kind = kind;
		this.num = num;
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
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
}