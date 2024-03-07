package test7_1;

import java.util.Arrays;

public class BookArray {

	public static void main(String[] args) {
		
		//1단계) 객체 배열 생성
		Book [] library = new Book[5];
		
		for ( int i = 0 ; i < library.length ; i++ ) {
			System.out.print("library[ " + i + " ] = ");
			System.out.println(library[i]);
		}
		System.out.println("--------------");
		
		//1.기본 자료형 배열 : 선언과 동시에 배열의 크기만큼 메모리가 할당되고 요소값이	 바로 저장된다
		//2.객체 배열 : 요소가 되는 객체의 주소가 들어갈 메모리만 할당되고
		//각 요소 객체는 new 키워드로 생성하여 저장해야 한다.
		
		
		//2단계) Book 클래스로 객체 생성하기 - 도서명, 저자를 입력해야만 객체 생성해주는 일반 생성자
		Book book0 = new Book("태백산맥", "조정래");
		Book book1 = new Book("데미안", "헤르만 헤세");
		Book book2 = new Book("어떻게 살것인가", "유시민");
		Book book3 = new Book("토지", "박경리");
		Book book4 = new Book("어린왕자", "셍텍쥐페리");
		
		
		//3단계) 생성한 객체를 배열 요소값으로 넣어주기
		library[0] = book0;
		library[1] = book1;
		library[2] = book2;
		library[3] = book3;
		library[4] = book4;
		
		for ( int i = 0 ; i < library.length ; i++ ) {
			System.out.print("library[ " + i + " ] = ");
			System.out.println(library[i]);
			
			//배열 객체 요소값에 접근 : 객체명.멤버메서드 = book0.show();
			//형식) 배열요소값.멤버메서드 = library[0].show()
			library[i].show();
			
		}
		System.out.println("--------------");
		
		//객체를 생성해서 배열 요소에 넣어주기를 동시에 처리하기
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "셍텍쥐페리");
		
		for ( int i = 0 ; i < library.length ; i++ ) {
			System.out.print("library[ " + i + " ] = ");
			System.out.println(library[i]);
			library[i].show();
		}
		System.out.println("--------------");
		
		//객체 배열의 초기화 방법으로 생성
		Book library1[] = new Book[] {book0, book1, book2, book3, book4};
		for ( int i = 0 ; i < library1.length ; i++ ) {
			System.out.print("library1[ " + i + " ] = ");
			System.out.println(library1[i]);
			
			//배열 객체 요소값에 접근 : 객체명.멤버메서드 = book0.show();
			//형식) 배열요소값.멤버메서드 = library[0].show()
			library1[i].show();
		}
		System.out.println("--------------");
		
		System.out.println("Arrays.toString(library)= " + Arrays.toString(library));
		System.out.println("Arrays.toString(library1)= " + Arrays.toString(library1));		
		
	}

}
