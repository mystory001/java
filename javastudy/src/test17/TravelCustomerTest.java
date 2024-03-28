package test17;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {
		TravelCustomer tc1 = new TravelCustomer("이성계", 100, 1);
		TravelCustomer tc2 = new TravelCustomer("이방원", 300, 3);
		TravelCustomer tc3 = new TravelCustomer("이방과", 50, 2);

		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(tc1);
		customerList.add(tc2);
		customerList.add(tc3);
		
		System.out.println("고객 명단을 추가된 순서대로 출력");
		customerList.stream().map(c -> c.getName()).forEach(System.out::println);
		
		System.out.println();
		
		int total = customerList.stream().mapToInt(p -> p.getPrice()).sum();
		System.out.println("총 비용 : "+total);
		
		System.out.println();
		System.out.println("등급이 2이상 고객 명단 정렬하여 출력");
		customerList.stream().filter(g -> g.getGrade()>=2).map(n -> n.getName()).sorted().forEach(System.out::println);
//		customerList.stream().map(n -> n.getName()).sorted().filter(g -> g.getGrade()>=2).forEach(System.out::println);
	
		
		
	}

}
