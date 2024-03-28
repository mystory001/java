package test15_1;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		/*
		//file 객체 생성
		File file = new File("src/test15_1/newFile.txt"); //해당 경로에 File 클래스 생성. 실제 생성된 것은 아님
		file.createNewFile(); //실제 파일 생성
		
		//파일 속성 메소드 호출하여 출력
		System.out.println("파일인지 확인 file.isFile() : " + file.isFile());
		System.out.println("디렉토리 확인 file.isDirectory() : " + file.isDirectory());
		System.out.println("파일명 확인 file.getName() : "+file.getName());
		System.out.println("파일크기 확인 file.length() : "+file.length());
		System.out.println("파일 절대 경로 file.getAbsolutePath() : "+file.getAbsolutePath());
		System.out.println("생성자에 넣어준 파일 경로 file.getPath() : "+file.getPath());
		System.out.println("파일을 읽기 권한 확인 file.canRead() : "+file.canRead());
		System.out.println("파일을 쓰기 권한 확인 file.canWrite() : "+ file.canWrite());
		
		file.delete(); //파일 삭제
		*/
		
		//test 15_1 패키지 내의 파일/폴더 목록을 문자열 배열로 반환
		File file = new File("src/test15_1/");
		
		String[] filelist = file.list();
		for(String namelist : filelist) {
			System.out.println(namelist);
		}
		
	}

}
