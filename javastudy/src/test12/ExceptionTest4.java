package test12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) {
		// 2개의 정수를 입력받아 사칙연산을 수행하는 프로그램 작성

		// 1. 정수값이 아닌 다른 자료형이 입력될 경우 예외 처리 -> InputMismatchException
		// 2. 0으로 나누는 경우의 예외 처리 -> ArithmeticException

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("정수1을 입력");
				int n1 = sc.nextInt();

				System.out.println("정수2을 입력");
				int n2 = sc.nextInt();

				System.out.println("정수1 + 정수2 = " + (n1 + n2));
				System.out.println("정수1 - 정수2 = " + (n1 - n2));
				System.out.println("정수1 * 정수2 = " + (n1 * n2));
				System.out.println("정수1 / 정수2 = " + ((double) n1 / (double) n2));

			} catch (InputMismatchException e) {
				System.out.println("숫자가 아닙니다.");
				System.out.println(sc.next() + "숫자가 아니므로 무시합니다.");
			} catch (ArithmeticException e) {
				System.out.println("정수2는 0이 될 수 없습니다.");
			} catch (Exception e) {
				System.out.println("런타임 오류 발생");
			} finally {

				try {
					System.out.println("한 번 더 실행하시겠습니까? 0.아니요, 1.예");
					int re = sc.nextInt();
					if (re == 0) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("숫자가 아닙니다.");
					System.out.println(sc.next() + "숫자가 아니므로 무시합니다.");
				} catch (ArithmeticException e) {
					System.out.println("정수2는 0이 될 수 없습니다.");
				} catch (Exception e) {
					System.out.println("런타임 오류 발생");
				}

			}
		}

	}
}

/*
package test12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) {
		//2개의 정수를 입력받아 사칙연산을 수행하는 프로그램 작성
	    //1.정수값이 아닌 다른 자료형이 입력될 경우 예외처리(정수가 아닌 문자열이 입력되면)
		//2.0으로 나누는 경우의 예외처리(2번째 정수값이  0이 입력되면)
		
		//*** 정수값이 아닌 다른 자료형이 입력될 경우 예외처리 => InputMismatchException		
		//*** 0으로 나누는 경우의 예외처리 => ArithmeticException
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		try {
		System.out.println("num 변수 정수 입력 >>> ");
		int num = sc.nextInt();
		
		System.out.println("num1 변수 정수 입력 >>> ");
		int num1 = sc.nextInt();
		
		System.out.println("------------------");
		
		System.out.println("num + num1 = " + (num + num1));
		System.out.println("num - num1 = " + (num - num1));
		System.out.println("num * num1 = " + (num * num1));
		System.out.println("num / num1 = " + (num / num1));
		System.out.println("------------------");
		} catch (InputMismatchException e) {
			System.out.println("정수가 아닙니다.!! 다시 입력해주세요");
			//sc.next();
			System.out.println(sc.next() + "는 무시했습니다.");
			//가엔터
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.!!! 다시 입력해주세요");
			
		} catch (Exception e) {
			System.out.println("기타 예외 발생시 처리 하는 예외");
			
		} finally {
			
			
			
			try {
			
			System.out.println("한번 더 수행하시려면 ( 0.아니오 / 1.예 >>>)");
			int retry = sc.nextInt();
			
				if(retry == 0) {
					System.out.println("0을 입력하셨습니다. 연산수행을 끝냅니다.!!!");
					break;
				}
				
			}  catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다.!! 다시 입력해주세요");
				//sc.next();
				System.out.println(sc.next() + "는 무시했습니다.");
				//가엔터
			} catch (Exception e) {
				System.out.println("기타 예외 발생시 처리 하는 예외");
			
		}
		
		} //finally문 종료
		} //while문 종료
		
	}

}
*/