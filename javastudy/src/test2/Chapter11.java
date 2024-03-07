package test2;

import java.util.Scanner;

public class Chapter11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("나이 입력");
		int age = sc.nextInt();
		int charge = 0;
		if(age<8) {
			charge = 1000;
			System.out.println("취학 전 아동");
		}
		if (age<14) {
			charge = 2000;
			System.out.println("초등학생");
		}
		if(age<20) {
			charge = 2500;
			System.out.println("중, 고등학생");
		}
		else {
			charge = 3000;
			System.out.println("일반인");
		}
		System.out.println("입장료는 " + charge + "원");
		*/
		/*
		//조건문과 조건연산자
		//큰 값이 나오도록 출력 if 사용
		int a = 10;
		int b = 15;
		int max;
		if (a>b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println(max);
		//if문에서 수행할 내용이 한 줄일 경우 블록[중괄호]. 생략할 수 있다.
		if (a>b) max=a; else max=b;
		
		// 비교
		max = (a > b) ? a : b;
		*/
		//switch문 : 하나의 변수나 수식에 대한 다양한 조건을 검사할 때 사용
		//switch(변수하나, 수식하나), case 비교할기준값:, break, default 키워드 사용
		//1위 금메달(G), 2위 은메달(S), 3위 동메달(B) 이외의 숫자는 메달이 없습니다 출력
		//if 문
		/*System.out.println("순위를 입력");
		int race = sc.nextInt();
		if(race==1) {
			System.out.println("금매달");
		} else if (race==2) {
			System.out.println("은매달");
		} else if (race==3) {
			System.out.println("동매달");
		} else {
			System.out.println("메달이 없습니다");
		}*/
		/*
		System.out.println("순위 입력");
		int rank = sc.nextInt();
		char medal;
		
		if (rank==1) 
			medal = 'G';
		 else if (rank==2) 
			medal = 'S';
		 else if (rank==3) 
			medal = 'B';
		
		else
			medal = 'X';
		System.out.println(medal);
		*/
		/*
		//switch문
		System.out.println("순위 입력");
		int rank = sc.nextInt();
		char medal;
		//if문의 경우 조건은 비교대상 비교연산자 비교할기준값, switch문에서 (비교 대상) case(비교연산자) 비교할기준값
		switch(rank) {
		case 1 : medal = 'G'; System.out.println("금메달");
				break;
				// 조건이 맞으면 멈추게 하는 키워드
		case 2 : medal = 'S'; System.out.println("은메달");
				break;
		case 3 : medal = 'B'; System.out.println("동메달");
				break;
		default : medal = 'X'; System.out.println("메달이 없습니다.");
		}
		*/
		
		//두개의 정수와 연산자를 입력 받아서 연산을 수행하는 switch문 작성
		//산술 연산 수행 ( +, -, *, /, %) ex)10+10=20
		/*
		System.out.println("정수1을 입력");
		int a = sc.nextInt();
		System.out.println("연산자 입력");
		char oper = sc.next().charAt(0);
		System.out.println("정수2을 입력");
		int b = sc.nextInt();
		
		switch(oper) {
		case '+' : System.out.println(a+b);
		break;
		case '-' : System.out.println(a-b);
		break;
		case '*' : System.out.println(a*b);
		break;
		case '/' : System.out.println(a/b);
		break;
		default : System.out.println("정수 및 연산자를 확인");
		}
		*/
		/*
		//case문을 동시에 사용
		//키보드로 월을 입력받아서 계절 구분하기(12~2 겨울, 3~5 봄 6~8 여름 9~11 가을)
		System.out.println("1~12월을 입력");
		int month = sc.nextInt();
		switch(month) {
		case 12,1,2 : System.out.println("겨울");
		break;
		case 3,4,5 : System.out.println("봄");
		break;
		case 6,7,8 : System.out.println("여름");
		break;
		case 9,10,11 : System.out.println("가을");
		break;
		default : System.out.println("월을 제대로 입력");
		}
		*/
		/*
		System.out.println("월을 입력(1~12)");
		int month1 = sc.nextInt();
		switch(month1) {
		case 1, 3, 5, 7, 8, 10,12 : System.out.println(month1+"월은 31일까지");
		break;
		case 2 : System.out.println(month1+"월은 28일까지");
		break;
		case 4, 6, 11 : System.out.println(month1 + "월은 30일까지");
		break;
		default : System.out.println("월을 제대로 입력");
		}
		*/
		/*
		System.out.println("Gold,Silver,Bronze 중 입력(대소문자 구분함)");
		String medal = sc.nextLine();
		switch(medal) {
		case "Gold" : System.out.println("금메달");
				break;
		case "Silver" : System.out.println("은메달");
				break;
		case "Bronze" : System.out.println("동메달");
				break;
		default : System.out.println("문자를 제대로 입력");
		}
		*/
		/*
		//혈액형 
		System.out.println("혈액형을 입력");
		String blood = sc.nextLine();
		switch (blood) {
		case "A","a" : System.out.println("A형");
		break;
		case "B","b" : System.out.println("B형");
		break;
		case "O","o" : System.out.println("O형");
		break;
		case "AB","Ab","aB","ab" : System.out.println("AB형");
		break;
		default : System.out.println("혈액형을 다시 입력");
		}
		*/
		/*
		//범위 지정(정수 입력)
		//0권 : 책을 싫어하는 수준, 1권 : 독서를 즐기는 수준, 2권 : 책을 사랑하는 정도, 3권 : 다독
		System.out.println("읽은 책 권수");
		int book = sc.nextInt();
		switch(book) {
		case 0 : System.out.println("책을 싫어하는 수준");
		break;
		case 1 : System.out.println("독서를 즐기는 수준");
		break;
		case 2 : System.out.println("책을 사랑하는 수준");
		break;
		case 3 : System.out.println("다독");
		break;
		default : System.out.println("숫자를 다시 입력");
		}
		*/
		/*
		//0~9권까지 책을 싫어하는 수준,
		//10~19권 책 읽는 것을 즐기는 수준,
		//20~29권 2권 : 책을 사랑하는 정도, 30~39권: 다독
		System.out.println("읽은 책 권수");
		int book1 = sc.nextInt();
		switch(book1/10) {
		case 0 : System.out.println("책을 싫어하는 수준");
		break;
		case 1 : System.out.println("독서를 즐기는 수준");
		break;
		case 2 : System.out.println("책을 사랑하는 수준");
		break;
		case 3 : System.out.println("다독");
		break;
		default : System.out.println("숫자를 다시 입력");
		}*/
		//또는
		System.out.println("읽은 책 권수");
		int book1 = sc.nextInt();
		book1 = book1/10;
		switch(book1) {
		case 0 : System.out.println("책을 싫어하는 수준");
		// 0의 수 book>=0 && book <=9
		break;
		case 1 : System.out.println("독서를 즐기는 수준");
		// 1의 수 book>=10 && book <=19
		break;
		case 2 : System.out.println("책을 사랑하는 수준");
		// 2의 수 book>=20 && book <=29
		break;
		case 3 : System.out.println("다독");
		// 3의 수 book>=30 && book <=39
		break;
		default : System.out.println("숫자를 다시 입력");
		}		
		

	}

}
