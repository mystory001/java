package test17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest1 {

	public static void main(String[] args) {

		//ArrayList에서 스트림 사용
		List<String> sList = new ArrayList<String>();
//		==ArrayList<String> sList = new ArrayList<String>();
		sList.add("HTML");
		sList.add("CSS");
		sList.add("JavaScript");
		sList.add("Java");
		
		
		for(int i = 0 ; i < sList.size();i++) {
			System.out.println(sList.get(i));
		}
		
		System.out.println("======================");
		
		Stream<String> stream = sList.stream(); //스트림 생성
		stream.forEach(s->System.out.println(s + "")); //배열의 요소를 하나씩 출력
		
		System.out.println("======================");
		
		//체이닝 방식으로 한 번에 지정
		//스트림을 새로 생성	정렬		요소를 하나씩 꺼내어 출력
		sList.stream().sorted().forEach(s->System.out.println(s + ""));
		sList.stream().sorted().forEach(s->System.out.println(s + ""));
	}

}
