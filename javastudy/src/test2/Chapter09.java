package test2;

import java.util.Scanner;

public class Chapter09 {

	public static void main(String[] args) {
//		231108
		
		Scanner sc = new Scanner(System.in);
		
		//나눗셈을 해서 몫을 사용하는 경우 / , 나머지를 사용하는 경우 %
		//금액을 입력받아 화폐단위대로 분리해서 표시
		//5만원권, 1만원권, 5천원권, 1천원권
		//ex) 187,000원 → 5만원권 3장, 1만원권 3장, 5천원권 1장, 1천원권 2장
		
		//탐욕 알고리즘(Greedy algorithm) : 여러 경우 중에서 하나를 결정해야할 때마다 그 순간에 최적이라고 생각되는 것을 선택해 나가는것
		/*
		System.out.println("금액을 입력하세요.");
		int price = sc.nextInt();
		System.out.println("입력받은 금액 " + price);

		int oman = price/50000;
		int ilman = (price%50000)/10000;
		int ochun = ((price%50000)%10000)/5000;
		int ilchun = (((price%50000)%10000)%5000)/1000;
	

		System.out.println("5만원권 " + oman + "장");
		System.out.println("1만원권 " + ilman + "장");
		System.out.println("5천원권 " + ochun + "장");
		System.out.println("1천원권 " + ilchun + "장");
		*/
		/*
		int age = 7;
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
		*/
		//if else-if else문 : 조건이 여러개인 경우 맞는 조건을 수행하고 끝내는 구문이다.
		//형식 if(조건식){조건이 참일 때 수행할 내용} 
		//else if(조건식) {조건이 참일 때 수행할 내용} 
		//else {물어보지 않는 모든 조건 수행 내용}
		/*
		int age = 9;
		int charge;
		if(age<8){
			charge=1000;
			System.out.println("취학 전 아동");
		} else if(age<14) {
			charge=2000;
			System.out.println("초등학생");
		} else if(age<20) {
			charge=2500;
			System.out.println("중˙고등학생");
		} else {
			charge=3000;
			System.out.println("일반인");
		}
		System.out.println("요금은 "+ charge +"원 입니다.");
		*/
		/*
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		int charge;
		if(age<8){
			charge=1000;
			System.out.println("취학 전 아동입니다.");
		} else if(age<14) {
			charge=2000;
			System.out.println("초등학생입니다.");
		} else if(age<20) {
			charge=2500;
			System.out.println("중˙고등학생입니다.");
		} else {
			charge=3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("요금은 "+ charge +"원 입니다.");
		*/
		//수정 : 나이가 0살미만과 150살 이상일 경우 "나이를 잘 못 입력하였습니다."라고 출력되게
	 
		/*
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		int charge = 0;
		if((age>0) && (age<=7)){
			charge=1000;
			System.out.println("취학 전 아동입니다.");
		} else if((age>=8) && (age<=13)) {
			charge=2000;
			System.out.println("초등학생입니다.");
		} else if((age>=14) && (age<=19)) {
			charge=2500;
			System.out.println("중˙고등학생입니다.");
		} else if((age>=20) && (age<=150)){
			charge=3000;
			System.out.println("일반인입니다.");
		} else  {
			System.out.println("나이를 잘못 입력하였습니다.");
		}
		System.out.println("요금은 "+ charge +"원 입니다.");
		*/
		/*
		//95점 이상 A+, 90점 이상 A, 85점 이상 B+, 80점 이상 B, 70점 이상 C, 60점이상 D, 나머지 점수 "재시험"
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		if (score>=95 && score<=100) {
			System.out.println("A+");
		} else if(score>=90 && score<95) {
			System.out.println("A");
		} else if(score>=85 && score<90) {
			System.out.println("B+");
		} else if(score>=80 && score<85) {
			System.out.println("B");
		} else if(score>=70 && score<80) {
			System.out.println("C");
		} else if(score>=60 && score<70) {
			System.out.println("D");
		} else {
			System.out.println("재시험");
		}
		*/
		//또는
		/*
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		String grade="";
		if (score>=95 && score<101) {
			grade = "A+";
		} else if(score>=90 && score<95) {
			grade = "A";
		} else if(score>=85 && score<90) {
			grade = "B+";
		} else if(score>=80 && score<85) {
			grade = "B";
		} else if(score>=70 && score<80) {
			grade = "C";
		} else if(score>=60 && score<70) {
			grade = "D";
		} else if (score>=0 && score<60){
			grade = "재시험";
		} else {
			grade = "점수를 잘못 입력하였습니다.";
		}
		System.out.println(grade);
		*/
		
		//혈액형
		/* 방법1
		System.out.println("혈액형을 입력해주세요");
		char blood = sc.next().charAt(0);
		if (blood == 'A') {
			System.out.println("A형");;
		} else if (blood=='B') {
			System.out.println("B형");;
		} else if (blood=='O') {
			System.out.println("O형");
		} else {
			System.out.println("AB형");
		}
		//문제가 생긴다.
		*/
		/*
		System.out.println("혈액형을 입력해주세요");
		String blood = sc.nextLine();
		if ((blood.equals("A")) || (blood.equals("a"))) {
			System.out.println("A형");;
		} else if ((blood.equals("B")) || (blood.equals("b"))) {
			System.out.println("B형");;
		} else if ((blood.equals("O")) || (blood.equals("o"))) {
			System.out.println("O형");
		} else if ((blood.equals("AB")) || (blood.equals("ab"))) {
			System.out.println("AB형");
	    } else {
			System.out.println("혈액형을 잘못입력하였습니다.");
		}
		*/
		
		System.out.println("혈액형을 입력해주세요");
		String blood = sc.nextLine();
		String str;
		if ((blood.equals("A")) || (blood.equals("a"))) {
			str = "A형";
		} else if ((blood.equals("B")) || (blood.equals("b"))) {
			str = "B형";
		} else if ((blood.equals("O")) || (blood.equals("o"))) {
			str = "O형";
		} else if ((blood.equals("AB")) || (blood.equals("ab"))) {
			str = "AB형";
		} else {
			str = "잘못 입력하였습니다.";
		}
		System.out.println(str);
		
	
	}

}
