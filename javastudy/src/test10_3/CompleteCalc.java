package test10_3;

//구현 클래스
//4개의 메서드를 구현해야 하는데 add(), subtract() 2개만 구헌해놓은 Calculator 추상 클래스를 상속 받음
//나머지 2개의 메서드times(), divide() 2개의 메서드를 구현함

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
	    //10 / 0  -> 오류발생!!!
		if(num2 != 0)	{	
			return num1 / num2;
		}
		else {
			//인터페이스내의 변수 : public static final int ERROR = -999999999;
			//인터페이스 변수 : 접근 형식)인터페이스명.변수명
		return Calc.ERROR;
	   }
	}
		//현재 클래스내에 새로운 메서드를 만들어서 추가
		public void showInfo() {
			System.out.println("Calc 인터페이스를 구현하였습니다.");
		}

}
