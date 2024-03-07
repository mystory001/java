package test12;
//다중 예외 처리
public class ExceptionTest3 {

	public static void main(String[] args) {
		
		try {
		
		int[] arr = {1,2,3};
		System.out.println(arr[5]);
		System.out.println(3/0);
		Integer.parseInt("a");
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("기타 예외 발생");
		} finally {
			System.out.println("예외와 상관없이 항상 수행되는 구문");
		}
		
	}

}
