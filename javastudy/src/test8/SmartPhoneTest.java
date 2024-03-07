package test8;

public class SmartPhoneTest {

	public static void main(String[] args) {
		
		/*
		//기본 생성자를 호출 멤버 변수의 데이터값을 초기화해서 객체 색성
		Phone p = new Phone();
		
		System.out.println("Phone 클래스 객체 출력");
		p.show();
		System.out.println("--------------------");
		
		p.call();
		p.receive();
		System.out.println("--------------------");
		
		p.modelName = "Galaxy=S23";
		p.color = "white";
		p.price = 1500000;
		
		p.show();
		System.out.println("--------------------");
		
		System.out.println("smartPhone 클래스 객체 출력");
		
		
		//기본 생성자를 호출 멤버 변수의 데이터값을 초기화해서 객체 색성
		//public SmartPhone() 기본 생성자 호출!!
		SmartPhone sp = new SmartPhone();
		
		sp.modelName = "iPhone-15";
		sp.color = "silver";
		sp.price = 1700000;
		
		sp.show();
		System.out.println("--------------------");
		
		sp.call();
		sp.receive();
		sp.installApp();
		sp.gamePlayer();
		sp.movie();
		*/
		
		SmartPhone sp1 = new SmartPhone();
		sp1.show();
		System.out.println("--------------------");
		
		//public SmartPhone(String modelName, String color, int price, int memory) 생성자 호출
		SmartPhone sp2 = new SmartPhone("모토로라", "Blue", 1300000,16);
		sp2.show();
	}
	
	
	

}
