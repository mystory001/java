package test15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest1 {

	public static void main(String[] args) {
		
		//FileInputStream, FileOutputStream 클래스를 사용하여 이미지 파일을 읽어와서 복사
		
		long ms = 0;
		try(FileInputStream fis = new FileInputStream("src/test15/redpanda.png");
		FileOutputStream fos = new FileOutputStream("src/test15/redpanda_1.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			ms = System.currentTimeMillis();
			int i;
			while((i = bis.read())!= -1) {
				bos.write(i);
			}
			//파일을 복사하는 데 걸리는 시간 ms = System.currentTimeMillis();
			ms = System.currentTimeMillis() - ms;
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 " + ms + "소요됨");

	}

}
