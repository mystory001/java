//231102
package test1;

import java.util.Scanner;

public class Chapter06 {

	public static void main(String[] args) {
		//231102
		
		Scanner sc = new Scanner(System.in);
		/*	
		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		int sum, sub, mul, div, mod;
		
		sum = num1 + num2;
		sub = num1 + num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
				
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num1+num2 = " + sum);
		System.out.println("num1-num2 = " + sub);
		System.out.println("num1*num2 = " + mul);
		System.out.println("num1/num2 = " + div);
		System.out.println("num1%num2 = " + mod);
				
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		*/
		
		
		//부호연산자 : +, -
		/*
		int num = 10;
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		num = -num;
		//변수 내의 데이터값 자체가 -값으로 변경
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		*/
		
		int math = 90;
		int eng = 73;
		
		int totalScore = math + eng;
		System.out.println(totalScore);
		double avgScore = (math + eng)/2.0; //int형/int형 = int형 이 경우 데이터 손실 일어남. 따라서 2.0 혹은 (double)2 라고 작성해야함
		//혹은 double avgScore = (math + eng)/(double)2;
		System.out.println(avgScore);
		//평균을 계산할 때 소수점 이하 계산 주의하자
		System.out.println("===구===분===");
		
		//단항 연산자(증감 연산자 : 1씩 증가/감소)반복문 쓸 때 사용 ex)++a, a++, --a, a--)
		//a = a + 1; 자신의 변수값에 1을 더해서 다시 저장
		//a = a - 1; 자신의 변수값에 1을 빼서 다시 저장
		//변수명 앞(전치)에 ++,--(++a,--a)가 오게 되면 먼저 1을 증감해서 저장해서 사용. 변수명 뒤(후치)에 ++,--(a++,a--)가 오게되면 변수 내의 값을먼저 사용하고 나중에 1을 증감 후 저장 사용
		//++a 혹은 --a의 경우 앞에 1이 있다고 생각하자
		//a++ 혹은 a--의 경우 당장 출력되지 않고 다음 값에 적용된다고 생각하자
		int num1 = 100;
		System.out.println(num1); //100
		System.out.println(++num1); //101
		System.out.println(num1++); //101
		System.out.println(num1); //102
		
		int num2 = 100;
		System.out.println(num2); //100
		System.out.println(--num2); //99
		System.out.println(num2--); //99
		System.out.println(num2); //98
		
		//관계연산자(=비교연산자) : 조건 작성 시 사용. 이항(a,b) 관계를 나타낼때 사용. 결과는 true/false값으로 나타남
		//조건 작성 형식 : 비교대상 관계/비교연산자 비교할기준값 ex)10 != 20
		int num = 1;
		System.out.println(num>0);
		System.out.println(num>2);
		System.out.println(num<2);
		System.out.println(num<0);
		System.out.println(num>=0);
		System.out.println(num>=2);
		System.out.println(num<=0);
		System.out.println(num<=2);
		System.out.println(num!=1);
		System.out.println(num==1);
		System.out.println("===구===분===");
		int age = 27;
		//System.out.println(age>25); 
		boolean value = age>25; //true
		System.out.println(value);
		value = age <= 25; //false
		System.out.println(value);
		value = age == 27; //true
		System.out.println(value);
		value = age != 27; //false
		System.out.println(value); 
		System.out.println(age==27); // true
		System.out.println("'age는 27이다.' 조건은 참인가 거짓인가? " + (age == 27));
		System.out.println("===구===분===");
		
		//논리 연산자 : 비교연산자로 처리된 결과를 가져와서 다시 논리적으로 연산. true/false 조건으로 다시 true/false를 판단. 조건이 여러 개. 결과는 true/flase
		//&&(논리곱), 
		//||(논리합, shift + \ *2): 둘 중 하나만 true라면 결과 값은 true. 두 항이 모두 false면 결과 값은 false 
		//! : 엑셀 not()함수와 같다.
		boolean t1 = 5>2;
		boolean t2 = 4>3;
		//연산자가 2개 이상 들어갈 경우 ()로 묶어줘야함
		System.out.println(t1||t2); //true
		System.out.println(!(t1&&t2)); //false
		
		int 숫자1 = 10;
		int 숫자2 = 20;
		boolean 조건1 = (숫자1>0) && (숫자2>0); 
		System.out.println(조건1); //true
		조건1 = (숫자1<0) && (숫자2>0); 
		System.out.println(조건1); //false
		조건1 = (숫자1<0)||(숫자2>0); 
		System.out.println(조건1); //true
		조건1 = !(숫자1>20); 
		System.out.println(조건1); //true
		System.out.println(!조건1); //false
		System.out.println("===구===분===");
		
		
		//단락 회로 평가(SCE) : 논리곱과 논리합을 연산할 때 두항을 모두 실행하지 않더라도 결과값을 알 수 있는 경우에, 나머지 항은 실행되지 않는다는 것.
		int num0 = 10;
		int i = 2;
		boolean val = ((num0 = num0 +10)<10) && ((i=i+2)<10);
		               //    false                  true
		//					  20			  	 수행하지 않음.
		// 조건1&&조건2 조건1이 false면 조건2는 실행하지 않는다. 즉, ((num0 = num0 +10)<10) && ((i=i+2)<10); 앞의 조건이 거짓이기 때문에 뒤의 조건은 실행하지 않는다.
		System.out.println(val); //false
		System.out.println(num0); //20
		System.out.println(i); //2
		
		System.out.println(num0); //20의 값이 아래 조건에 입력
		val = ((num0 = num0 +10)>10) || ((i = i + 2) <10);
		         //         true              true
		System.out.println(val); //true
		System.out.println(num0); //30
		System.out.println(i); // 왜 이것은 4가 아닐까? 단락 회로 평가의 특징. 논리 합은 참||거짓 혹은 거짓||거짓 으로 사용. 따라서 2
		System.out.println("===구===분===");
		//논리곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i값은 그대로, 논리합에서 앞 항이 참이면 뒷 항이 실행되지 않아 i값은 그대로
		//SCE 특징
		
		//해볼거
		//true, false 인 것을 만들어서 해보자
		//true * true, false * false 인 조건을 만들어서 확인해보자
		//i = i + N(숫자)의 경우 우선순위가 +가 앞서기 때문에 + 먼저한 후 = 대입한다.
		
		
		//복합 대입 연산자 : 변수값을 초기화한 후에 다시 대입한다. a += 1 == a = a + 1
		//int num4 = num4 +1;
		int num4 = 0; //값을 먼저 초기화해줘야지 에러가 나지 않는다. 변수에 초기값을 정확하게 작성해줘야함.
		num4 = num4 + 1; // ++num4와 같은 말이다. 1
		num4 += 1; //num4 = num4 + 1 → 2
		num4 *= 5; //num4 = num4 * 5 → 10
		System.out.println(num4); //10
		++num4;
		System.out.println(num4); //11
		System.out.println("===구===분===");
		
		// p.81
		//조건 연산자 : 조건 ? 조건을 판단해서 참인 경우 수행내용: 조건을 판단해서 거짓인 경우 수행 내용;
		//조건 ? 참값 : 거짓값
		int num5 = (1>0) ? 10 : 0;
		System.out.println(num5);
		int num6 = (1<0) ? 10 : 0;
		System.out.println(num6);
	
		
		
	
	}

}
