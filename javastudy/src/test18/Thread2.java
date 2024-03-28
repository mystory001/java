package test18;

//첫번째 스레드 : Thread 클래스를 상속받아서 구현 run() 메소드 오버라이드
class One extends Thread{

	@Override
	public void run() {

		for(int i=0;i<300;i++) {
		System.out.println("$ "+(i+1));
		}
		System.out.println("One 스레드 종료");
	}
}

//두번째 스레드 : Runnable 인터페이스 구현 run()메소드 오버라이드
class Two implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<300;i++) {
			System.out.println("* "+(i+1));
		}
		System.out.println("Two 스레드 종료");
	}
}


public class Thread2{
	
	public static void main(String[] args) {

		//멀티 스레드 : 수행할 여러 개의 작업 단위의 코드를 블록으로 작성하고 수행
		// -> run() 메소드 내에 수행할 동작 코드를 작성(오버라이드)
		
		//첫번째 스레드
		One t1 = new One(); //Thread 클래스의 멤버를 사용하여 스레드 처리 할 수 있음
		t1.start(); //run()메소드 내의 코드를 수행시킴
		
		//두번째 스레드
		//인터페이스 변수명 = new 구현클래스();
		Runnable t2 = new Two();
		Thread thread = new Thread(t2); //Runnable 인터페이스 내의 run()메소드를 수행시킬 Thread 클래스의 멤버들을 사용하기 위해 Thread 클래스의 생성자에 인터페이스 변수명을 대입
		thread.start();
		
		System.out.println("main 스레드 종료");
		
		
		//순서대로 처리 되는 것이 아니라 동시에 처리됨
		
		
	}

}
