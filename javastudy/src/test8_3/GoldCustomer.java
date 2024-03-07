package test8_3;

//Gold고객 : 가격에 할인율 10%를 적용해서 가격을 지불하고 포인트 적립은 2%

public class GoldCustomer  extends Customer{

	double saleRatio; //할인율
	
	//생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "Gold"; 
		super.bonusRatio = 0.02; //보너스 적립율(2%)
		this.saleRatio = 0.1;	//할인율(10%)	
	}
	
	//보너스 포인트 적립, 지불 가격 계산 메서드 (재정의 : 오버라이드, 가상 메서드)
	//Gold 고객은 할인율(10%) 적용해서 계산후 리턴
	
	@Override
	public int calcPrice(int price) {
		//보너스포인트 = 보너스포인트 + (입력받은 가격 * 포인트 적립율)              
		//bonusPoint = bonusPoint + (price * bonusRatio);
		bonusPoint += (price * bonusRatio); //포인트 증가
		return price - (int)(price * saleRatio); //가격에 할인율 적용한 값을 차감해서 리턴
	}
	
	
}
