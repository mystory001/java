package test18;

class X implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i <=10; i++) {
			int total = 0;
			total+= i;
			System.out.println("X 합계 : " + total);
		}
		System.out.println("X 스레드 종료");
	}
	
}

class Y implements Runnable{

	@Override
	public void run() {
		int total = 0;
		for(int i = 0 ; i <=10; i++) {
			total+= i;
			System.out.println("Y 합계 : " + total);
		}
		System.out.println("Y 스레드 종료");
		
	}
	
}

public class Thread8 {

	public static void main(String[] args) throws InterruptedException {

		Thread threadX = new Thread(new X(),"E 스레드");
		Thread threadY = new Thread(new Y(),"F 스레드");
		
		threadX.start();
		threadX.join();
		
		threadY.start();
		threadY.join();
		
		
	}

}
