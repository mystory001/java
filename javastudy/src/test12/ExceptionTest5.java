package test12;

public class ExceptionTest5 {

	// throws : 현재 메소드가 예외를 처리하지 않고 자신을 호출한 메소드쪽으로 예외처리를 떠넘김

	// 현재 메소드가 예외를 처리하지 않고 자신을 호출한 메소드쪽으로 예외 처리를 떠넘김
	// 메소드의 매개변수 뒤에 throws ArithmeticException 예외 클래스를 지정
	public static int divide(int n1, int n2) throws ArithmeticException {
		int result = n1 / n2;
		return result;
	}

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 0;
		try {
			int result = divide(n1, n2);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외가 발생 유무에 상관없이 반드시 수행됨");
		}

	}

}

/*
 * package test12;

//throws : 현재 메서드가 예외를 처리하지 않고 자신을 호출한 메서드쪽으로 예외처리를 떠넘긴다.

public class ExceptionTest5 {
	
	//현재 메서드가 예외를 처리하지 않고 자신을 호출한 메서드쪽으로 예외처리를 떠넘긴다.
	//메서드의 매개변수 뒤에 throws ArithmeticException 예외 클래스를 지정
	
	//                                    10,           0
	public static int divide(int num, int num1) throws ArithmeticException{
		int result = num / num1;
		return result; 
	}


	public static void main(String[] args) {
	
		int num = 10;
		int num1 = 0;
		
		try {
		//int result = num / num1;
		//                           10       0
		int result = divide(num, num1);
		
		System.out.println("result = " + result);
		
		} catch (ArithmeticException e ) {
			System.out.println("0으로 나눌수 없습니다.!!!");
			System.out.println(e.getMessage());
			
		} catch (Exception e ) {
			System.out.println("기타 예외 발생.!!!");
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("예외가 발생하든 하지 않든 반드시 수행되는 구문!!!");
		}

	}

}

*/