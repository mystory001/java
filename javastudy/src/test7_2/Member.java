package test7_2;

public class Member {

	private String id;
	private String password;
	private String name;
	
	//기본 생성자
	public Member() { }
	
	//일반 생성자
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	//멤버 변수내의 데이터값을 출력하는 메서드
	public void show() {
		System.out.println("id = " + this.id + " , password = " + this.password + " , name = " + this.name); 
	}
	
	//getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
