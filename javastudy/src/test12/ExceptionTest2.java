package test12;

public class ExceptionTest2 {

	public static void divide(int n1, int n2) {
		try {
			int result = n1 / n2;
			System.out.println("result = " + result);

			if (n2 == 0) {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException e) {
			System.out.println("n2는 0이 될 수 없습니다.");
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		//public static void divide()메소드 호출
		divide(n1, n2);
	}

}
