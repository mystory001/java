package test12;
//메소드 호출할 때 예외처리
public class ExceptionTest1 {
	
	public static int divide(int n1, int n2) {

		if (n2 == 0) {
			// ArithmeticException e = new ArithmeticException();
			// throw e;
			throw new ArithmeticException();
		}

		int result = n1 / n2;
		return result;
	}

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 0;
		
		try {
			int result = divide(n1,n2);
			System.out.println("result = " + result);			
		} catch (ArithmeticException e) {
			System.out.println("n2는 0이 될 수 없습니다.");
			System.out.println(e.toString());
			System.out.println(e);
		} finally {
			System.out.println("예외가 발생하지 않아도 무조건 수행됨");
		}
		

	}
	
}
