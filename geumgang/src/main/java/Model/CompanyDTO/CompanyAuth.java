package Model.CompanyDTO;

public class CompanyAuth {
	private String id;
	private String email;
	private String name;
	private int kind;//�α����� ����� ���� ��ü(��� �� =111,��� �� = 112), ���̵� =202, ȸ��=201, ����(���� =301,��ȹ=302,�λ�=303, ����=304)
	
	public CompanyAuth() {
	}
	public CompanyAuth(String id, String email, String name, int kind) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.kind = kind;
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
	
		
}
