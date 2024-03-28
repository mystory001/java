package test16;

//외부 클래스
class OuterClass{
	int a = 3;
	static int b = 4;
		
	//내부 클래스
	class Inner{
		int c = 5;
		
		public void innerMethod() {
			System.out.println("inner innerMethod()");
			System.out.println("c 변수값 출력 : " + c);
		}
	}
}

public class InnerTest1 {

	public static void main(String[] args) {
		
		System.out.println("외부 클래스");
		OuterClass oc = new OuterClass(); //외부클래스 객체 생성
		System.out.println("OuterClass a = " + oc.a);
		System.out.println("OuterClass b = " + OuterClass.b);
		
		System.out.println("내부 클래스");
		OuterClass.Inner i = oc.new Inner(); //내부클래스 객체 생성
		System.out.println("Inner c = " + i.c);
		i.innerMethod(); //내부클래스의 method 호출해서 사용
		
		
		//외부클래스부터 객체를 먼저 생성한 후 내부클래스 객체를 생성해야함
		//내부클래스 객체 생성 형식 : 외부클래스명.내부클래스명 객체명 = 외부클래스생성된객체명.new 내부클래스명();
	}

}
