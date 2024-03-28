package test18;

import javax.swing.JOptionPane;

class Three extends Thread{

	@Override
	public void run() {
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
	
		try {	
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println("Three 스레드 종료");
	}
}

public class Thread4 {

	public static void main(String[] args) {

		//싱글 스레드와 멀티 스레드 비교
		
		//2. 멀티 스레드 : 여러 개의 (경량)스레드를 생성시켜 동시에 병렬 처리하도록 만듦
		//메인 스레드와 Three 스레드 동시 작업
		
		//Three 스레드
		Three three = new Three();
		three.start();
//		Thread thread3 = new Thread(three);
//		thread3.start();
		
		//메인 스레드(주 스레드)
		String in = JOptionPane.showInputDialog("값을 입력");
		System.out.println(in);
		
		System.out.println("메인 스레드 종료");
		
	}

}
