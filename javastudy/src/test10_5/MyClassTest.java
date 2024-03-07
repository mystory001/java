package test10_5;

interface X {	
	void x(); //추상 매서드
}

interface Y {
	void y(); //추상 메서드
}

//인터페이스 사이의 상속 : extends
interface MyInterface  extends X, Y{
	void method(); //추상 메서드
}

//구현 클래스 : 3개의 추상 메서드를 오버라이딩 시킨다. 
//클래스가 인터페이스를 구현 : implements
class MyClass implements  MyInterface{

	@Override
	public void x() {
		System.out.println("x() 메서드 오버라이드");		
	}
	
	@Override
	public void y() {
		System.out.println("y() 메서드 오버라이드");		
	}

	@Override
	public void method() {
		System.out.println("method() 메서드 오버라이드");			
	}	
		
}

public class MyClassTest {

	public static void main(String[] args) {
		
		//클래스형 참조변수
		MyClass mClass = new MyClass();
		mClass.x();
		mClass.y();
		mClass.method();
		System.out.println("------------------");
		
		//인터페이스형 참조변수
		//상위 인터페이스 X형으로 대입 : X 인터페이스에 선언된  추상 메서드를 오버라이드한 x() 메서드만 호출!!
		X xClass = mClass;
		//X xClass = new MyClass();
		xClass.x();
		System.out.println("------------------");
		
		//상위 인터페이스 Y형으로 대입 : Y 인터페이스에 선언된  추상 메서드를 오버라이드한 y() 메서드만 호출!!
		Y yClass = mClass; 
		//Y xClass = new MyClass();
		yClass.y();
		System.out.println("------------------");
		
		//MyInterface에 X, Y 인터페이스가 상속해 주었기 때문에 x(), y(), method() 모두 호출 가능!!!
		MyInterface iClass = mClass;
		//MyInterface  iClass  = new MyClass();
		iClass.x();
		iClass.y();
		iClass.method();
		
		
		
		
		

	}

}
