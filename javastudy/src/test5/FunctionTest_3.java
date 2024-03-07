package test5;

import java.util.Scanner;

public class FunctionTest_3 {

	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 입력");
		int a = sc.nextInt();
		System.out.println("정수2 입력");
		int b = sc.nextInt();
		
		System.out.println(sum(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		

	}

}
