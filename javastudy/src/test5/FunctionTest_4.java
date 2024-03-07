package test5;

public class FunctionTest_4 {
	/*
	public static void printGreeting(String name) {
		System.out.println(name + " 님 안녕하세요.");
		return;
	}
	
	public static void printGreeting1(String name) {
		for(int i = 1; i<=10; i++) {
			System.out.println(name + " 님 안녕하세요.");	
		}
		return;
	}
	*/	
	
	//2개의 정수를 매개변수로 입력받아 나누기 연산을 수행하는 함수를 정의
	//조건 : 2번째 매개변수가 0이면 함수 수행을 멈추고, 2번째 매개변수가 0이 아니면 나누기 연산을 수행. main함수에서 호출하는 프로그램 작성
	
	public static void divide(int a, int b) {
		if(b==0) {
			System.out.println("나누는 수는 0이 될 수 없음");
			return;
		}
		else { int result = a/b;
		System.out.println(a+"/"+b+"=" + result);
		}
	}
	
	
	public static void main(String[] args) {
		divide(10,0);
		
		/*printGreeting1("자바");*/
		

	}

}
