package test18;

class A extends Thread{

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("!" + (i+1));
		}
		System.out.println("A 스레드 종료");
	}
}

class B implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("@" + (i+1));
		}
		System.out.println("B 스레드 종료");
	}
}


public class Thread5 {

	public static void main(String[] args) {
		
		//Thread 클래스를 상속받았을 때
		A a = new A();
		Thread threadA = new Thread(a,"A 스레드");
		
		//Runnable 인터페이스를 구현했을 때
		Runnable b = new B();
		Thread threadB = new Thread(b,"B 스레드");
		
		System.out.println("Thread 이름 : " + Thread.currentThread().getName());
		System.out.println("Thread ID : " + Thread.currentThread().getId());
		System.out.println("Thread 우선순위 : " + Thread.currentThread().getPriority());
		System.out.println("Thread 인터럽트 : " + Thread.currentThread().isInterrupted());
		System.out.println("=================================");
		
		System.out.println("Tread 이름 : " + threadA.getName());
		System.out.println("Tread ID : " + threadA.getId());
		System.out.println("Tread 우선순위 : " + threadA.getPriority());
		System.out.println("Tread 인터럽트 : " + threadA.isInterrupted());
		System.out.println("=================================");
		
		System.out.println("Tread 이름 : " + threadB.getName());
		System.out.println("Tread ID : " + threadB.getId());
		System.out.println("Tread 우선순위 : " + threadB.getPriority());
		System.out.println("Tread 인터럽트 : " + threadB.isInterrupted());
		System.out.println("=================================");
		
		//스레드 우선 순위 지정
		//작업 중요도에 따라 특정 스레드가 더 많은 작업 시간을 갖게 할 수 있음
		//우선 순위가 높은 스레드를 먼저 실행한 다음 낮은 스레드를 실행
		//1(최소 우선 순위)~10(최대 우선 순위)까지 숫자 번호로 지정할 수 있음
		//우선 순위의 기본값은 5
		//SetPriority 메소드를 이용하여 변경
		//getPriority 메소드를 이용하여 우선 순위값을 조회할 수 있음
		System.out.println("우선 순위 지정");
		threadA.setPriority(1);
		threadB.setPriority(8);
		System.out.println("Tread 우선순위 : " + threadA.getPriority());
		System.out.println("Tread 우선순위 : " + threadB.getPriority());
		System.out.println("=================================");
		
		threadA.start();
		threadB.start();
		System.out.println("메인 스레드 종료");
		
	}
}
