package test8_1;

//1.오버라이딩(Overriding) : 상속시에만 사용하는 방법으로 메서드 재정의라고 한다.
//부모(상위) 클래스로부터 물려 받은 메서드를 자식(하위) 클래스에서  재정의해서 사용한다.

//1)상위 클래스로부터 메서드를 상속 받았지만 하위 클래스에서 다르게 동작해야 하는 경우에 사용한다.
//2)상위 클래스에 작성된 메서드를 더 이상 사용하지 않고 하위 클래스의 메서드로 사용하게 한다.
//3)하위 클래스에서 메서드를 오버라이딩 할 경우
//->****상위 클래스에 작성된 메서드 이름, 리턴 타입, 매개변수 개수가 모두 같도록 작성되어야 한다.
//4)부모(상위) 클래스의 메서드의 호출이 아닌 생성된 인스턴스의 메서드를 호출하는 것이다.
//5)인스턴스의 메서드가 호출되는 기술을 '가상 메서드' 라고 한다.

//2.어노테이션 (annotation)
//컴파일러에게 특별한 정보를 제공해주는 역할을 하는 주석이다.
//@overriding 어노테이션은 재정의된 메서드라는 의미 이다.

class TestA{
	
	int num;
	
	//생성자가 하나라도 정의되어 있지 않으면 컴파일러가 기본 생성자를 추가해서 멤버변수에 데이터값을 초기화해서 객체를 생성한다.
	public TestA() { }
		
	void aaa() {		
		System.out.println("부모 (TestA) 클래스의 aaa() 출력");
	}
	
	void show() {
		System.out.println("num = " + num);
	}
	
}


//TestA 클래스를 상속받은 하위 클래스 TestA_1클래스
//형식) class 새로운클래스명 extends 상속해 주는 클래스명
class TestA_1 extends TestA{
	
	//생성자가 하나라도 정의되어 있지 않으면 컴파일러가 기본 생성자를 추가해서 멤버변수에 데이터값을 초기화해서 객체를 생성한다.
	public TestA_1() {
		//부모 생성자 중에서 기본 생성자 (public TestA() { }) 를 호출해서 부모(상위) 클래스의 super.num 멤버 변수에 
		//데이터값을 초기화해서 부모(상위) 클래스의 객체를 먼저 생성해준다.
		super();
	}

	@Override
	void aaa() {
		System.out.println("자식 (TestA_1) 클래스의 aaa() 메서드 호출");
	}

	@Override
	void show() {
		System.out.println("자식 (TestA_1) 클래스의 show() 메서드 호출");
	}	
	
}

public class TestA_Main {

	public static void main(String[] args) {
		
		TestA_1 t1 = new TestA_1();
		t1.aaa();
		t1.show();
		
	}

}
