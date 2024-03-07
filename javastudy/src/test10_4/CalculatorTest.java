package test10_4;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//클래스형 참조변수
		ComleteCalc calc = new ComleteCalc();
		calc.description();// 오버라이드 되어 있다면 재정의 메서드가 호출된다.!!!
		System.out.println("------------------");
		
		//인터페이스 참조변수
		Calc calc1 = new ComleteCalc();
		calc1.description();
		System.out.println("------------------");
		
		//인터페이스내에 구현된 static 메서드 호출
		//구현 클래스 작성없이 바로 호출해서 사용이 가능하다.
		//접근방법 : 인터페이스명.메서드명(배열명)
		int [] arr = {10,20,30,40,50};
		System.out.println(Calc.total(arr));
		
		
	}

}
