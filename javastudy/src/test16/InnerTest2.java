package test16;

class OutClass{ //외부 클래스
	
	private int num = 10; //외부 클래스 private 변수
	private static int sNum = 20; //외부 클래스 정적 변수
	
	private InClass inClass; //내부 클래스 자료형 변수를 먼저 생성
	
	//외부 클래스 디폴트 생성자. 외부 클래스가 생성된 후에 내부 클래스 생성 가능
	public OutClass() {
		inClass = new InClass();
	}
	
	//내부 클래스 작성 : private 접근 제어자를 지정하게 되면 다른 클래스에서 접근 할 수 없음
	//private class InClass{
	class InClass{ //인스턴스 내부 클래스
		int inNum = 100; //내부 클래스의 인스턴스 변수
		//static int sInNum = 200; //인스턴스 내부 클래스에 정적 변수 선언 불가능
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
			System.out.println("InClass innum = " + inNum + "(내부 클래스의 인스턴스 변수");
		}
	}
		
		//static void sTest(){} //정적 메소드 정의 불가능
			
		public void usingClass() { //외부 일반 메소드 : 외부 클래스에서 내부 클래스의 메소드를 호출해서 사용
			inClass.inTest(); //내부 클래스 메소드 호출
		}
}

public class InnerTest2 {

	public static void main(String[] args) {
		
		//외부 클래스 생성 후 내부 클래스를 생성
		//외부 클래스를 먼저 생성하지 않고 인스턴스 내부 클래스를 사용할 수 없음
		//외부 클래스의 객체 생성 시 내부 클래스도 동시에 객체 생성
		OutClass outClass = new OutClass();
		outClass.usingClass(); //내부 클래스 기능 호출
		System.out.println("================");
		//private으로 지정하지 않은 내부 클래스는 다른 클래스에서 인스턴스 내부 클래스 생성이 가능
		//외부 클래스 생성 후 내부 클래스 생성
		OutClass outClass1 = new OutClass();
		outClass1.usingClass();
		//내부 클래스의 멤버에 접근
		//외부클래스.내부클래스명 객체명 = 외부클래스객체명.new 내부클래스명
		OutClass.InClass inClass = outClass1.new InClass();
		inClass.inTest();
		
		
	}

}
