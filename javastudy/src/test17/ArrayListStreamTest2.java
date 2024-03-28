package test17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListStreamTest2 {

	public static void main(String[] args) {

		//문자열 스트림 객체를 생성해서 중복 제거, 필터링으로 출력
		//List객체 생성
		List<String> list = Arrays.asList("a","b","a","c","a","d");
		
		list.stream().forEach(a -> System.out.print(a + " "));
		
		System.out.println();
		
		//distinct() 메소드로 중복 제거 후 내부 반복자로 출력
		list.stream().distinct().forEach(s -> System.out.print(s + " "));;
		
		System.out.println();
		
		//"a"인 문자열로 필터링 후 내부 반복자로 출력
		list.stream().filter(m -> m.startsWith("a")).forEach(m -> System.out.print(m + " "));;
		
		System.out.println();
		
		//중복 제거와 "a"인 문자열 필터링 후 내부 반복자로 출력
		list.stream().distinct().filter(o -> o.startsWith("a")).forEach(b -> System.out.print(b + " "));
		
		System.out.println();
		
		//문자열 스트림 객체를 생성해 문자열의 길이값으로 구성된 IntStream 객체를 생성한 후 내부 반복자로 반복하면서 해당 요소의 문자열의 길이
		//mapping : 스트림의 데이터를 매개변수로 받아 가공해 새로운 스트림을 만들어서 리턴
		//			데이터의 변환을 위한 기능으로 스트림의 요소를 다른 요소와 매핑해서 대체할 수 있는 기능
		//int 타입을 받아 IntStream객체 리턴
		
		//함수형 인터페이스 방식
		List<String> listint = Arrays.asList("HTML","CSS","Javascript","Java");
		listint.stream().mapToInt(t -> t.length()).forEach(u -> System.out.print(u + " ")); 
		
		System.out.println();
		
		//함수형 인터페이스의 메소드 참조 방식
		listint.stream().mapToInt(String::length).forEach(System.out::println); 
		
		System.out.println();
		
		//정렬
		listint.stream().sorted().forEach(System.out::println); //오름차순
		System.out.println();
		listint.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //내림차순
		
		
	}

}
