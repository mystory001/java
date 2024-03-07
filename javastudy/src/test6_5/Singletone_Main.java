package test6_5;

public class Singletone_Main {

	public static void main(String[] args) {
		
		//싱글톤 패턴으로 작성된 클래스는 new 키워드로 객체생성 할 수 없다.!!
		//Singletone s = new Singletone ();
		
		//Singletone.getInstance(); 호출도 하고 결과값도 가지고 있다.
		//클래스내에서 유일하게 생성된 객체(instane)를 s1변수에 저장한다.
		Singletone s1 = Singletone.getInstance();
		System.out.println(s1);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println("-------------------");
		
		Singletone s2 = Singletone.getInstance();
		System.out.println(s2);
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println("-------------------");
		
		//클래스내에서 유일하게 생성된 객체(instane)의 멤버 변수 데이터값을 수정!!!
		s2.setId(2000);
		s2.setName("Programming");
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println("-------------------");
		
		
		

	}

}
