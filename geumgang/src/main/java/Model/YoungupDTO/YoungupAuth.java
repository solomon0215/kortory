package Model.YoungupDTO;

public class YoungupAuth {
	private String email;
	private String name;
	private int kind;// �α����� ����� ���� ��ü(��� �� =111,��� �� = 112), ���̵� =202, ȸ��=201, ����(����
						// =301,��ȹ=302,�λ�=303, ����=304)
	private String youngUpNum;//�����ȣ
	
	
	public YoungupAuth() {}
	public YoungupAuth(String email, String name, int kind, String youngUpNum) {
							super();
							this.email = email;
							this.name = name;
							this.kind = kind;
							this.youngUpNum = youngUpNum;
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
	public String getYoungUpNum() {
		return youngUpNum;
	}
	public void setYoungUpNum(String youngUpNum) {
		this.youngUpNum = youngUpNum;
	}
	
}
