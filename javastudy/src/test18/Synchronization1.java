package test18;

//동기화(Synchronization)
//하나의 객체 내의 자원을 공유해서 사용하는 경우 지정
//임계영역 안의 현재 작업중인 스레드가 수행을 끝내기 전까지는 다른 스레드가 작업하지 못함


class Ticketing{
	
	int ticketNum = 1; //남은 티켓 수
	
	//스레드 동기화(synchronized) 키워드를 붙여 놓은 메소드는 첫 번째 스레드가 수행을 끝내기 전까지 두 번째 스래드가 접근하지 못함
	//두 번째 스랟드가 수행을 끝내기 전까지 세 번째 스레드가 접근하지 못함,....
	public synchronized void ticketing() {
		if(ticketNum > 0) {
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 성공"); //Thread.currentThread().getName() 스레드 이름
			ticketNum -= 1;
		} else {
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 실패");
		}
		System.out.println(Thread.currentThread().getName()+"가 티켓팅 시도 후 남은 티켓수 : " + ticketNum);
	}
	
}

class TicketingThread implements Runnable{

	Ticketing ticket = new Ticketing();

	@Override
	public void run() {
		ticket.ticketing();
		
	}
	
}

public class Synchronization1 {

	public static void main(String[] args) {
		
		TicketingThread tt = new TicketingThread();
		Thread t1 = new Thread(tt,"스레드1");
		Thread t2 = new Thread(tt,"스레드2");
		Thread t3 = new Thread(tt,"스레드3");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
