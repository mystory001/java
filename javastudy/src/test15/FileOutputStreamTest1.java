package test15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException {

		//파일 단위 처리 스트림(FileOutputStream) 클래스
		//파일로 저장(내보내기)하는 스트림을 생성하는 클래스
		
		String source = "src/test15/SystemInTest.java"; //읽어온 파일(원본)
		String target = "src/test15/SystemInTest.txt"; //저장(대상)할 파일
		
		try(FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target)){
		
		//읽은 byte를 저장할 변수
		int data;
		
		//한 번에 10개씩 읽어와서 저장할 수 있도록 배열 생성
		//byte[] total = new byte[10];
		
		//한 번에 파일의 바이트 수만큼 저장할 배열의 크기 지정
		byte[] total = new byte[fis.available()];
		
		while((data = fis.read(total))!= -1) {
			System.out.println(data);
			//데이터가 저장된 배열의 0번째 위치부터 실제로 읽은 byte 수 만큼 쓰기
			fos.write(total,0,data);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
