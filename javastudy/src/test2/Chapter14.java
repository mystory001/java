package test2;

import java.util.Scanner;

public class Chapter14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//do ~ while문 : 조건이 맞지 않아도 반드시 한 번은 수행하고 조건을 검사해서 반복수행할지 결정
		
		//while문 : 1~10까지 합꼐를 구하는 프로그램 작성
		//조건 먼저 검사해서 반복 수행 결정
		int i = 15;
		int sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("합계 : " + sum);
	

		int i1 = 15;
		int sum1 = 0;
		do {			
		sum1 += i1;			
		i1++;
		} while (i1 <= 10);

		System.out.println("합계 : " + sum1);
	
		/*
		//메뉴 선택
		System.out.println("음료 선택 : 1.콜라 2.사이다 3.환타 4.이프로");
		int menu = sc.nextInt();
		if(menu==1) System.out.println("콜라를 선택");
		else if(menu==2) System.out.println("사이다를 선택");
		else if(menu==3) System.out.println("환타를 선택");
		else if(menu==4) System.out.println("이프로를 선택");
		System.out.println("메뉴를 다시 선택(1~4)");
		*/
		
		//while 문으로 메뉴 선택
		int menu = 0;
		while ((menu>=1) || (menu)<=4) {
		System.out.println("음료 선택 : 1.콜라 2.사이다 3.환타 4.이프로");
		menu = sc.nextInt();
//		if(menu==1) System.out.println("콜라를 선택");
//		else if(menu==2) System.out.println("사이다를 선택");
//		else if(menu==3) System.out.println("환타를 선택");
//		else if(menu==4) System.out.println("이프로를 선택");
//		System.out.println("메뉴를 다시 선택(1~4)");
		
		switch(menu) {
		case 1 : System.out.println("콜라");
		System.out.println();
		break;
		case 2 : System.out.println("사이다");
		System.out.println();
		break;
		case 3 : System.out.println("환타");
		System.out.println();
		break;
		case 4 : System.out.println("이프로");
		System.out.println();
		break;
		default : System.out.println("숫자를 다시 입력");
		}
		
		}
		
		
	}

}
