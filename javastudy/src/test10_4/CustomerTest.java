package test10_4;


interface Buy {	
	void buy(); //추상 메서드
	
	default void order() {
		System.out.println("구매 주문");
	}
}

interface Sell {
	void sell(); //추상 메서드
	
	default void order() {
		System.out.println("판매 주문");
	}
}

//한 클래스가 여러개의 인터페이스를 구현하는 경우
//형식) class 구현클래명 implements 인터페이스명, 인터페이스명
class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");		
	}

	@Override
	public void order() {
		//System.out.println("고객 판매 주문"); //재정의된 메서드로 호출됨!!
		//Buy.super.order();
		Sell.super.order();
		Buy.super.order();
	}
	
}

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		System.out.println("------------------");
		
		//인터페이스 참조변수
		//Buy buyer = new Customer();
		//클래스형이 인터페이스형으로 형변환이 이루어진다.!!!
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println("------------------");
		
		Sell seller = new Customer();
		seller.sell();
		seller.order();
		System.out.println("------------------");
		
		//클래스를 다중 상속(여러개의 클래스를 상속) 받는 기능을 대신해서 사용한다.!!!
		if (seller instanceof Customer) {
			//seller 인터페이스변수를 2개의 인터페이스의 추상메서드를 구현해 놓은 Customer 클래스형으로 형변환시킨다.!!
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
			customer2.order();
		}
		
		
		
	}

}
