//231113
package test2;

import java.util.Scanner;

public class Chapter12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("정수 입력");
		int a = sc.nextInt();
		a = a%2;
		switch(a) {
		case 0 : System.out.println("짝수");
		break;
		case 1, -1 : System.out.println("홀수");
		break;
		default : System.out.println("다시 입력");
		}
		*/
		/*
		//
		System.out.println("점수 입력");
		int score = sc.nextInt();
		String grade = "?";
		
		if ( (score < 0 ) || (score > 100)) {
			System.out.println("점수를 잘못 입력");
		} else { 
		switch(score/10) {
		case 10 : case 9 : grade = "A";
		break;
		case 8 : grade = "B";
		break;
		case 7 : grade = "C";
		break;
		case 6 : grade = "D";
		break;
		default : grade = "F";
		}
		System.out.println("학점은 " + grade);
		}
		*/
		
		/*
		//반복문 while
				int i = 1; //초기화변수
		while (i <= 500) {
			System.out.println("안녕하세요"+ i );//반복할 내용
			i++; //증감연산자 // i = i + 1;
		}
		*/
		/*
		int num = 1;
		int sum = 0; // num 초기화 변수 내의 값을 한 곳에 더해서 저장해놓는 변수(변수값의 초기값을 0으로 꼭 지정)
		while(num<=10) {
			System.out.println("num 변수 " + num);
			sum += num; //sum = num + num;
			System.out.println("sum 변수 " + sum);
			num++;
		}
		System.out.println("1부터 10까지 합 " + sum);		
		*/
		/*
		//int sum을 while문 안으로 넣으면 지역 변수로 변함
		int num = 1;
		while(num<=10) {
			
			int sum = 0; // 지역 변수
			System.out.println("num 변수 " + num);
			sum += num;
			num++;
		}
		//System.out.println("1부터 10까지 합 " + sum);
		*/
		/*
		int num = 1;
		int sum = 0;
		
		
		//    1<=50
		while(num<=50) {
		//   0 = 1+1 2
			sum += num;
		//   4
			num ++;
		}
		System.out.println(sum);
		*/
		/*
		//무한 반복
		// 초기화변수와 증감연산자가 없다
		int i;
		while (true) {
			System.out.println("정수 입력");
			i = sc.nextInt();
			System.out.println(i);
		}
		*/
		/*
		int i;
		int sum = 0;
		while (true) {
			System.out.println("정수 입력");
			i = sc.nextInt();
			System.out.println(i);
			sum += i;
			System.out.println(sum);
		}
		*/
		/*
		int i;
		int sum = 0;
		while (true) {
			System.out.println("정수 입력, 종료하려면 0을 입력");
			i = sc.nextInt();
			System.out.println(i);
			
			if ( i == 0) {
				break;// 반복을 멈출 때 사용하는 키워드
			}
			sum += i;
			System.out.println(sum);
		}
		*/
		/*
		//구구단 출력
		
		int i = 2;
		int a = 1;
		while(a<=9) {
			System.out.println(a);
			System.out.println(i * a);
			a++;
		}
		
		*/
		/*
		//키보드로 입력 받아 구구단 출력(*1~9)
		System.out.println("구하고자하는 몇 단?(1~9)");
		int a = sc.nextInt();
		int b = 1;
		while(b<=9) {
			System.out.println(a * b);
			b ++;
		}
		*/
		/*
		// while 중첩 : 바깥 반목문이 1번 수행할동안 안쪽 반복문은 반복 횟수를 모두 수행해야함.
		while (true) {
			System.out.println("구하고자하는 몇 단?(1~9)");
			int a = sc.nextInt();
			int b = 1;
			while(b<=9) {
				System.out.println(a * b);
				b ++;
			}
			}
		*/
		
		while (true) {
			System.out.println("구하고자하는 몇 단?(1~9)");
			int a = sc.nextInt();
			int b = 1;
			if (a==0) {break;}
			while(b<=9) {
				System.out.println(a * b);
				b ++;
			}
			}
		
		
		
		
		
		
		

	}

}
