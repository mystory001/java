package test10_3;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 =  5;
		
		//구현클래스를 객체로 생성해서 일반 클래스 형태로 사용하는 방법이다!!
		//클래스형 참조변수
		CompleteCalc calc = new  CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo(); //호출가능 -> CompleteCalc 클래스내에서 추가해놓은 메서드
		System.out.println("----------------------");
		
		//인터페이스 내에 선언되어 있지 않은 메서드는 호출할 수 없다.!!!
		//인터페이스 참조변수 = new 구현클래스();
		Calc calc1 = new  CompleteCalc();
		System.out.println(calc1.add(num1, num2));
		System.out.println(calc1.subtract(num1, num2));
		System.out.println(calc1.times(num1, num2));
		System.out.println(calc1.divide(num1, num2));
		//calc1.showInfo();// 사용(호출)할 수 없음 -> CompleteCalc 클래스내에서 추가해놓은 메서드
	}

}
