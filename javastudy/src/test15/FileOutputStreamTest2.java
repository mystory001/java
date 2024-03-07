package test15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args){
		
		/*
		//바이트 단위 스트림 생성과 처리
		//1) 입력 스트림(InputStream) 클래스 상속
		//2) 출력 스트림(OutputStream) 클래스 상속
		//파일 단위 처리스트림(FileInputStream, FileOutputStream) 클래스로 구현
		//FileOutputStream 클래스 : 파일로 저장(내보내기, 쓰기, 출력)하는 스트림을 생성하는 클래스
		//write() 메소드 사용
		FileOutputStream fos = new FileOutputStream("src/test15/output.txt");
		
		fos.write(65); //'A'
		fos.write(66); //'B'
		fos.write(67); //'C'
		fos.write('D');
		fos.write('E');
		fos.write('\n'); 
		fos.write(32); //공백
		byte [] buf = {'B', 'C', 'D','E' };
		fos.write(buf);
		fos.write(buf,1,2);
		
		fos.flush(); //파일 출력 스트림에 남아 있는 데이터를 강제로 비우기(파일로 저장)
		fos.close(); //파일 출력 스트림 닫기
		
		System.out.println("파일(쓰기) 저장이 완료되었습니다.");
		*/
		
		/*
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("src/test15/output1.txt");
			fos.write(65); //'A'
			fos.write(66); //'B'
			fos.write(67); //'C'
			fos.write('D');
			fos.write('E');
			fos.write('\n'); 
			fos.write(32); //공백
			byte [] buf = {'B', 'C', 'D','E' };
			fos.write(buf);
			fos.write(buf,1,2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			fos.flush(); //파일 출력 스트림에 남아 있는 데이터를 강제로 비우기(파일로 저장)
			fos.close(); //파일 출력 스트림 닫기
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		
		System.out.println("파일(쓰기) 저장이 완료되었습니다.");
		*/
		
		try(FileOutputStream fos = new FileOutputStream("src/test15/output3.txt",true)){
		
		fos.write(65); //'A'
		fos.write(66); //'B'
		fos.write(67); //'C'
		fos.write('D');
		fos.write('E');
		fos.write('\n'); 
		fos.write(32); //공백
		byte [] buf = {'B', 'C', 'D','E' };
		fos.write(buf);
		fos.write(buf,1,2);
		
		fos.flush(); //파일 출력 스트림에 남아 있는 데이터를 강제로 비우기(파일로 저장)
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일(쓰기) 저장이 완료되었습니다.");
		
		
	}

}
