package test5_1;

public class Person_Main {

	public static void main(String[] args) {
		
		/*
		//객체 생성
		Person p = new Person();
		p.show();
		System.out.println("---------------");
		p.name = "홀붕이";
		p.height = 194.7f;
		p.weight = (float)88.8;
		
		p.show();
		System.out.println("---------------");
		*/
		
		//생성자라는 특별한 메서드가 호출되어 객체를 생성하고 멤버 변수에 데이터값을 초기화
		//p1 객체가 생성할 때 멤버 변수는 메모리 공간만 확보되어있는 상태이며
		//컴파일이 되지 않음. 변수는 메모리 공간에 사용할 데이터값이 꼭 들어가 있어야 컴파일됨.
		//String 변수명 = null;
		//String형은 데이터값을 넣지 않고 변수를 사용하도록하려면 null로 지정
		//정수형,실수형은 데이터값을 넣지 않고 변수를 사용하도록하려면 0,0.0으로 지정
		
		Person p1 = new Person();
		p1.show();
		
		/*
		//변수를 선언하면 반드시 데이터값을 초기화시켜야함.
		String name;
		float height;
		float weight;
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		*/
		
		/*
		//변수에 데이터값이 초기화 되어서 변수에 새로운 값을 대입해서 사용가능
		String name = null;
		float height = 0f;
		float weight = 0f;
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		*/
		
	}

}
