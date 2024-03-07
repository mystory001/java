package test8_3;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		/*
		Customer customerLee = new Customer();
		customerLee.customerID = 10010;
		customerLee.customerName = "이순신";
		customerLee.bonusPoint = 1000; //보너스 포인터 기본값 : 1000점부터 시작
		
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("-----VIPCustomer ---------");
		//Customer 클래스를 상속 받은 하위(자식) 클래스 VIPCustomer 객체 생성
		
		//하위(자식) 클래스 VIPCustomer 객체에서 부모(상위) Customer형의 멤버들만 사용할 수 있다.(업캐스팅)
		//VIPCustomer(int customerID, String customerName, int agentID) 일반 생성자 호출
		Customer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 1000;//보너스 포인터 기본값 : 1000점부터 시작
		System.out.println(customerKim.showCustomerInfo());
		
		//형변환(업캐스팅) : 재정의된 메서드가 호출된다.!!!!
		System.out.println("-----할인율과 보너스 포인트 계산 -------");
		
		//가격을 매개변수값으로 넘겨주면 만들어놓은 메서드를 호출해서 포인트와 적립율, 할인 금액 계산
		
		//public int calcPrice(int price) 메서드 호출 : 가격은 그대로 지불하고 ,가격의 1%포인트 적립 
		int price = 1000;
		
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.customerName + "님이 " + leePrice + " 원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println(customerKim.customerName + "님이 " + kimPrice + " 원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		*/
		
		System.out.println("-----GoldCustomer ---------");
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		//Silver
		//public Customer(int customerID, String customerName) 생성자 호출
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");

		//Gold(업캐스팅)
		//public GoldCustomer(int customerID, String customerName) 생성자 호출
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율");
		
		//VIP(업캐스팅)
		//VIPCustomer(int customerID, String customerName, int agentID) 생성자 호출
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		//
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("-----고객 정보 출력 ---------");
		for (Customer customer :  customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("-----할인율과 보너스 포인터 계산 ---------");
		int price = 10000;
		
		for (Customer customer :  customerList) {
			//System.out.println(customer.showCustomerInfo());
			int cost = customer.calcPrice(price);
			System.out.println(customer.customerName + "님이 " + cost + " 원 지불하셨습니다.");
			System.out.println(customer.customerName + "님의 보너스 포인트는 " + customer.bonusPoint + " 점 입니다.");
		}
		
		System.out.println("-----instanceof 키워드 ---------");
		// instanceof 키워드 : 왼쪽 객체가 오른쪽의 클래스로부터 상속된 객체인지 판별해준다.(객체가 자신의 클래스도 포함)
		//형식)객체명(참조변수명) instanceof  클래스명;
		System.out.println(customerLee instanceof Customer);
		System.out.println(customerLee instanceof VIPCustomer);
		System.out.println(customerLee instanceof GoldCustomer);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
