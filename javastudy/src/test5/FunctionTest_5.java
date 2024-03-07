package test5;

public class FunctionTest_5 {

	//두 개의 정수와 하나의 연산자를 매개변수로 입력받아 더하기, 빼기, 곱하기, 나누기 결과를 모두 출력하는 함수를 정의하고 main함수에서 호출하는 프로그램 작성
	//반환값이 있고, 매개변수가 있는 경우
	//if~else if
	//switch
	/*
	public static int cal(char oper, int a, int b) {
		if(oper=='+') {
			System.out.println(a+b);
			return a+b;
		} else if (oper=='-') {
			System.out.println(a-b);
			return a-b; 
		} else if (oper=='*') {
			System.out.println(a*b);
			return a*b;
		} else if (oper=='/') {
			System.out.println(a/b);
			return a/b;
		} else {
			System.out.println("연산자를 제대로 입력");
			return 0;
		} 
		
	}*/
	
	/*
	public static int cal(char oper, int a, int b) {
		switch(oper) {
		case '+' : return a+b;
		case '-' : return a-b;
		case '*' : return a*b;
		case '/' : return a/b;
		default : return 0;
		}
	}
	*/
	
	
	//한 개의 정수를 매개변수로 입력 받아서 입력값이 양수, 음수, 0인지 문자열로 출력하는 함수를 정의하고 main 함수에서 호출하는 프로그램 작성
	//반환값 String, 매개변수값 int
	public static String func(int num) {
		/*
		String result;
		if(num>0) { 
			result="양수";
		} else if (num==0) {
			result="0";
		} else {
			result="음수";
		}
		return result;
		*/
		if(num>0) { 
			return "양수";
		} else if (num==0) {
			return "0";
		} else {
			return "음수";
		}
		
		
	}
	
	
	public static void main(String[] args) {
		/*
		int result = cal(' ',5,10);
		*/
		func(10);
		String result1 = func(10);
		System.out.println(result1);
		
	}

}
