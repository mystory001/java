//231101
package test;

public class Chapter01 {

	public static void main(String[] args) {
/*		
		System.out.println("공부하고 있는 페이지는 30 페이지입니다.");
		System.out.println("바깥 온도는 25.5 도 입니다.");
		System.out.println("현금은 100000 원을 가지고 있습니다.");
		System.out.println("성별은 남 입니다.");
		System.out.println("코딩을 할 수 있습니다.");
		System.out.println("===============");
		//메모리 공간에 없는 것, 화면 출력
		
		byte page = 30;
		float temp = 25.5f;
		// f(접미사)
		//double temp = 25.5;
		int cash = 100000;
		char gender = '남';
		// 문자 데이터 입력 ''로 묶어줘야함.
		boolean coding = true;
		// 참(true)과 거짓(false)
		
		//메모리 공간에 있는 것
		
		System.out.println("공부하고 있는 페이지는 " + page + " 페이지입니다.");
		System.out.println("바깥 온도는 " + temp +" 도 입니다." );
		System.out.println("현금은 "+ cash + " 원을 가지고 있습니다.");
		System.out.println("성별은 "  + gender + " 입니다.");
		System.out.println("코딩을 " + coding + " 입니다.");
		System.out.println("===============");
		
		//변수 내 저장된 데이터 값 수정
		page = 127;
		temp = 18.3f;
		cash = 0;
		gender = '여';
		coding = false;
		
		System.out.println("공부하고 있는 페이지는 " + page + " 페이지입니다.");
		System.out.println("바깥 온도는 " + temp +" 도 입니다." );
		System.out.println("현금은 "+ cash + " 원을 가지고 있습니다.");
		System.out.println("성별은 "  + gender + " 입니다.");
		System.out.println("코딩을 " + coding + " 입니다.");
		System.out.println("===============");
		
		//이름, 나이, 키, 혈액형, 코딩여부
		System.out.println("이름은 홍길동 입니다.");
		System.out.println("나이는 28 세입니다.");
		System.out.println("키는 150cm 입니다.");
		System.out.println("혈액형은 O형 입니다.");
		System.out.println("자바 프로그램 코딩을 할 수 있습니다.");
		System.out.println("===============");
		
		String name = "홍길동";
		//문자열(string) : 문자 여러 개가 동시에 하나로 묶여 있을 때 사용. 큰 따옴표를 사용
		byte age = 28;
		float height = 150;
		String blood = "O";
		//char blood
		boolean coding1 = true;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height + "cm");
		System.out.println("혈액형: " + blood + "형");
		System.out.println("코딩:" + coding1);
		System.out.println("===============");
		*/
		
		//상수
		int num = 100; //변수의 초기화 : 변수에 데이터값을 대입함
		System.out.println("num 변수값 : " + num);
		//num 변수값을 50으로 수정
		num = 50;
		System.out.println("num 변수값 : " + num);
		System.out.println("===============");
		
		int num1; 
		//메모리 공간만 확보되어 있고, 데이터 값은 넣어놓지 않음
		//변수의 초기화가 되어 있지 않다.(컴파일러가 동작하지(해석하지) 않음)
		//나중에 변수에 값을 넣어줘야함
		num1 = 30;
		System.out.println("num1 변수값 : " + num1);
		System.out.println("===============");
		
		final double PI = 3.14;
		System.out.println("PI 변수값 : "+ PI);
		
		//PI = 3.15;
		//System.out.println("PI 변수값 : "+ PI);
		//final을 붙힌 변수를 변경할 수 없음

		
		//환율을 이용한 환산금액을 구해보자
/*		int won = 1 * 1358;
		int won1 = 2 * 1358;
		int won2 = 3 * 1358;
		int won3 = 4 * 1358;
		int won4 = 5 * 1358;
		
		System.out.println(won);
		System.out.println(won1);
		System.out.println(won2);
		System.out.println(won3);
		System.out.println(won4);
*/
		final int RATE = 1358;
		int won = 1 * RATE;
		int won1 = 2 * RATE;
		int won2 = 3 * RATE;
		int won3 = 4 * RATE;
		int won4 = 5 * RATE;
		System.out.println(won);
		System.out.println(won1);
		System.out.println(won2);
		System.out.println(won3);
		System.out.println(won4);
		System.out.println("===============");
/*
		int won = 1 * 1358;
		int won1 = 2 * won;
		int won2 = 3 * won;
		int won3 = 4 * won;
		int won4 = 5 * won;
		
		System.out.println(won);
		System.out.println(won1);
		System.out.println(won2);
		System.out.println(won3);
		System.out.println(won4);
*/
		//인치를 cm로 바꿔보자 2.54
		float inch = 2.54f;
		float inch1 = 2 * inch;
		//1. float inch1 = 2 * inch;
		//2. float inch1 = 2 * 2.54f;
		//둘 중 1이 더 나은 방식
		float inch2 = 3 * inch;
		float inch3 = 4 * inch;
		float inch4 = 5 * inch;
		
		System.out.println(inch);
		System.out.println(inch1);
		System.out.println(inch2);
		System.out.println(inch3);
		System.out.println(inch4);
		System.out.println("===============");
		
		
		final float cm = 1 * 2.54f;
		float cm1 = 2 * cm;
		float cm2 = 3 * cm;
		float cm3 = 4 * cm;
		float cm4 = 5 * cm;
		
		System.out.println(cm);
		System.out.println(cm1);
		System.out.println(cm2);
		System.out.println(cm3);
		System.out.println(cm4);
		System.out.println("===============");
		
		char ch1 = 'A'; //1byte
		char ch2 = '김'; //2byte
		System.out.println("ch1변수값 = " + ch1);
		System.out.println("ch2변수값 = " + ch2);
		//형 변환
		System.out.println("ch1변수값 = " + (int)ch1);
		System.out.println("ch2변수값 = " + (int)ch2);
		//
		char ch3 = '★';
		System.out.println((int)ch3);
		
		char ch4 = ' ';
		System.out.println((int)ch4);
		
	}

}
