package test17;

//함수형 인터페이스 : 람다식을 만들기 위한 인터페이스
@FunctionalInterface
interface PrintString{
	//추상 메소드
	void showString(String str);
}
/*
class aa implements PrintString{
	@Override
	public void showString(String str) {
		System.out.println("showString() 메소드 구현");
		System.out.println(str);
	}
}
*/
public class TestLambda1 {
	
	//매개변수로 전달하는 람다식
	//								lambda 함수 인터페이스로 구현한 익명구현 객체
	//								람다식(익명함수)이 들어있는 변수
	public static void showMyString(PrintString p) {
		p.showString("매개변수를 인터페이스형으로 받음. 메소드의 매개변수로 람다식을 대입한 변수 전달");
	}
	
	
	//람다식을 반환하는 메소드 : 반환형 PrintString
	public static PrintString returnString() {
//		PrintString str = s -> System.out.println(s + "returnString()");
//		return str;
		return s -> System.out.println(s+"returnString()"); //호출한 곳으로 돌려보낸다.
	}

	public static void main(String[] args) {
		
		/*
		//인터페이스를 구현한 클래스로 사용하는 방법(객체 기반)
		aa a1 = new aa();
		a1.showString("Override 시켜 구현한 메소드 호출");
		
		System.out.println("============================");
		
		//인터페이스 변수
		PrintString ps = new aa();
		ps.showString("인터페이스 변수로 Override 시켜 구현한 메소드 호출");
		*/

		/*
		//익명 클래스, 익명 구현 객체로 사용하는 방법
		PrintString ps1 = new PrintString() {
			
			@Override
			public void showString(String str) {
				System.out.println("showString() 익명 메소드 구현");
				System.out.println(str);
			}
		};
		ps1.showString("익명 클래스, 익명 구현 객체를 생성");
		*/
		
		//람다식으로 사용하는 방법
		//람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식 구현부 호출 -> 수식 형태로 구분(익명 함수 형태)
		PrintString lambdaStr = str -> System.out.println(str);
		lambdaStr.showString("람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식 구현부 호출");
		//public static void showMyString(PrintString p) 람다식을 매개변수로 전달받은 함수 호출 확인
		showMyString(lambdaStr);
		
		System.out.println("============================");
		
		//람다식 반환받기 : 람다식을 변수에 대입
		PrintString reStr = returnString();
		reStr.showString("PrintString ");
		
		//
		showMyString(lambdaStr);
		showMyString(reStr);
	}

}
