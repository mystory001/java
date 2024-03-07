package test12;

public class ExceptionTest {

	public static void main(String[] args) {
		
		//try~catch~finally 구문으로 예외처리해서 프로그램이 멈추지 않도록 만들어야 함
		//강제 예외 발생 : throw 키워드를 사용해서 처리함
		//try 문제(예외)가 발생할 수 있는 구문을 { } 안에 작성
		
		//Runtime Error
		//Error : 심각한 에러
		//Exception : 가벼운 에러(오류)
		//예외 : 프로그램 실행 도중에 발생할 수 있는 예기치 않는 상황이 발생을 대비하여 코드를 작성하는 것
		//예외가 발생하는 경우 : 0으로 나누는 경우, 배열 인덱스가 음수 또는 범위를 벗어나는 경우,
		//				 정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 경우,
		//				 부적절한 형 변환, 입출력을 위한 파일이 없는 경우
		
		//Throwalbe 클래스(Error 클래스, Exception 클래스)
		//Exception 클래스에는 검사 예외, 비검사 예외
		
		/*
		 * try{
		 *  수행코드
		 *  예외가 발생할 가능성이 있는 블록
		 * } catch(Exception 참조변수명){
		 *  예외가 발생했을 때 처리하는 블록
		 * } 
		 */
		
		/*
		 * throw 
		 * 실제로 exception을 던질 때 사용하는 키워드
		 * 에러를 강제로 발생시킬때도 사용 현재 메소드 에러를 처리한 후 상위 메소드에 에러 정보를 줌으로서 상위 메소드에서도 에러가 발생한 것을 감지
		 * 
		 * throws
		 * 현재 메소드에서 상위 메소드로 예외를 던지는 것
		 * 메소드나 생성자를 수행할 때 발생하는 Exception을 선언할 때 사용하는 키워드
		 * 예외를 자신이 처리하지 않고 자신을 호출하는
		 */
		
		int num = 10;
		int num1 = 0;
		
		//Runtime 오류 발생
//		int result = num / num1;
//		System.out.println("result = " + result);

		
		try { //문제(예외)가 발생할 수 있는 구문을 { } 안에 작성
			int result = num / num1;
			System.out.println("result = " + result);
			if (num1 == 0) {
//				ArithmeticException e = new ArithmeticException("num1 변수가 0입니다.");
//				throw e;
				throw new ArithmeticException("num1 변수가 0입니다.");
				//둘 중 하나를 선택해서 작성
			}			
		} catch (ArithmeticException e) {
			//ArithmeticException에서 처리할 내용을 작성
			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println(e.getMessage());
//			System.out.println(e.getStackTrace());
		} finally {
			//try문 내에서 예외가 발생하든 안하든 반드시 수행하는 구문임
			System.out.println("finally 예외가 발생하지 않아도 무조건 수행하는 구문");
		}


	}

		
	
}
