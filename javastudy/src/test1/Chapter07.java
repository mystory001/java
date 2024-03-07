//231106
package test1;

import java.util.Scanner;

public class Chapter07 {

	public static void main(String[] args) {
		//231106
		//조건 연산자(삼항 연산자) : 조건? 참값일때 : 거짓값일때;
		/*
		int num = 5 > 3 ? 10 : 20;
		//int num = (5 > 3) ? 10 : 20; 조건을 괄호로 묶어주자.
		System.out.println(num);
		System.out.println("----구----분----");
		*/
		
		/*
		//나이>=20 "성인" 그렇지 않으면 "미성년"
		int age = 20;
		String result = (age>=20) ? "성인" : "미성년";
		System.out.println(result);
		//나이라는 변수를 지정(age = 20;), 결과를 나타낼 변수 지정(String result)
		System.out.println("----구----분----");
		*/
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("나이를 입력하세요.");
		int age1 = sc.nextInt();
		String result1 = (age1 >= 20)? "성인" : "미성년";
		System.out.println(result1);
		System.out.println("----구----분----");
		*/
		
		/*
		//성별 구분하기 남(1,3), 여(2,4)
		System.out.println("성별 구분");
		int gender = sc.nextInt();
		String result2 = ((gender==1) || (gender==3)) ? "남" : "여";
		// 관계연산자 : ==
		// 논리연산자 : 논리합 OR 연산
		System.out.println(result2);
		*/
		
		/*
		//p.81
		int fAge = 45; int mAge = 47;
		char ch;
		ch = (fAge> mAge)? 'T' : 'F';
		System.out.println(ch);
		
		System.out.println("----구----분----");
		*/
		
		/*
		//이름 인증 맞으면 yes, 틀리면 no	
		String name = "홍길동";
		name = (name == "홍길동")? "yes" : "no";
		System.out.println(name);
		System.out.println("----구----분----");
		
		System.out.println("이름 입력");
		String name1 = sc.nextLine();
		name1 = (name1.equals("홍길동"))? "yes" : "no";
		//문자열 조건에서 같다 비교할 때는 변수명.equals("홍길동") 문자열에서 데이터 값이 같기만 하면 일치한다고 수행
		//name1 = (name1 == "홍길동")? "yes" : "no";
		System.out.println(name1);
		*/
		
		
		/*
		//입력 받은 정수값이 홀수, 짝수 구분하기(나머지 연산자 %)
		int num = 10;
		boolean isEven;
		isEven = (num%2==0)? true : false;
		System.out.println(isEven);
		*/
		
		/*
		//키보드로 입력 받은 숫자가 짝수 홀수
		System.out.println("숫자를 입력");
		int num = sc.nextInt();
		String is;
		//String is = sc.nextLine();
		is = (num%2==0)? "짝수" : "홀수";
		System.out.println(is + "입니다.");
		System.out.println("----구----분----");
		*/
		
		//3의 배수
		System.out.println("숫자를 입력");
		int num1 = sc.nextInt();
		String is1;
		is1 = (num1%3==0) ? "3의 배수이다" : "3의 배수가 아니다.";
		System.out.println(is1);
		
		//나머지 연산자
		

	}

}
