package test10_2;

interface Calc {
	
	//인터페이스 내의 변수 지정 : 어디서나 공유해서 동일한 값으로 사용할 수 있도록 변수내의 데이터값을 상수화 시키는 개념이다.
	//형식) public static final 자료형 변수명 = 값; 
	//public static final 을 지정하지 않으면 컴파일러가 자동으로 붙여준다.!!
	public static final double PI = 3.14;
	public static final int ERROR = -999999999;
	
	//인터페이스 내의 변수 지정 : 추상 메서드 형식으로 지정한다.
	//public abstract 반환값자료형 메서드명 (매개변수); 
	//public abstract를 지정하지 않으면 컴파일러가 자동으로 붙여준다.!!
	
	public abstract int add(int num1, int num2); //더하기 기능
	public abstract int subtract(int num1, int num2); //빼기 기능
	public abstract int times(int num1, int num2); //곱하기 기능
	public abstract int divide(int num1, int num2); //나누기 기능
}

//구현 클래스 작성 : Calc 인터페이스내의 메서드 중에서 add(), subtract() 메서드만 구현
//times(), divide() 메서드는 구현되지 않았으므로 추상클래스로 만들어 주어야 한다.
//Calculator 구현 클래스는 abstract 제어자를 클래스명 앞에 붙여 주어야 한다.
//추상 메서드가 하나라도 존재하면 자동으로 추상 클래스가 된다.!!
abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {		
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}	
	
}

//Calculator 추상 클래스를 상속 받음 : times(), divide() 메서드는 구현되지 않았다.
//times(), divide() 메서드만 구현 : 더 이상 추상클래스가 아닌 일반 클래스가 된다.
class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	//나누기 연산은 뒤쪽 나누어 주는 숫자가 0이 되면 오류 발생 !!!
	//예) 10 / 0 -> 오류처리!!
	@Override
	public int divide(int num1, int num2) {
		
		if(num2 != 0)	{	
			return num1 / num2;
		}
		else {
			//인터페이스내의 변수 : public static final int ERROR = -999999999;
			//인터페이스 변수 : 접근 형식)인터페이스명.변수명
		return 	Calc.ERROR;
		}
	}	
	
	//클래스내에 새로운 메서드를 만들어서 추가
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
}

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		//1.클래스형으로 객체를 생성해서 사용
		CompleteCalc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		System.out.println("-------------------");
		
		
		//2.인터페이스 형으로 호출해서 사용
		//인터페이스로 구현한 클래스가 있을때 그 클래스는 해당 인터페이스형으로 묵시적 형변환이 이루어진다.
		//형변환 되었을때 사용할 수 있는 메서드는 인터페이스에서 선언한 메서드뿐이다.
		//showInfo() 메서드는 존재하지 않는다.
		//인터페이스 참조변수 =  new 구현클래스();
		Calc  calc1 = new CompleteCalc();
		System.out.println(calc1.add(num1, num2));
		System.out.println(calc1.subtract(num1, num2));
		System.out.println(calc1.times(num1, num2));
		System.out.println(calc1.divide(num1, num2));
		//calc1.showInfo(); //Calc 인터페이스에는 없다. -> 인터페이스형으로 호출할 수 없다.
		
		
		
		
		
		
	}

}
