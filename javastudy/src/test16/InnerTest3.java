package test16;

class OutClass1{
	
	private int num = 10;
	private static int sNum = 20;
	
	private InStaticClass inClass;
	
	public OutClass1() {
		inClass = new InStaticClass();
	}
	
	static class InStaticClass{ //정적 내부 클래스
		int inNum = 100; //정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200; //정적 내부 클래스의 정적 변수
		
		//정적 내부 클래스의 일반 메소드, 내부 인스턴스 메소드
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InstaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			//System.out.println("OutClass num = " + num +"(외부 클래스의 변수 사용)"); //외부 클래스의 객체가 생성되어 멤버 변수를 사용할 수 있어야 접근이 가능
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		//정적 내부 클래스의 정적 메소드, 내부 정적 메소드. static 변수만 사용 가능
		static void sTest() {
			//num += 10; //외부 클래스와 외부 클래스의 인스턴스 변수는 사용할 수 없음
			//InNum += 10;
			//System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용");
			System.out.println("InstaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			//System.out.println("OutClass num = " + num +"(외부 클래스의 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
	}	
}

public class InnerTest3 {

	public static void main(String[] args) {
		
		//정적 내부 클래스는 외부 클래스를 따로 생성하지 않고 정적 내부 클래스 생성 가능
		//외부클래스명.내부클래스명 객체명 = new 외부클래스명.내부클래스명();
		OutClass1.InStaticClass sInClass = new OutClass1.InStaticClass();
		sInClass.inTest();
		//정적 내부 클래스 내의 정적 메소드를 호출해서 사용
		OutClass1.InStaticClass.sTest();
	}

}
