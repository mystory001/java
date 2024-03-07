package test10_1;

import java.util.Scanner;

public class SchdulerTest {

	public static void main(String[] args) {
		
		/*
		//개발코드에서 인터페이스를 통해 구현 클래스에 overriding 되어 있는 메서드를 호출해서 사용!!!
		//인터페이스            =  구현 객체
		//인터페이스 참조변수 = new 구현 클래스();
		Scheduler sc = new Roundrobin();
		sc.getNextCall();
		sc.sendCalltoAgent();
		System.out.println("-----------------");

		sc = new LeastJob();
		sc.getNextCall();
		sc.sendCalltoAgent();
		System.out.println("-----------------");
		
		sc = new PriorityAllocation();
		sc.getNextCall();
		sc.sendCalltoAgent();
		*/
		
		System.out.println("==============");
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R, r : 한 명씩 차례로 할당");
		System.out.println("L, l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P, p : 우선 순위가 높은 고객 먼저 할당");
		
		
		while(true) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("R, r, L, l, P,p 중 선택해서 입력 >> ");
		
		char menu = scanner.next().charAt(0);
		
		//개발코드에서 인터페이스를 통해 구현 클래스에 overriding 되어 있는 메서드를 호출해서 사용!!!
		//인터페이스            =  구현 객체
		//인터페이스 참조변수 = new 구현 클래스();
		//Scheduler sc = new Roundrobin();
		
		//인터페이스 변수 선언
		Scheduler sc = null;
		if(menu == 'R' || menu == 'r') {
			 sc = new Roundrobin(); //구현 객체 생성
			
		} else if(menu == 'L' || menu == 'l') {
			sc = new LeastJob(); //구현 객체 생성
			
		} else if(menu == 'P' || menu == 'p') {
			sc =  new PriorityAllocation(); //구현 객체 생성
			
		} else {	
			//구현 객체를 생성하지 않기 때문에 변수에 객체를 알 수가 없다라는 오류를 발생시킨다.!!
			System.out.println("지원되지 않는 형식입니다.!!!");
			return;  //if 문 수행 종료!!
		}
		
		sc.getNextCall();
		sc.sendCalltoAgent();
		
		}// while 종료
		
				
	}

}
