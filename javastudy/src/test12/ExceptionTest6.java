package test12;

//사용자 정의 예외
//나이가 음수이거나 120보다 큰 경우에 예외 처리 만들기 
class AgeException extends Exception {

	// 기본생성자
	public AgeException() {
		super();
	}

	// 일반생성자
	// 상속을 받게 되면 부모(상위) 클래스의 생성자를 호출해서 멤버 변수값을 초기화 해야함
	public AgeException(String message) {
		// Exception 클래스의 생성자를 호출해서 멤버 변수에 데이터값을 초기화
		super(message); // 부모(상위)생성자 호출 해서 매개변수로 입력받은 문자열을 멤버 변수에 저장
	}
}

public class ExceptionTest6 {
//throws : 메소드를 호출하면서 메소드 쪽으로 예외처리를 떠넘김 
//throw : 강제로 예외 발생 시킴
	public static void ticketing(int age) throws AgeException {
		if (age < 0 || age > 120) {
			AgeException e = new AgeException("나이 입력이 잘못되었습니다.");
			throw e;
		} else {
			System.out.println("나이가 " + age + " 이므로 ticketing 되었습니다.");
		} 
	}

	public static void main(String[] args) {
		int age = 10;

		try {
			ticketing(age);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("사용자 정의 AgeException이 수정됨");
		}
//		try {
//			ticketing(age);
//		} catch (AgeException e) {
//			e.printStackTrace();
//		Exception 발생 경로를 추적하도록 표시해주는 메소드
//		}

	}
}

/*
 * package test12;

//사용자 정의 예외 : 나이가 0보다 작거나 120보다 큰 경우에 예외처리 만들기

class AgeException extends Exception {
	
	//기본 생성자
	public AgeException() {
		super();
	}
	
	//일반 생성자
	//상속을 받게 되면 부모(상위) 클래스의 생성자를 호출해서 멤버 변수값을 초기화해야 한다.
	//Exception(String message)생성자
	public AgeException(String message) {
		//Exception 클래스의 	Exception(String message)생성자를 호출해서 멤버 변수에 데이터값을 초기화
		super(message);		//부모 (상위) 생성자 호출해서 매개변수로 입력받은 문자열을 멤버 변수에 저장
	}
}


public class ExceptionTest6 {
	
	//throws : 현재 메서드가 예외를 처리하지 않고 자신을 호출한 메서드쪽으로 예외처리를 떠넘긴다.
	//throw : 강제로 예외 발생 시킴

	   //                                            -1
		public static void ticketing(int age) throws AgeException {
			//나이가 0보다 작거나 120보다 큰 경우에 예외처리 만들기
			
			//    -1             -1 
			if ( age < 0 || age > 120 ) {
				
				AgeException e = new AgeException("나이 입력이 잘못되었습니다.!!");
				throw e;
				
				//throw new AgeException("나이 입력이 잘못되었습니다.!!");
			} 
			
			else {
				System.out.println("나이가 " + age + "이상이므로 ticketing 되었습니다.!!!");
			}	
						
		}
	
	public static void main(String[] args)  {
		
		int age = 150;	
		
		try {
			//        -1
			ticketing(age);
			
		} catch (AgeException e) {
			
			System.out.println("나이가 " + age + "이므로 ticketing 되지 않았습니다.!!!");
			System.out.println(e.getMessage());
			//e.printStackTrace(); //Exception 발생 경로를 추적하도록 표시해주는 메서드
			
		} finally {
			System.out.println("사용자 정의 AgeExcrption 이 수행되었습니다.!!!");
		}
		
		
		
		}
		

}
*/