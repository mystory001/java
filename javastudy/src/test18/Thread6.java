package test18;

class C implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("#" + (i+1));
			//yield() 메소드를 실행한 스레드는 대기 상태가 되고, 우선 순위가 동일하거나 우선순위가 높은 다른 스레드가 실행되도록 함
			Thread.yield();
		}
		System.out.println("C 스레드 종료");
		
		
	}
	
}

class D implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("$" + (i+1));
		}
		System.out.println("D 스레드 종료");
		
	}
	
}

public class Thread6 {

	public static void main(String[] args) {

		//스레드 양보 : 자신에게 할당된 수행 시간을 다음 차례의 스레드에게 양보
		Thread threadC = new Thread(new C(),"C 스레드");
		Thread threadD = new Thread(new D(),"D 스레드");
		
		threadC.start();
		threadD.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료");
		
		
	}

}
