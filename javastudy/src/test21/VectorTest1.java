package test21;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest1 {
	public static void main(String[] args) {
		
		//ArrayList 이전 사용되던 List 자료구조
		//2개 이상의 스레드가 동시에 vector에 사용하는 경우에 오류가 나지 않도록 동기화를 지원
		// -> ArrayList보다 처리속도가 느리고 실행 순서를 보장함
		
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(10); //List에서 제공하는 메소드
		vector.add(11);
		vector.add(12);
		vector.add(13);
		vector.addElement(14); //이전 Vector 사용 메소드
		
		System.out.println("초기 상태 : " + vector);
		
		System.out.println();
		
		//저장해 놓은 데이터(객체) 가져오기 : get() 메소드 사용
		for(int i = 0 ; i <vector.size();i++) {
			System.out.println(vector.get(i));
		}
		
		System.out.println();
		
		int num = 13;
		
		//indexOf() : 몇 번째 위치에 있는 인덱스 번호를 반환 -> 해당 요소의 인덱스가 없으면 -1을 리턴
		int index = vector.indexOf(num);
		
		if(index >= 0) { //index >= 0 요소가 존재함
			System.out.println(num + "의 위치 " + index);
		} else {
			System.out.println(num + "은 존재하지 않음");
		}
		
		System.out.println();
		
		num = 14;
		
		int index1 = vector.indexOf(num);
		
		if(vector.contains(num)) {
			System.out.println(num + "의 위치 " + index1);
			
			//제거
			vector.removeElement(num); //이전 Vector 사용 메소드
			System.out.println(num + " 삭제");
		} 
		
		System.out.println("vector 제거 후 : " + vector);
		
		System.out.println();
		
		//자료 구조의 내부 요소를 순회하는 객체를 생성해서 출력
		Iterator<Integer> iterator = vector.iterator();
		
		while(iterator.hasNext()) {
			Integer data = iterator.next();
			System.out.println(data);
		}
		
		
		
	}
}
