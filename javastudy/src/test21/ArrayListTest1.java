package test21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {

//		ArrayList<String> list = new ArrayList();
		List<String> list = new ArrayList();
		
		//데이터(객체) 저장. 기본형은 저장할 수 없음
		list.add(new String("자몽"));
		list.add("사과");
		list.add("배");
		list.add("키위");
		list.add("파인애플");
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		System.out.println("초기 상태 : "+list);
		
		//저장한 데이터(객체) 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		System.out.println(list.get(7));
		
		System.out.println();
		
		//새로운 요소(객체) 추가
		list.add("멜론");
		list.add(2, "수박");
		System.out.println("새로운 요소 추가 : " + list);
		
		System.out.println();
		
		//지정된 요소(객체) 삭제
		list.remove(0);
		System.out.println("index 0 요소 제거 : " + list);
		
		System.out.println();
		
		//지정된 요소(객체) 수정
		list.set(0, "자몽");
		System.out.println("index 0 요소 수정 : " + list);
		
		System.out.println();
		
		//요소값 모두 출력
		System.out.print("요소값 출력 : ");
		for(int i = 0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		
		//외부 반복자(Iterator 인터페이스) : Iterable 인터페이스의 하위 인터페이스
		//Collection Interface를 상속받은 모든 하위 인터페이스들의 구현 클래스들에서 모두 사용이 가능
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			Object str1 = iter.next();
			System.out.println(str);
			System.out.println(str1);
			System.out.println(iter.next());
		}
		
		
		
	}

}
