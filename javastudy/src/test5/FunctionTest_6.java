package test5;

import java.util.Scanner;

public class FunctionTest_6 {
/*
	//라면 끊이기 함수 작성
	// 1유형 : 반환값이 없고, 매개 변수가 없는 경우
	public static void ramen() {
		String name = "신";
		int water = 550;
		String time = "4분 30초";
		System.out.println(name  +"라면은 "+ water + "ml의 물을 붓고 " + time + "동안 끓이면 된다.");
		return;		
		}
	
	// 2유형 : 반환값이 없고, 매개변수가 있는 경우
	public static void ramen1(String name, int water, String time) {
		System.out.println(name +"라면은 " + water + "ml의 물을 붓고 " + time + "동안 끓이면 된다.");
		return;		
	}
	
	// 3유형 : 반환값이 있고, 매개 변수가 있는 경우
	public static String ramen2(String name, int water, String time) {
		return (name + "라면은 " + water + "ml의 물을 붓고" + time + "동안 끓이면 된다.");		
	}

	// 4유형 : 반환값은 있고, 매개 변수가 없는 경우
	public static String ramen3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("라면 종류 입력");
		String name = sc.nextLine();
		System.out.println("물의 양 입력");
		int water = sc.nextInt();
		sc.nextLine();
		System.out.println("시간 입력");
		String time = sc.nextLine();
		
		return (name + "라면은 " + water + "ml의 물을 붓고" + time + "동안 끓이면 된다.");
	}
	*/
	
//	p.135
	public static int getTenTotal() {
		int i;
		int total = 0;
		for(i=1; i<=10; i++) {
			total += i;
		}
		return total;
	}
	
	
	
	
	public static void main(String[] args) {
		/*
		//1유형 호출
		ramen();
		System.out.println("---------------");
		
		//2유형 호출
		ramen1("신",550,"4분");
		System.out.println("---------------");
		
		//3유형 호출
		String cooking = ramen2("신",550,"4분"); //함수 호출도 하고 함수 내에서 돌려받은 반환값(결과값)을 변수에 저장
		System.out.println(cooking);
		System.out.println("---------------");

		
		
		//4유형 호출
		String cooking1 = ramen3(); //함수 호출도 하고 함수 내에서 돌려받은 반환값(결과값)을 변수에 저장
		System.out.println(cooking1);
		*/
		
		int total1 = getTenTotal();
		System.out.println(total1);
		
		
	}

}
