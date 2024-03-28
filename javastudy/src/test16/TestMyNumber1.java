package test16;

import java.util.Scanner;

interface MyAdd{
	int add(int x, int y); //추상 메소드 선언
}

interface MyStrLen{
	int strLen(String str);
}

interface MyMax{
	int getMax(int x, int y);
}

public class TestMyNumber1 {
	
	//2개의 정수를 입력 받아 더하는 함수 구현
	public static int add(int x, int y) {
		return x + y;
	}
	
	//문자열 길이를 리턴하는 함수 구현
	public static int strLen(String str) {
		return str.length();
	}
	
	//2개의 정수를 입력 받아 큰 값을 구하는 함수 구현
	public static int getMax(int x, int y) {
		if(x>=y) {
			return x;
		}else {
			return y;
		}
	}

	public static void main(String[] args) {

//		System.out.println("정수 입력");
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
		//add(10,5) 호출하고 함수 내에서 돌려받은 반환값 저장
		//static 접근 시 클래스명.메소드명()
//		System.out.println("add("+x+","+y+") = " + TestMyNumber.add(x,y));
		
		//strLen(String str) 호출하고 함수 내에서 돌려받은 반환값 저장
//		String str = "함수형 프로그래밍(람다식)";
//		System.out.println("strLen(String str) = " + strLen(str));
		
		//getMax
//		System.out.println("getMax("+x+","+y+") = " + getMax(x,y));
		
//		System.out.println("================================");
		//익명 객체 구현(익명 클래스로 만들기)
		//인터페이스는 객체를 생성할 수 없음
		//인터페이스 변수명 = 인터페이스로 익명으로 구현한 객체를 넣어줌
		MyAdd myadd = new MyAdd() {
			
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		}; //세미콜론을 반드시 붙여줘야함
//		System.out.println(myadd.add(x, y));
		
//		System.out.println("================================");
		
		//람다식으로 익명 객체 구현 : 오버라이드 시킨 내용을 수식으로 표현
		
		//오버라이드 시켜 구현한 함수 기능을 람다식으로 수식으로 표현하고 변수에 대입
//		MyAdd plus = (x, y) -> {return x+y;};
//		System.out.println(plus.add(10, 5));
		//중괄호 안의 구현 부분이 return문 하나라면 중괄호와 return문을 모두 생략하고 식만 사용할 수 있음
		MyAdd plus = (x, y) -> x+y;
		
//		MyStrLen myStrLen = new MyStrLen() {
//			
//			@Override
//			public int strLen(String str) {
//				return str.length();
//			}
//		};
		//MyStrLen msl = (String str) -> {return str.length();}; //반환자료형, 함수명 제외
		//MyStrLen msl = (str) -> {return str.length();}; //매개변수의 자료형 생략
		MyStrLen msl = str ->  str.length(); //자료형이 1개인 경우 괄호 생략, return문이 하나라면 return문 모두 생략하고 식만 사용
		System.out.println(msl.strLen("함수형 프로그래밍(람다식)"));
		
		//인터페이스 변수명 = 함수형 프로그래밍(람다식) : 익명 함수 형태로 작성
		MyMax mm = (x, y) -> x >= y? x: y;
		System.out.println(mm);
		
		
		
	}

}
