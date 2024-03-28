package test18;

import java.time.LocalDate;

class Member extends Thread{
	
	String place; //목적지
	LocalDate ld; //날짜 객체 생성
	int count = 0;
	
	//일반 생성자
	public Member(String place, LocalDate ld) {
		this.place = place;
		this.ld = ld;
	}

	@Override
	public void run() {
		synchronized(this) {
		for(int i = 1; i<=1;i++) {
			System.out.println("목적지는 " + place + "출발일은 " + ld);
			System.out.println("스레드 이름 : " + Thread.currentThread().getName() + i);
			count++;
			System.out.println("count : " + count);
			System.out.println();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}
	
}

public class Synchronization2 {

	public static void main(String[] args) {

//		LocalDate ld = LocalDate.now();
//		System.out.println(ld);
		
		//일반 생성자 : 목적지 예매일자
		Member m1 = new Member("집", LocalDate.now());
		
		Thread thread1 = new Thread(m1,"스레드1");
		Thread thread2 = new Thread(m1,"스레드2");
		Thread thread3 = new Thread(m1,"스레드3");
		Thread thread4 = new Thread(m1,"스레드4");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		
	}

}
