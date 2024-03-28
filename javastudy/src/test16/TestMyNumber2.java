package test16;

//함수형 인터페이스
@FunctionalInterface
interface Calc{
	int calc(int x, int y);
}

public class TestMyNumber2 {
// 메소드에 매개변수로 익명함수(람다식)를 전달하여 사용할 수 있음	
//						        익명함수(람다식), 정수형 데이터 값 1, 정수형 데이터 값 2
	public static void Calc_func(Calc calc, int a, int b) {
		
		int result = calc.calc(a, b);
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		
		//더하기
		Calc calc1 = (x, y) -> x+y;
		
		
		//최댓값
		Calc calc2 = (x, y) -> (x>y)? x : y;
		
		//x~y까지의 합계
		Calc calc3 = (x, y) -> {
		int sum = 0;
		for(int i = x; i<=y; i++) {
			sum += i;
		}
		return sum;
		};
		
		System.out.println(calc1.calc(1, 10));
		System.out.println(calc2.calc(1, 10));
		System.out.println(calc3.calc(1, 10));
		
		System.out.println("============================");
		
		//Calc_func 함수 호출
		Calc_func(calc1, 5, 10);
		Calc_func(calc2, 5, 10);
		Calc_func(calc3, 5, 10);
	}

}
