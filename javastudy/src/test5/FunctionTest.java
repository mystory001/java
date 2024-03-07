package test5;

public class FunctionTest {

	//함수(Function) : 하나의 기능을 수행하는 일련의 코드. 어떤 재료를 넣어서 새로운 값을 만드는 틀
	//함수는 정의와 호출로 이뤄짐.(함수 정의만 해놓은 상태에서 바로 사용할 수 없고, 호출을 해야만 가능)
	//형식 : 반환데이터형 함수이름 (매개변수 또는 인자(인수)) {수행할 내용 return 반환값;}
	//함수 정리
	//유형 1. 함수 내에서 처리한 결과값을 반환할 필요가 없고, 함수 내에서 수행에 필요한 데이터값을 넣어주지 않아도 되는 경우. 반환값이 없고, 매개변수가 없는 경우
	//※반환할 것이 없다면 void
	public static void add() {
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println(result);
		return;
	}
	//유형 2. 함수 내에서 처리한 결과값을 반환할 필요가 없고, 함수 내에서 수행에 필요한 데이터값을 넣어줘야하는 경우. 반환값이 없고, 매개변수가 있는 경우
	public static void add1(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return;
	}
	//유형 3. 함수 내에서 처리한 결과값을 반환할 필요가 있고, 함수 내에서 수행에 필요한 데이터값을 넣어줘야하는 경우. 반환값이 있고, 매개변수가 있는 경우
	//자료형
	public static int add2(int num1, int num2) {
		int result = num1 + num2;
		return result; //호출한 곳으로 결과값(반환값)을 돌려보냄.
	}
	
		
	public static void main(String[] args) {
	
		//함수호출 : 함수이름(매개변수값)
		//유형1 : 반환값이 없고, 매개변수가 없는 경우
		add();
		System.out.println("----------------");
		//유형2 : 반환값이 없고, 매개변수가 있는 경우
		add1(10,20);
		add1(20,40);
		System.out.println("----------------");
		//유형3 : 반환값, 매개변수가 있는 경우
		//int add2(num1,num2);
		add2(10,20); //호출, 함수 내에서 돌려보내준 값을 가지고 있음.
		int sum = add2(10,20);
		System.out.println(sum);
		System.out.println(add2(10,20));
		
		
		
		
		


	}

}
