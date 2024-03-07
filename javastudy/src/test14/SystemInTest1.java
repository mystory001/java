package test14;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		
//		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르시오"); //표준 입력 스트림에서 데이터 가져오기 :
//		1byte 단위(영문자1개, 키보드에서 입력된 데이터 값을 약속으로 정해놓은 아스키코드값으로 처리됨) int i;
//		  
//		try { i = System.in.read(); 
//				System.out.println(i); 
//				System.out.println((char)i); 
//		} catch (IOException e) 
//				{ e.printStackTrace(); 
//		}
		 
		// 표준 입력 스트림에서 데이터 가져 오기 : Enter 누리기 전까지 모든 문자 한 번에 가져오기
		System.out.println("알파벳을 쓰고 마지막에 [Enter]를 누르시오");

		try {
			int i;
			while ((i = System.in.read()) != '\n') {
				System.out.println(i);
				System.out.println((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
