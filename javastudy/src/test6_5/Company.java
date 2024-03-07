package test6_5;

public class Company {
	
	//2단계 : 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static Company instance = new Company(); 
	
	
	//1단계 : 생성자를 private으로 만들기
	private Company() {
		
	}
	
	//3단계 : 외부에서 참조할 수 있는 public 메서드 만들기
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
