package test15;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
	public static void main(String[] arg) {
		
		//영문자 알파벳 : A ~ Z까지 output4.txt에 저장
					//65~90
		try(FileOutputStream fos = new FileOutputStream("src/test15/output4.txt")){
			int A = 65;
			byte [] abc = new byte[26];
			for(int i = 0 ; i< abc.length;i++) {
				abc[i] = (byte) A;
				A++;
			}
			fos.write(abc);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일(쓰기) 저장이 완료되었습니다.");
	}
}
