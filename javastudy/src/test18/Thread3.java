package test18;

import javax.swing.JOptionPane;

public class Thread3 {

	public static void main(String[] args) {

		//싱글 스레드와 멀티 스레드 비교
		
		//1. 싱글 스레드 : 하나의 스레드의 수행이 끝나야만 다음 스레드를 수행 할 수 있음
		//Dialog 박스로 데이터값 입력받기
		String in = JOptionPane.showInputDialog("값을 입력");
		System.out.println(in);
		
		//sleep() 메소드 : 현재 스레드를 지정된 시간 동안 멤추게 함
		for(int i=10;i>0;i--) {
			System.out.println(i);
		
		
		try {
			Thread.sleep(1000); //1초 : 1000으로 지정(1/1000 초로 시간 지정이 되어 있음)
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		}
		
		System.out.println("메인 스레드 종료");
		
	}

}
