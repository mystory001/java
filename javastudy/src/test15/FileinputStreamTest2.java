package test15;

import java.io.FileInputStream;
import java.io.IOException;

//byte 배열로 읽기
public class FileinputStreamTest2 {

	public static void main(String[] args) throws IOException {

		/*
		 바이트 단위 스트림
		 1) 입력 스트림(InputStream) 상속
		 2) 출력 스트림(OutputStream) 상속
		 3) 파일 단위 처리 스트림(FileInputStream)
		 파일로부터 바이트 단위로 읽어 들이는 스티름 입력 클래스(스트림 생성)
		 그림, 오디오, 비디오, 텍스트 파일 등 모든 종류의 파일을 읽을 수 있음
		 */
		
		FileInputStream fis = new FileInputStream("src/test15/input2.txt");
		
		//읽어 온 byte수 저장할 배열 지정
		byte [] bs = new byte[10];
		
		int i;
		
		while((i = fis.read(bs)) != -1) {
//			for(byte b : bs) {
//				System.out.print((char)b);
//			}
			for(int k=0; k<i ;k++) {
				System.out.print((char)bs[k]);
			}
			
			
			System.out.println(" : " + i + "바이트 읽음");
		}
		System.out.println("끝");
		fis.close();
		
		
	}

}
