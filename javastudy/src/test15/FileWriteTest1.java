package test15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest1 {

	public static void main(String[] args) {
		
		//문자(텍스트) 데이터의 입출력을 다루는 스트림 : FileReader 클래스와 FileWriter 클래스
		
		//문자 데이터의 출력(저장, 내보내기)을 다루는 스트림 : FileWriter 클래스
		//문자 단위 출력 스트림으로 텍스트 파일 쓰기(파일로 저장) : 텍스트 파일만 대상
		//문자 단위 출력 스트림 : Writer클래스, FileWriter 클래스 write() 메소드
		try(FileWriter fw = new FileWriter("src/test15/writer.txt")){
		
		fw.write('A');
		fw.write("자바는 java");
		char[] buf = {'B','C','D','E','F'};
		fw.write(buf);
		fw.write(buf,1,2);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일이 저장되었습니다.");
	}

}
