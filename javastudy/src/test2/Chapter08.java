package test2;

import java.util.Scanner;

public class Chapter08 {

	public static void main(String[] args) {
		//231106
		Scanner sc = new Scanner(System.in);
		
		//제어문 : 조건에 따라 다른 문장을 선택할 수 있도록 프로그래밍 하는 것
		//조건문 : if문 : 조건을 만족할 때만 수행하고, 조건이 거짓이면 수행하지 않음. / switch문
		//조건 작성 : 비교대상 관계(비교)연산자 비교할기준값 → 결과: 참,거짓
		//if문 형식 : if(조건){참일때} 또는 if(조건){참일때}else{거짓일때}
		/*
		int age = 10;
		if(age>=8) {
			System.out.println("학교에 다닌다.");
		} 
		System.out.println("다음 구문 수행");
		System.out.println("----구----분----");
		
		int age1 = 10;
		if(age1>=8){
			System.out.println("취학");
		}else{
		}
		//else에 조건을 쓰지 않아도 됨.
		 * 
		 */
		/*
		if(age1>=8){
			System.out.println("취학");
		}else{
			System.out.println("미취학");
		}
		*/
		
		/*
		System.out.println("다음 구문 수행");
		System.out.println("----구----분----");
		*/
		
		
		/*
		//gender 변수값이 'F'와 같으면 "여성입니다." 그렇지 않으면 "남성입니다." 출력
		char gender = 'f';
		if(gender == 'f')//영문 대소문자도 같게해야함.
		{
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성입니다.");
		}
		//String a = "asdf"; equals("asdf"); char a = 'a';
		*/
		
		/*
		//score 변수값이 60점 이상이면 점수를 보여주고 "합격입니다", 그렇지 않으면 "불합격입니다" 출력
		int score = 70;
		if(score>=60) {
			System.out.println(score + "점 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		*/
		
		/*
		//score1 변수값이 60이상이면 마일리지 1000점 주고 "합격", 아니면 마일리지를 100점 주고 "불합격"
		int score1 = 60;
		int charge; //변수만 선언, 값은 나중에 넣을 수 있음. 전역변수
		if(score1>=60) {
			charge=1000; //마일리지 1000점; 지역변수
			System.out.println("마일리지 "+ charge +"점 합격");
			//System.out.println("해당 마일리지 출력 : " + charge);
		} else {
			charge=100;
			System.out.println("마일리지 " + charge + "점 불합격");	
			//System.out.println("해당 마일리지 출력 : " + charge);
		}
			System.out.println("해당 마일리지 출력 : " + charge);
		System.out.println("----구----분----");
		*/
		
		/*
		//키보드에서 입력 score1 변수값이 60이상이면 마일리지 1000점 주고 "합격", 아니면 마일리지를 100점 주고 "불합격"
		System.out.println("점수를 입력");
		int score1 = sc.nextInt();
		int charge; 
		if(score1>=60) {
			charge=1000; //마일리지 1000점; 지역변수
			System.out.println("마일리지 "+ charge +"점 합격");
			//System.out.println("해당 마일리지 출력 : " + charge);
		} else {
			charge=100;
			System.out.println("마일리지 " + charge + "점 불합격");	
			//System.out.println("해당 마일리지 출력 : " + charge);
		}
			System.out.println("해당 마일리지 출력 : " + charge);
		System.out.println("----구----분----");
		*/
		
		//if 중첩 : if(조건1){조건1이 참일 때} else if(조건2) {조건2이 참일 때} else if(조건3) {조건3이 참일 때}......else {if와 else if 조건이 없는 값일 때}
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
		
		
		//범위를 정해줘야한다.
		//조건을 따로따로 써줘야함.
		System.out.println("점수를 입력");
		int score = sc.nextInt();
		//int score = 64;
		if((score>=0) && (score<=40)) {
			System.out.println("가");
		} else if((score>40) && (score<=50)) {
			System.out.println("양");
		} else if((score>50) && (score<=60)) {
			System.out.println("미");
		} else if((score>60) && (score<=70)) {
			System.out.println("우");
		} else if((score>70) && (score<=100)) {
			System.out.println("수");
		} else {
			System.out.println("점수를 제대로 입력");
		}
		

		
		
	}

}
