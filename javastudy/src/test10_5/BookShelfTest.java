package test10_5;

import java.util.ArrayList;

//선반 클래스
class Shelf {
	
	//자료를 순서대로 저장할 ArrayList 선언(배열 객체 선언 : 도서명만 저장할 수 있는 String형으로 제한)
	//멤버 변수가  객체형
		protected ArrayList<String> shelf;
		
		//ArrayList<String> shelf = new ArrayList<String>();
		//기본 생성자 : 객체 생성시에 ArrayList shelf 객체도 생성됨
		public Shelf( ) {
			shelf = new ArrayList<String>();
		}

		//getter : 저장되어 있는  객체 배열  shelf  반환
		public ArrayList<String> getShelf() {
			return shelf;
		}	
		
		//배열 Shelf에 저장된 요소 개수를 반환
		public int getCount() {
			return shelf.size();
		}		
	
}

//자료구조 : 객체를 어떤 자료구조 형식으로 처리할 것인가? 를 지정하는 인터페이스

interface Queue {
	
	void enQueue(String title); //배열의 맨 마지박에 추가(입력되는 요소값을 배열의 맨 뒤에 추가)
	String deQueue(); //배열의 맨 처음 항목 반환(맨 앞에 있는 요소를 제거)
	int getSize(); //현재 Queue에 남아 았는 개수 반환
		
}

//구현 클래스 만들기
class Bookshelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);		//배열에 요소 추가
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //맨 처음 요소를 배열에서 삭제하고 결과를 반환
	}

	@Override
	public int getSize() {		
		return getCount(); //배열 요소 개수 반환
	}
		
}

public class BookShelfTest {
	
	public static void main(String[] args) {
		
		Queue shelfQueue = new Bookshelf();
		shelfQueue .enQueue("태백산맥 1");
		shelfQueue .enQueue("태백산맥 2");
		shelfQueue .enQueue("태백산맥 3");
		
		System.out.println(shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
		
		
		
		
		
	
	
	}
}
