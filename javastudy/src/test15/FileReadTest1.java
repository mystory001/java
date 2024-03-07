package test15;

import java.io.FileReader;
import java.io.IOException;

public class FileReadTest1 {

	public static void main(String[] args) {
		
		//문자(텍스트) 데이터의 입출력을 다루는 스트림 : FileReader 클래스와 FileWriter 클래스
		
		//문자 데이트의 입력을 다루는 스트림 : FileReader
		try(FileReader fr = new FileReader("src/test15/reader.txt")){
		
		int i;
		while((i = fr.read()) != -1) {
			System.out.println((char)i);
		}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
