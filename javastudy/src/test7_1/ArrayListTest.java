package test7_1;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ArrayList 클래스 사용하기
		
		//컬렉션 프레임워크(Collection Framework)
		//->데이터의 저장,이와 관련 있는 알고리즘을 구조화 해 놓은 프레임워크이다
		//컬렉션 프레임워크를 구성하는 클래스들은 많은 양의 인스턴스를 다양하고 효율적으로 저장이 가능하다.
		
		
		//배열의 단점을 보완해서 객체의 저장, 검색, 수정, 삭제가 가능하게 만들어놓은 클래스이다.
		//10개 정의 ->데이터가 추가되면 자동으로 10개씩 메모리 공간을 추가한다.
		//제너릭(Generic)을 지정하지 않으면 모든 자료형(클래스형)의 객체들을 저장 가능하다.
		
		//요소는 객체들만 가능하다.(기본 자료형은 넣을 수 없다.) -> 기본형은 객체형으로 바꾸어주어야 한다.
		
		
		/*
		//객체 생성
		ArrayList alist = new ArrayList();
		
		//데이터 넣기 (객체형만 가능) : add() 메서드
		
		
		String name = "김하나";
		String name1 = new String("김하나");
		
		alist.add(new String("사과"));
		alist.add("배"); //add 메서드가 객체형으로 만들어서 넣어준다.
		alist.add("오렌지");
		alist.add("바나나");
		alist.add("멜론");
		alist.add(1); //new Integer(1)
		alist.add(10.5); //new Double(10.5)
		
		System.out.println("초기 상태 : " + alist);
		System.out.println("---------------");
		
		//데이터 가져오기 : get(인덱스번호)
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
		System.out.println(alist.get(3));
		System.out.println(alist.get(4));
		System.out.println(alist.get(5));
		System.out.println(alist.get(6));		
		System.out.println("---------------");
		
		//새로운 요소(객체) 추가하기
		alist.add(1, "딸기");
		System.out.println("초기 상태 : " + alist);
		System.out.println("---------------");
		
		//지정된 요소(객체) 삭제
		alist.remove(0);
		System.out.println("초기 상태 : " + alist);
		System.out.println("---------------");
		
		//지정된 요소 수정
		alist.set(0, "사과");
		System.out.println("초기 상태 : " + alist);
		System.out.println("---------------");
		
		//요소값 모두 출력 :  Object 클래스 (자료형) -> 모든 타입의 객체를 담을 수 있다.
		for(int i = 0 ; i < alist.size() ; i++) {
			Object o = alist.get(i); //객체를 담을 변수명 지정 = get(가져올객체 인덱스번호);
			//System.out.println("alist 객체내의 요소값 출력 = " + o);
			System.out.println("alist[" + i + "] =" + o);
		}
		System.out.println("---------------");
		
		//향상된 for문
		int i = 0;
		for (Object o1 : alist) {
			//System.out.println("alist 객체내의 요소값 출력 = " + o1);
			System.out.println("alist[" + i + "] =" + o1);
			i++;
		}
		System.out.println("=============");
		
		//제너릭(Generic) : 다둘 객체의 자료형을 미리 명시해준다.
		
		ArrayList<String> alist1 = new ArrayList<String>();
		
		alist1.add("사과");
		//alist1.add(100); String 클래스로 생성한 객체가 아니므로 오류!!!
		//alist1.add(100.5);
		*/
		
		//제너릭 클래스 : <Book> 클래스에 생성한 객체만 저장된다.!!
		ArrayList<Book> library = new ArrayList<Book>();
		
		
		library.add(new Book("태백산맥", "조정래"));		
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "셍텍쥐페리"));
		
		System.out.println("library = " + library);
		System.out.println("---------------");
		
		for ( int i = 0 ; i < library.size(); i++) {
			Book book = library.get(i);
			book.show();
		}
		System.out.println("---------------");
		
		System.out.println("--- 향상된 for문 사용 ---");
		for (Book book : library) {
			book.show();
		}
		
		//지정된 요소(객체) 삭제
		library.remove(0);
		System.out.println("library = " + library);
		System.out.println("---------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
