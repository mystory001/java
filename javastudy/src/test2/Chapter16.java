package test2;

public class Chapter16 {

	public static void main(String[] args) {
		
		//continue문과 break문 : 반복을 중지하는 키워드이다.
		
		//1)break문 : 반복을 중지한다.
		
		int num;
		for (num = 1 ; num <= 10; num++ ) {
			
			if (num == 5 ) break;
			System.out.println("num변수 = " + num);
			
		}
		
		System.out.println("--------------");
		
		//continue문 : 현재 반복만 수행중지하고 다음 반복을 수행하러 간다.
		//num 변수 재사용
		for (num = 0 ; num <= 10; num++ ) {
			
			//if (num == 5 ) continue;
			if (num == 5 || num == 7 || num == 9 ) continue;
			System.out.println("num변수 = " + num);
			
		}		
		System.out.println("---------------");
		
		// 1 ~ 10 까지의 홀수의 합을 구하여 출력
		//for문, if문, continue문 사용
		
		int sum = 0;
		int i;
		
		//           2 <= 10 :참	
		//           1 <= 10 :참
		for (i = 1 ; i <= 10 ; i++) {

			//  2 % 2 == 0 ->현재 반복은 수행하지 않고 다시 반복하러 찾아간다.
			//  1 % 2 == 1
			if (i % 2 == 0) {
				continue;
			}
				                          
			System.out.println("i 변수값 = " + i);			
			
			sum += i;
			System.out.println("sum 합계 변수값 = " + sum);				
			
		}		
		System.out.println("---------------");
		
		// 1 ~ 100 까지의 3의 배수만 출력
		//for문, if문, continue문 사용
		
		for (i = 1 ; i <= 100 ; i++) {

			//  3 % 3 == 0 -> 다음 구문 수행
			//  2 % 3 == 2 ->현재 반복은 수행하지 않고 다시 반복하러 찾아간다.
			//  1 % 3 == 1 ->현재 반복은 수행하지 않고 다시 반복하러 찾아간다.
			
			//변수값을 3으로 나누어서 나머지가 1,2 인 것은 다시 반복하러 찾아간다.
			if (i % 3 != 0) { //변수 % 3 != 0 -> 나머지가 0이 아닌 것
				
				continue;
			}
				                          
			System.out.println("i 변수값 = " + i);			
				
		}		
		System.out.println("---------------");
		
		
	}

}
