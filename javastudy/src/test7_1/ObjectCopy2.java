package test7_1;

import java.util.Arrays;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		//개체 배열 2개 생성
		Book[] bookArray1 = new Book[3]; //원본 배열
		Book[] bookArray2 = new Book[3]; //대상 배열
		
		System.out.println("bookArray1[] =" + Arrays.toString(bookArray1));
		System.out.println("bookArray2[] =" + Arrays.toString(bookArray2));
		System.out.println("-------------------");
		
		bookArray1[0] = new Book("태백산맥","조정래");
		bookArray1[1] = new Book("데미안","헤르만헤세");
		bookArray1[2] = new Book("어떻게 살것인가","유시민");
		System.out.println("bookArray1[] =" + Arrays.toString(bookArray1));
		System.out.println("bookArray2[] =" + Arrays.toString(bookArray2));
		System.out.println("-------------------");
		
		//얕은 복사 : 주소가 복사된다. (공유!!! -> bookArray1에서 수정하면 bookArray2도 따라서 변경)
		//배열 소요내의 데이터값은 생성된 객체의 주소이다. =  주소값이 동일하다
		//bookArray2 객체 배열 요소값으로 넣어줄 Book 클래스의 객체를 생성하지 않았다.
		//bookArray1 객체 배열 요소값인 주소만 bookArray2 객체 배열 요소값으로 복사되었다.
			
		// 배열의 일부분만 복사하는 형식으로 사용 -> 원본 배열과 대상 배열의 위치를 임의로 지정할 수 있다.
		//형식) System.arraycopy(원본배열명, 시작위치, 대상배열명, 복사될위치, 복사할개수)
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for ( int i = 0 ; i < bookArray1.length ; i++) {
			System.out.print("bookArray1[" + i + "]= ");
			System.out.println(bookArray1[i]);
			bookArray1[i].show(); 
		}
		System.out.println("-------------------");
		
		for ( int i = 0 ; i < bookArray2.length ; i++) {
			System.out.print("bookArray2[" + i + "]= ");
			System.out.println(bookArray2[i]);
			bookArray2[i].show(); 
		}
		System.out.println("-------------------");
		
		//객체 멤버 데이터값 수정
		//bookArray1 과 bookArray2 객체 배열은 서로 공유
		//(공유!!! -> bookArray1에서 수정하면 bookArray2도 따라서 변경)
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for ( int i = 0 ; i < bookArray1.length ; i++) {
			System.out.print("bookArray1[" + i + "]= ");
			System.out.println(bookArray1[i]);
			bookArray1[i].show(); 
		}
		System.out.println("-------------------");
		
		for ( int i = 0 ; i < bookArray2.length ; i++) {
			System.out.print("bookArray2[" + i + "]= ");
			System.out.println(bookArray2[i]);
			bookArray2[i].show(); 
		}

	}

}
