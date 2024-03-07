package test8_3;

//프로그램에서 백분율(%)계산 : 반드시 숫자 형식으로 환산해서 지정해야 한다.
//100% -> 1,  10% -> 0.1, 1% -> 0.01

//silver 고객 클래스
//silver 고객 : 가격은 그대로 지불하고 포인트 적립만 가격의 1%

//접근제어자 : protected -> 상속을 받은 자식(하위)클래스에서 접근이 가능하도록 한다.!!!
public class Customer {
	
	protected int customerID; //고객ID
	protected String customerName; //고객이름
	protected String customerGrade; //고객등급
	
	int bonusPoint; //보너스 포인트 적립
	double bonusRatio; //보너스 적립율
	
	//기본생성자
	public Customer() {
		initCustomer();
	}
	
	//일반 생성자 : 고객 등급과 보너스 포인트 적립율은 지정은 initCustomer() 함수 호출해서 멤버 변수에 데이터값 넣기
	
	//                    customerID(10020),      customerName("김유신")
	public Customer(int customerID, String customerName) {		
		this.customerID = customerID;
		this.customerName = customerName;		
		initCustomer();
	}	
	
	//외부 클래스에서는 접근할 수 없는 메서드 : 멤버 변수의 초기화 부분
	//생성자에서만 호출하는 메서드이므로 private으로 선언
	private void initCustomer() {
		this.customerGrade ="SILVER";
		this.bonusRatio = 0.01; //보너스 적립율(1%)
	}
	
	//보너스 포인트 적립, 지불 가격 계산 메서드
	//가격: 그대로 지불하고, 보너스 포인트 적립 : 가격의 1%
	public int calcPrice(int price) {
		//보너스포인트 = 보너스포인트 + (입력받은 가격 * 포인트 적립율)              
		//bonusPoint = bonusPoint + (price * bonusRatio);
		bonusPoint += (price * bonusRatio); //포인트 증가 (가격*보너스 적립율(1%))
		return price; //가격 그대로 리턴
	}
	
	// 고객이름, 등급, 보너스 포인트 출력 메서드
	public String showCustomerInfo() {
		return customerName +"님 등급 :  " + customerGrade + ", 보너스포인트 :  " + bonusPoint + "점";
	}

}
