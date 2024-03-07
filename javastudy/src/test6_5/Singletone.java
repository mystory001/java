package test6_5;

//싱글톤 패턴(Singletone pattern)
//특정 클래스가 하나의 객체만 생성되도록 프로그래밍하는 기법이다
//단계1) 생성자를 private으로 만들기
//단계2) 클래스 내부에 static으로 유일한 인스턴스 생성하기
//단계3) 외부에서 참조할 수 있는 public 메서드 만들기
//단계4) 실제로 사용하는 코드 만들기

public class Singletone {

	//단계2) 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static Singletone instance = new Singletone(); 
	
	private int id;
	private String name;
	
	//기본 생성자 : 단계1) 생성자를 private으로 만들기
	private Singletone() {
		this.id = 1000;
		this.name = "java";		
	}
	
	//단계3) 외부에서 참조할 수 있는 public 메서드 만들기
	public static Singletone getInstance() {
		System.out.println(" instance 객체 리턴");
		return instance;	//생성한 객체를 호출한 곳으로 돌려준다.!!	
	}
	

	//id, name 멤버 변수에 저장된 값을 불러오기
	//getter, setter 메서드 만들기
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





}
