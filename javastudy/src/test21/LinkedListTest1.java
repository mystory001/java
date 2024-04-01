package test21;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println("list : " + list);
		
		System.out.println();
		
		list.add(1, "D");
		System.out.println("list : " + list);
		
		System.out.println();
		
		list.addFirst("0");
		System.out.println("list : " + list);
		
		System.out.println();
		
		list.addLast("E");
		System.out.println("list : " + list);
		
		System.out.println();
		
		
		System.out.println("list 첫번째 요소 삭제 : " + list.removeFirst());
		System.out.println(list);
		System.out.println("list 마지막 요소 삭제 : " + list.removeLast());
		System.out.println(list);
		
		//ArrayList, LinkedList 속도 차이
		//처음 데이터 추가(100000개 추가) 
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		
		for(int i = 0 ; i < 1000000; i++) {
			alist.add(i);
			llist.add(i);
		}
		
		System.out.println();
		
		System.out.println("ArrayList Access");
		long start = System.currentTimeMillis();
		//alist 가져오기
		for(int i = 0; i<alist.size();i++) {
			alist.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end -start);
		
		System.out.println();
		
		System.out.println("LinkedList Access");
		long start1 = System.currentTimeMillis();
		for(int i =0; i<llist.size();i++) {
			llist.get(i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
		
		System.out.println();
		
		//중간에 데이터 삽입 시 처리 속도
		System.out.println("ArrayList 삽입 시 처리 속도");
		long start2 = System.currentTimeMillis();
		for(int i = 0; i< 100000; i++) {
			alist.add(500,i); //500번째 삽입
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
		
		System.out.println("LinkedList 삽입 시 처리 속도");
		long start3 = System.currentTimeMillis();
		for(int i = 0; i< 100000; i++) {
			llist.add(500, i);
		}
		long end3 = System.currentTimeMillis();
		System.out.println(end3-start3);
		
		//초기화 속도 ArrayList > LinkedList
		//삽입 시 처리 속도 ArrayList < LinkedList
		
		//LinkedList : ArrayList에 비해 중간에 데이터를 삽입, 삭제하는 데 걸리는 시간이 빠름
		//			   크기를 동적으로 증가 시키게 되고 각 요소는 요소의 자료와 다음 요소의 주소를 저장하는 부분으로 구현됨
		
	}

}
