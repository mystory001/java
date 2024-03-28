package test18;

class E implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("%" + (i+1));
		}
		System.out.println("E 스레드 종료");
	}
	
}

class F implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("^" + (i+1));
		}
		System.out.println("F 스레드 종료");
	}
	
}

public class Thread7 {

	public static void main(String[] args) throws InterruptedException {
		//join() : 다른 스레드의 실행이 완료될 떄까지 기다림
		Thread threadE = new Thread(new E(),"E 스레드");
		Thread threadF = new Thread(new F(),"F 스레드");
		
		threadE.start();
		threadE.join();
		threadF.start();
		threadF.join();
		
		
		//메인 스레드 수행
		for(int i=0; i<10; i++) {
			System.out.println("&" + (i+1));
		}
		System.out.println("메인 스레드 종료");
	}

}
