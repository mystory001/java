//231030
package test1;

import java.util.Scanner;

public class Chapter03 {

	public static void main(String[] args) {
		/*
		//자료형 변환		
		byte a = 127;
		int b = a;
		float c = b;
		double d = c;
		float e1 = 10.5f; // 리터럴 상수일 경우 접미사 형태로 변환 가능(데이터 값 형태로) 
		float e = (float) d; // 명시적 자료형 변환
				
		System.out.println(a);
		System.out.println(b);		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e1);
		System.out.println(e);
		*/
		
		/*
		자료형 변환(Type Cast) : 변수 내의 저장된 데이터의 자료형을 변경시킨다.
		1) 자동 형변환 : 작은 크기의 자료형을 큰 크기의 자료형으로 저장할 경우
		2) 명시적 형변환 : 변경할 자료형을 변수 앞에 정확하게 표시
		형식)
		(변환하고자 하는 타입) 변수 명;
		ex)
		int a = 100;
		byte b = (byte) a;
		3) 접미사 형식 : 리터럴 상수일 경우 접미사 형태로 변환 가능(데이터값 형태로)
		
		
		문자(Character)
		문자(char 2byte)는 글자 하나, 데이터 값은 작은 따옴표 안에 ex) char ch = 'A';

		인코딩(encoding) : 문자를 정해진 코드값으로 변환
		디코딩(decoding) : 정해진 코드값을 문자로 변환
		*/
		
		// 유니코드(unicode) : 전세계의 모든 문자를 처리할 수 있도록 만든 표준 문자 처리 방식
		// 유니코드 값은 16진수(0 1 2 3 4 5 6 7 8 9 a b c d e f). 2byte로 저장
		// 표시형식 : \ uOOOO ex)\ud55c
		// UTF-8 형식 : 영문 1byte로 저장 가능하기 때문에 가변적으로 처리할 수 있는 인코딩 방법
		
		/*
		char ch1 = 'A';
		char ch2 = '한';
		System.out.println(ch1);
		//System.out.println((char)ch1);
		System.out.println((int) ch1);
		System.out.println(ch2);
		//System.out.println((char)ch2);
		System.out.println((int) ch2);
		System.out.println("=======================");
		
		int ch3 = 54620;
		char ch4 = 54620;
		char ch5 = '\u0041'; //유니코드 형식으로 저장
		char ch6 = '\ud55c';
		System.out.println(ch3);
		System.out.println((char)ch3); //코드값으로 문자형으로 디코딩
		System.out.println(ch4);
		System.out.println((int)ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println((int)ch6);
		System.out.println("=======================");
		
		//문자열(String) : 여러 개의 글자가 하나의 묶음으로 사용, 데이터 값은 큰 따옴표 안에
		*/
		
		String s1 = "happy";
		System.out.println(s1);
		
		char ch7 = 'h';
		char ch8 = 'a';
		char ch9 = 'p';
		char ch10 = 'p';
		char ch11 = 'y';
		
		System.out.println(ch7+ch8+ch9+ch10+ch11);
		System.out.println((char)ch7+(char)ch8+(char)ch9+(char)ch10+(char)ch11);
		System.out.println((char)(ch7+ch8+ch9+ch10+ch11));
		System.out.println(ch7+","+ch8+","+ch9+","+ch10+","+ch11);
		System.out.println(ch7+""+ch8+""+ch9+""+ch10+""+ch11);
				
		System.out.println(ch7); 
		System.out.println(ch8); 
		System.out.println(ch9); 
		System.out.println(ch10); 
		System.out.println(ch11);
		System.out.print(ch7); 
		System.out.print(ch8); 
		System.out.print(ch9); 
		System.out.print(ch10); 
		System.out.print(ch11 +"\n");
		
		//Escape Sequence : 제어문자(특수한 동작을 하는 문자) ex) \n : 줄바꿈(LF), \t: 탭
		//출력시에만 사용 : System.out.println(); ()내부에 적용
		
		System.out.println("자바\n프로그래밍\t코딩\b");
		System.out.println("자바\t프로그래밍\t코딩");
		
		//System.out.println(""자바" 프로그래밍 코딩"); 라고 한다면 ""와 " 프로그래밍 코딩" 분리 되기 때문에 에러
		System.out.println("\"자바\" \'프로그래밍\' \\코딩\\");
		
		char ch12 = '\ud55c';
		System.out.println(ch12);
		System.out.println("\'한\' 유니코드 \\ud55c = " + ch12);
		
		//입력 사용자가 입력하는 값을 공백으로 구분하여 읽는다.(탭,띄어쓰기 등으로 구분)
		//입력 : 키보드로 입력받은 값을 변수에 저장
		//Scanner 참조변수명 = new Scanner(System.in)
		// 클래스명  변수명   = new 클래스명(입력방법);
		
		Scanner sc = new Scanner(System.in);
		// 사용 클래스 import : Ctrl + Shift + O
		
		//정수 : nextInt()
		System.out.println("정수 입력 : ");
		int v1 = sc.nextInt();
		System.out.println("입력한 정수 v1 : " + v1);
		
		//실수 : nextDouble();
		System.out.println("실수 입력 : ");
		double v2 = sc.nextDouble();
		System.out.println("입력한 실수 v2 : " + v2);
			
		
	}

}
