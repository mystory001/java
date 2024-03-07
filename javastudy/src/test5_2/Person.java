package test5_2;

public class Person {

	String name;
	float height;
	float weight;
	
	
	//생성자
	//기본생성자
	//멤버 변수에 각 자료형이 가지고 있는 기본값으로 초기화시켜줌
	//클래스 내에 생성자(메서드)가 지정하지 않은 경우 컴파일러가 자동으로 기본 생성자 형식을 만들고 객체 생성
	Person(){}
	
	
	//일반 메서드
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("체중 : " + height);
		System.out.println("신장 : " + weight);
	}
	
	
}
