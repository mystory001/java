package test2;

import java.util.Scanner;

public class Chapter15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 반복문 : 프로그램 내에서 동일한 명령을 지정 횟수만큼 반복하여 수행하도록 제어하는 명령문

		// System.out.println("안녕하세요");

		// 반복문을 작성할 때 꼭 지켜야하는 규칙
		// 1.초기화변수 : 반복을 시작하는 값을 저장해 놓은 변수 = 초기값
		// 2.조건식 : 반복횟수를 정한다. (조건이 만족할때까지 반복수행한다. -> 조건이 만족하면 계속해서 반복을 수행한다.)
		// 3.증감연산자 :반복횟수가 순차적으로 늘어나거나 줄어들어야 하기 때문에

		// 증감 연산자 : 하나씩 순차적으로 증가, 감소시키는 연산자
		// 1.단항으로 이루어진 증감연산자 : a++, ++a, a--, --a
		// 2.대입연산자 : a = a + 1 -> a += 1
		
		//for문 : 반복횟수를 알고 있을 때 주로 사용한다.
		//형식)for (초기화변수(초기값) ; 조건식(반복횟수) ; 증감연산자) { 반복할 내용 }
		
		//1)안녕하세요 10번 출력
//		int i ; //초기화 변수 선언
//		for (i = 1 ; i <= 10 ; i++) {
//			System.out.println("i 변수값 = " + i);
//			System.out.println("안녕하세요!!!");
//		}
//		System.out.println("i 변수값 = " + i);
//		System.out.println("---------------");
		 
		//2)for문의 초기화 변수값을 이용해서 1 ~ 10까지 합계를 구해서 출력
		//초기화 변수 재사용
//		int sum = 0; //초기화 변수내의 값들을 모두 누적해서 저장해놓는 변수
//		for (i = 1 ; i <= 10 ; i++) {
//			System.out.println("i 변수값 = " + i);
//			sum += i;
//			System.out.println("sum 합계 변수값 = " + sum);			
//		}
//		System.out.println("---------------");
		
		//3)for문의 초기화 변수값을 이용해서 1 ~ 10까지 짝수의 합계를 구해서 출력
		//for문, if문 사용, 나머지 연산자 (%)를 이용하여 나머지가 1이면 홀수, 나머지가 0이면 짝수
		//변수 % 2 == 0 -> 짝수
		//변수 % 2 == 1 -> 홀수
//		sum = 0;
//		for (i = 1 ; i <= 10 ; i++) {
//			if (i % 2 == 0) {
//			System.out.println("i 변수값 = " + i);
//			sum += i;
//			System.out.println("sum 합계 변수값 = " + sum);	
//			}
//		}		
//		System.out.println("---------------");
		
		
		//for문 요소 생략하기
		//while문과 동일하게 for문 내에서 초기값, 조건식(반복횟수), 증감식을 따로 지정해서 사용하는 방법
		
		//1)초기화식 생략 : 다른 곳에서 변수가 초기화 되어 있어서 중복으로 초기화할 필요가 없는 경우
		int i = 1; //초기화 변수에 초기값 넣어놓은 경우
		for (/*초기화식생략*/ ; i <= 10 ; i++) {	
		//for (i = 1 ; i <= 10 ; i++) {	
			
			System.out.println("i 변수값 = " + i);
		}
		
		System.out.println("i 변수값 = " + i);
		System.out.println("---------------");
		
		//2)조건식 생략 : for문 내에서 if문으로 조건문을 작성해서 반복횟수를 정하는 경우
		//           (for문의 수행을 멈추기 위해서)
		//초기화 변수 재사용 : int i = 1;
			
		for (i = 1 ; /*조건식생략(반복횟수 생략)*/ ; i++) {	
		//for (i = 1 ; i <= 20 ; i++)
			
			System.out.println("i 변수값 = " + i);
			//조건식(반복횟수)를 for문 내에서 따로 지정
			if(i >= 10)  break;
		
		}
		System.out.println("i 변수값 = " + i);
		System.out.println("---------------");
		
		//3)증감식 생략 : 증감식에 대한 연산이 복잡하거나 다른 변수의 연산결과값에 영향을 주게되는 경우
		//            (for문내에 증감식을 따로 작성)
		//초기화 변수 재사용 : int i = 1;
		for (i = 1 ; i <= 10 ; /*증감식생략*/ ) {	
			
			System.out.println("i 변수값 = " + i);	
			//i++;
			i += 2;//i = i + 2; //증감식 따로 작성
			
		}
		System.out.println("---------------");
		
		//4)모든 요소 생략 : 무한 반복
		//초기화 변수 선언하지 않으면 기존의 초기화 변수를 그대로 사용한다.
		
		for( ; ; ) {
			
			System.out.println("i 변수값 = " + i);	
			i++; //증감 연산자 따로 작성
			
			//무한반복 종료 : break문 사용
			//조건식 (반복 횟수) 따로 설정
			if (i >= 20) { 
				System.out.println("i 변수값 = " + i);	
				System.out.println("입력 종료!!!");	
				break;
			}
			
		}
		System.out.println("i 변수값 = " + i);
		System.out.println("---------------");
		
		/*
		//정수값을 무한으로 받아서 입력된 모든 수의 합계 구하기 (종료하려면 0을 종료)
		int total = 0;
		int num;
		for( ; ; ) { 
			
			System.out.println("정수값 입력 (종료하려면 0을 입력)>>" );
			num = sc.nextInt();
			
			System.out.println("num 변수값 = " + num); 
			
			//무한 반복 종료 : break;
			if (num == 0) {
				System.out.println("입력 종료");
				break;
			}
			
			total += num; //total = total + num;
			System.out.println("total변수값 = " + total);
		}
		
		total += num; //total = total + num;
		System.out.println("total변수값 = " + total);
		*/
		
		//중첩 for문 : 바깥족 for문이 1번 수행될동안 안쪽 for문은 반복횟수를 모두 수행해야 한다.
		//구구단
		//단수 (2) * 곱하는수(1) = 곱한값
		// 2 * 1 = 2,  2 * 2 = 4;
		
		int dan; //초기화 변수 (단수) (2 ~ 9)
		int times; //초기화변수 (곱하는 수)(1 ~ 9)
		
		//바깥쪽 for문 : 단수( 2단 ~ 9단)
		
		
		//              10 <= 9 : 거짓 -> 조건이 거짓이므로 반복문 수행하지않고 빠져나간다.
		//              3 <= 9 : 참
		//              2 <= 9 : 참
		for (dan = 2; dan <= 9; dan++) {
			
			System.out.println(dan + "단");
			
			//안쪽 for문 : 곱하는 수( 1 ~ 9)-> 바깥쪽 for문이 한번 수행될동안 9번 수행

			//          	   10 <= 9 : 거짓 -> 조건이 거짓이므로 반복문 수행하지않고 빠져나간다.
			//          	   9 <= 9 : 참			
			//          	   2 <= 9 : 참
			//                 1 <= 9 : 참
			for (times = 1; times <= 9; times++) {
				
				System.out.println(dan  + " * " + times + " = " + dan * times);
			}
			
			System.out.println();
		}

	}

}
