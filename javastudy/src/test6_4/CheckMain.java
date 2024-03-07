//231211
package test6_4;

public class CheckMain {
	public static void main(String[] args) {
		
		//클래스 멤버에 접근(클래스명.메소드)
		System.out.println(Check.cv);
		Check.cm();
		System.out.println("-----------");
		
		//인스턴스 멤버에 접근
		Check ck = new Check();
		System.out.println(ck.iv);
		ck.im();
		System.out.println("-----------");
		
		System.out.println("인스턴스 멤버는 클래스 멤버에 접근 가능");
		System.out.println(ck.cv);		
		ck.cm();		
		
		
		
		
	}
}
