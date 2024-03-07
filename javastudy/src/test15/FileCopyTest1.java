package test15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest1 {

	public static void main(String[] args) {
		
		//FileInputStream, FileOutputStream 클래스를 사용하여 이미지 파일을 읽어와서 복사
		
		long ms = 0;
		try(FileInputStream fis = new FileInputStream("src/test15/redpanda.png");
		FileOutputStream fos = new FileOutputStream("src/test15/redpanda_1.png")){
			ms = System.currentTimeMillis();
			int i;
			while((i = fis.read())!= -1) {
				fos.write(i);
			}
			ms = System.currentTimeMillis() - ms;
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 " + ms + "소요됨");

	}

}
