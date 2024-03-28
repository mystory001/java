package test18;

public class Thread1 {

	public static void main(String[] args) {

		//스레드(Thread)
		//하나의 프로세스에서 동시에 기능을 처리하기 위한 목적으로 사용되는 실행 단위
		//하나의 프로세스에는 1개 이상의 스레드가 존재함
		//싱글(메인) 스레드 : 최초 실행 시 메인 스레드가 main() 함수를 실행시킴
		//멀티 스레드 : 하나의 기능을 실행할 수 있는 실행 단위(스레드)가 여러 개인 것을 말함
		//스레드를 사용하는 목적은 '동시 작업 처리'
		
		//JVM이 운영체제 역할을 함(CPU 역할)
		//자바는 프로세스가 존재하지 않고 스레드만 존재
		//JVM에 의해 스케쥴되는 실행 단위 코드 블록. 하나의 프로세스(응용 프로그래밍) 내에서 여러 가지 작업을 동시에 수행 할 수 있게 하는 것
		
		//스레드를 만드는 2가지 방법
		//1) Thread 클래스를 상속받아 Thread 작성
		//	 Thread 클래스를 상속받아 run() 메소드를 오버라이딩 함으로써 구현 하는 방식
		
		//2) java.lang.Runnable 인터페이스를 구현하여 Thread 작성 
		//	 Runnable 인터페이스를 구현함으로써 Thread를 사용하는 방식. main에서 Thread 생성 정보로 구현한 클래스의 객체를 넘겨줌으로써 객체를 생성하는 방식
		
		//메소드
		//start() run()메소드 호출
		//run() 스레드가 실행할 부분에 기술하는 스레드 코드로 오버라이딩하여 스레드 코드를 작성. 메소드가 종료하면 스레드도 종료됨
		
		//1. 싱글 스래드(main 함수 내에서 처리되는 주 스레드 1개뿐인 것이 기본)
		for(int i=0;i<300;i++) {
			System.out.println("$ "+(i+1));
		}
		
		for(int i=0;i<300;i++) {
			System.out.println("* "+(i+1));
		}
		System.out.println();
		System.out.println("main 스레드 종료");
		
		
	}

}
