//231130
package test5_2;

public class Person_Main2 {

	public static void main(String[] args) {
		//기본 생성자 호출해서 객체(인스턴스)를 생성하고 초기화된 멤버 변수 내의 데이터값 출력
		System.out.println("1");
		Person2 p1 = new Person2();
		System.out.println("------------");
		
		//이름을 입력 받아야만 객체(인스턴스)를 생성하는 일반 생성자로 생성하고 초기화된 멤버 변수 내의 데이터값을 출력
		System.out.println("2");
		Person2 p2 = new Person2("abc");
		p2.show();
		System.out.println("------------");
		//이름,신장을 입력 받아야만 객체(인스턴스)를 생성하는 일반 생성자로 생성하고 초기화된 멤버 변수 내의 데이터값을 출력
		System.out.println("3");
		Person2 p3 = new Person2("asdf", 123.45f);
		p3.show();
		System.out.println("------------");
		//이름,신장,체중을 입력 받아야만 객체(인스턴스)를 생성하는 일반 생성자로 생성하고 초기화된 멤버 변수 내의 데이터값을 출력
		System.out.println("4");
		Person2 p4 = new Person2("이순신",175,75f);
		p4.show();
		
	}

}
