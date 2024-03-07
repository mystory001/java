package test15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest1 {

	public static void main(String[] args) {
		
		//기반 스트림, 보조 스트림
		// 1) 기반 스트림 : 직접 읽거나 쓰는 기능을 가진 스트림
		//FileInputStream, FileOutputStream
		
		// 2) 보조스트림 : 기반 스트림에 부가 기능을 제공하는 스트림
		//InputStreamReader, OutputStreamReader, BufferedInputStream, BufferedOutputStream
		
		//InputStreamReader : InputStream(기반스트림)을 매개변수로 받아 생성되는 보조 스트림
		//바이트 단위로 읽어 들인 내용을 문자로 변환해주는 역할을 하는 스트림
		// -> FileReader 클래스로 스트림을 생성하고 사용가능
		
		//채팅프로그램
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("src/test15/reader.txt"))){
			int data;
			while((data = isr.read())!= -1) {
				System.out.println((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
