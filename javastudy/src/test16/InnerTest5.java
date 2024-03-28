package test16;

class Some{
	
	private int a = 3;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}

public class InnerTest5 {

	public static void main(String[] args) {
		
		Some s1 = new Some();
		System.out.println("s1.getA() = " + s1.getA());
		
		s1.setA(10);
		System.out.println("s1.getA() = " + s1.getA());
		
		System.out.println("====================");
		
		//익명 객체 구현
		//기존의 클래스를 이용하여 멤버 변수와 멤버 메소드의 기능을 새로 구현
		//Some 클래스가 아닌 익명 클래스
		//블록의 맨 마지막에 ';'을 반드시 작성 요
		Some s2 = new Some() {

			//오버라이드로 기능 새로 구현
			private int a = 100;
			
			@Override
			public int getA() {
				return a;
			}

			@Override
			public void setA(int a) {
				this.a = a;
			}
			
		};//익명 객체 구현 시 마지막에 ';'을 반드시 작성 
		System.out.println("s2.getA() = " + s2.getA());
		s2.setA(200);
		System.out.println("s2.setA() = " + s2.getA());

	}

}
