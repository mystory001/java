package test10_3;

//Calc 인터페이스를 구현하는 클래스
//구현 클래스 작성 -> 4개의 메서드를 구현해야 하는데 add(), subtract() 2개반 구헌했기 때문에
//추상 클래스로 만들어 주어야 한다.(클래스명 앞에 abstract를 붙여준다.)
public abstract class Calculator implements  Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
				return num1 - num2;
	}
	
	
}
