package test5;

import java.util.Scanner;

public class FunctionTest_2 {

	/*public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result; //호출한 곳으로 반환값(결과값)을 돌려준다.
	}
	*/
	
	//2개의 매개변수를 입력받아 더하기(sum), 빼기(sub), 곱하기(mul), 나누기(div)를 할 수 있는 함수를 정의하고 main 함수에서 호출하여 사용
	//매개변수 : 함수 내에서만 사용하는 변수
	//return 호출한 곳으로 반환값(결과값)을 돌려줌
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	//예외처리를 해야하는데
	public static int div(int a, int b) {
		return a / b;
	}
	
	
	
	
	public static void main(String[] args) {
		/*
		int sum = add(10, 20);
		System.out.println("함수 내에서 돌려받은 결과값 sum 변수 = " + sum);
		System.out.println(add(10,20)); //결과값 출력
		System.out.println("-------------------------");
		
		int num1 = 10; int num2 = 20;
		
		//기존 변수 내의 값을 함수의 매개변수값으로 넣기
		//publoc static int add(int n1, int n2)
		//ad(num1=10, num2=20);
		add(num1,num2);
		
		int sum1 = add(num1,num2);
		System.out.println("함수 내에서 돌려받은 결과값 sum 변수 = " + sum1);
		System.out.println(add(num1,num2)); //함수 내에서 돌려받은 결과값 출력
		 */
		int a =10;
		int b =5;

		
		System.out.println(sum(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
	
		
		
	}

}
