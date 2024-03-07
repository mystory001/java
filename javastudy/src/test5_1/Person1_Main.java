package test5_1;

public class Person1_Main {

	public static void main(String[] args) {
		//p객체를 생성할 때 멤버 변수에 데이터값을 초기화시키는 생성자 함수를 호출
		//기본생성자 Person1()호출 → 멤버 변수에 데이터값을 초기화
		Person1 p = new Person1();
		p.show();
		
		System.out.println("--------------");
		p.height = 175.5f;
		p.show();
		
		
	}

}
