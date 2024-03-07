package test15;

import java.io.InputStream;

public class SystemInTest {

	public static void main(String[] args) {
		
		/*
		1. 표준 입출력
		PrintStream 클래스  out -> 표준출력 스트림(System.out.println()메소드)
		InputStream 클래스  in  -> 표준입력 스트림(System.in)
		OutputStream 클래스 err -> 표준 오류 출력 스트림
		*/
		
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		int i;
		
//		문자 1개 입력받기(바이트 단위임으로 한글은 깨져서 나옴)
//		try {
//			i = System.in.read();
//			System.out.println(i);
//			System.out.println((char)i);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		문자 여러개를 입력 받기
		try {
//			while((i = System.in.read()) != '\n') {
			while((i = System.in.read()) != -1) {
				System.out.println(i);
				System.out.println((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		InputStream in = System.in;
		int i;
		try {
			while((i = in.read()) != '\n') {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		
		
		
		
		
	}

}
