package test16;

class OutClass2{
	
	private int num = 10;
	private static int sNum = 20;
	
	//지역 내부 클래스(local inner class)
	public void outClassMethod(){
		
		class LocalClass{
			
			int inNum = 100;
			static int sInNum = 200;
		
			//내부 인스턴스 메소드
			void inTest() {
				System.out.println("LocalClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
				System.out.println("LocalClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
				System.out.println("OutClass2 num = " + num +"(외부 클래스의 변수 사용)"); //외부 클래스의 객체가 생성되어 멤버 변수를 사용할 수 있어야 접근이 가능
				System.out.println("OutClass2 sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			}
			static void sTest() {
				//System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용");
				System.out.println("LocalClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
				//System.out.println("OutClass2 num = " + num +"(외부 클래스의 변수 사용)");
				System.out.println("OutClass2 sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			}
		}
	
		//메소드 내부에서 객체 생성
		LocalClass lc = new LocalClass();
		lc.inTest();
	
	}
}	

public class InnerTest4 {

	public static void main(String[] args) {
		
		//외부 클래스 객체 생성
		OutClass2 outClass = new OutClass2();
		outClass.outClassMethod(); 

	}
}
