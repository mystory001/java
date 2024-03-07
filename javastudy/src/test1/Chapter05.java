//231102
package test1;

import java.util.Scanner;

public class Chapter05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//231101
		//연산자 : 산술, 단항, 비교, 논리, 비트, 기타
		//산술 연산자 : +, -, *, /, %
		
		/*
		int num1 = 10;
		int num2 = 3;
		
		int sum, sub, mul, div, mod;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		
		System.out.println("num1 + num2 : " + sum); //결과 13
		System.out.println("num1 - num2 : " + sub); //결과 3
		System.out.println("num1 * num2 : " + mul); //결과 30
		System.out.println("num1 / num2 : " + div); //결과 2
		System.out.println("num1 % num2 : " + mod); //결과 0
		*/
		
		
		/*	
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		System.out.println("num3 + num4 결과는");
		System.out.println(num3 + num4);
		System.out.println("num3 - num4 결과는");
		System.out.println(num3 - num4);
		System.out.println("num3 * num4 결과는");
		System.out.println(num3 * num4);		
		System.out.println("num3 / num4 결과는");
		System.out.println(num3 / num4);
		System.out.println("num3 % num4 결과는");
		System.out.println(num3 % num4);
		*/
		
		/*
		System.out.println("num3 정수값을 입력하시오.");
		int num3 = sc.nextInt();
		System.out.println("num4 정수값을 입력하시오.");
		int num4 = sc.nextInt();
		
		int sum, sub, mul, div, mod;
		
		sum = num3 + num4;
		sub = num3 - num4;
		mul = num3 * num4;
		div = num3 / num4;
		mod = num3 % num4;
		
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		System.out.println("더하기 " +sum);
		System.out.println("빼기 " + sub);
		System.out.println("곱하기 " + mul);
		System.out.println("나누기 " + div);
		System.out.println("나머지 " + mod);
		*/
		
		//num5 변수와 num6 변수의 계산 결과를 변수에 저장하지 않고 화면으로 확인
		int num5 = 100;
		int num6 = 20;
		System.out.println(num5+num6);
		System.out.println(num5-num6);
		System.out.println(num5*num6);
		System.out.println(num5/num6);
		System.out.println(num5%num6);
		System.out.println("num5 + num6 = "+(num5+num6));
		//cf)System.out.println("num5 + num6" + num5 + num6);의 결과는 "num5+num610020" 괄호로 묶어서 먼저 처리할 수 있도록해야한다.
		System.out.println("num5 - num6 = "+(num5-num6));
		//println 안에서도 연산이 가능하다. 		

	}

}
