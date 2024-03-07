package test15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamTest1 {

	public static void main(String[] args) throws IOException {

		/*
		 바이트 단위 스트림
		 1) 입력 스트림(InputStream) 상속
		 2) 출력 스트림(OutputStream) 상속
		 3) 파일 단위 처리 스트림(FileInputStream)
		 파일로부터 바이트 단위로 읽어 들이는 스티름 입력 클래스(스트림 생성)
		 그림, 오디오, 비디오, 텍스트 파일 등 모든 종류의 파일을 읽을 수 있음
		 */
		
		//파일경로 표시(절대 경로)
//		FileInputStream fis = new FileInputStream("D:\\java_basic\\workspace\\javastudy\\src\\test15\\SystemInTest.java"); 
		//D:\\java_basic\\workspace\\javastudy\\src\\test15\\SystemInTest.java 
//		FileInputStream fis = new FileInputStream("D:/java_basic/workspace/javastudy/src/test15/SystemInTest.java");
		//D:/java_basic/workspace/javastudy/src/test15/SystemInTest.java
		
		//파일경로 표시(상대 경로)
		//프로젝트가 기준 최상위 src
		
		//파일 스트림 생성
		FileInputStream fis = new FileInputStream("src/test15/SystemInTest.java");
		
		
//		System.out.println(fis.read());
//		System.out.println(fis.read());
//		System.out.println(fis.read());
//		
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
//		System.out.println((char)fis.read());
		
		int i; //읽은 byte를 저장해놓은 변수
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
//			System.out.write(i);
		}
		
		fis.close();//파일 스트림 닫기
		
		
		
	}

}
