package test5;

import my.book.Book;

//※public 접근 제어자. 다른 패키지와 모든 클래스에서 접근 가능하도록 허락. 어디서나 접근이 가능(같은 패키지, 다른 패키지 클래스 사용 가능)
public class Book_Main {
	//my.book 패키지 내 설계해놓은 Book 클래스 수행하는 클래스

	public static void main(String[] args) {
		//경로가 다를 경우 반드시 패키지를 다 써줘야함
		//설계해놓은 클래스가 현재 수행하는 클래스와 다른 곳에 위치하면 객체 생성 시 패키지명.클래스명 변수명 = new 패키지명.클래스명();
		my.book.Book pac = new my.book.Book();
		pac.say();
		System.out.println(pac.bookName);
		System.out.println("------------");
		
		//패키지명을 안 붙힘 import 해서 객체 생성
		//소스 제일 상단에 패키지명과 import my.book.Book;
		//Ctrl + Shift + O : 자동으로 패키지 경로 찾기
		Book pac1 = new Book();
		pac1.say();
		System.out.println(pac.bookName);
		pac1.bookName = "내 인생";
		System.out.println(pac1.bookName);
		System.out.println("------------");

		
	}

}
