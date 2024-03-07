package test2;

import java.util.Scanner;

public class Chapter17 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		 //2개의 정수와 연산자를 입력받아 + , -, * , / , % 연산을 수행하는 프로그램작성
		 // 1)if ~ else if ~ else 문
		 // 2)switch case문 
		/*
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if (operator=='+') {
			System.out.println("num1 + num2 = " + (num1 + num2));
		} else if (operator=='-') {
			System.out.println("num1 - num2 = " + (num1 - num2));
		} else if (operator=='*') {
			System.out.println("num1 * num2 = " + (num1 * num2));
		} else if (operator=='/') {
			System.out.println("num1 / num2 = " + (num1 / num2));
		} else {
			System.out.println("잘못된 연산자");
		}
		*/
		/*
		System.out.println("num1 입력");
		int num1 = sc.nextInt();
		System.out.println("num2 입력");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력");
		char operator = sc.next().charAt(0);
		
		
		if (operator=='+') {
			System.out.println("num1 + num2 = " + (num1 + num2));
		} else if (operator=='-') {
			System.out.println("num1 - num2 = " + (num1 - num2));
		} else if (operator=='*') {
			System.out.println("num1 * num2 = " + (num1 * num2));
		} else if (operator=='/') {
			System.out.println("num1 / num2 = " + (num1 / num2));
		} else {
			System.out.println("잘못된 연산자");
		}
		
		
		
		switch(operator) {
		case '+' : System.out.println(num1 + num2);
		break;		
		case '-' : System.out.println(num1 - num2);
		break;
		case '*' : System.out.println(num1 * num2);
		break;
		case '/' : System.out.println(num1 / num2);
		break;
		default : System.out.println("잘못된 연산자");				
		}
		*/
		
		/*
		//이중 for문 바깥 for문이 1번 수행할 동안 안쪽 for문은 반복횟수를 모두 수행
		
		int i; //초기값
		
		for(i=2; i <= 9; i++) {
			System.out.println(i+"단");
			
			for(int j=1; j<=9; j++)
				System.out.println(i*j);
			
		} 
		*/
		/*
		int i;
		for(i=2; i<=9 ; i++) { 
			System.out.println(i+"단");
			
			if(i%2==1) {
				continue;
			}
			
			for(int j=1; j<=9; j++)
				System.out.println(i*j);
		}
		*/
		
		/*
		int i;
		for(i=2; i<=9; i++) {
			System.out.println(i);
		 for (int j=1; j<=9; j++) {
			System.out.println(i*j);
		if(i<=j) {
			break;}
		}
		System.out.println();
		}
		*/
		/*
		//별1
		for(int i =1; i<=5; i++) {
			for (int j =1; j<=5; j++) {
				System.out.print("*");
			} 
			System.out.print(i);
			System.out.println();
		}
		
		//별2
		for(int i = 1; i<=5 ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print(i);
			System.out.println();
		}
		*/
		/*
		//별3
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.print(i);
			System.out.println();
		}
		*/
		/*
		//별4
		//SSSSS*
		//SSSS**
		//SSS***
		//SS****
		//S*****
		for(int i = 1; i<=5; i++) {
			for(int j = i; j <=5; j++) {
				
				System.out.print("S");
			} 
			for(int k = 1; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.print(i);
			System.out.println();
		}
		*/
		/*
		//Q4 내가 한 거
		for(int i = 1; i<=7; i+=2) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Q4
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print(" ");
			}
			for(int k=3; k<=(i*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println("구분");
		} 	
		*/

		
		
		
		 
		

	}

}
