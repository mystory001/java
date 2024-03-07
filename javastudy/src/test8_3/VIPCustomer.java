package test8_3;

//vip 고객을 위한 클래스
//vip 고객은 가격에 할인율 10%(0.1)를 적용해서 가격을 지불하고 포인트 적립은 5%(0.05)

public class VIPCustomer  extends Customer{
	
		//VIP 고객 관련 기능을 구현할 때만 필요한 멤버 변수 추가
		private int agentID;//VIP 고객 담당 상담원 아이디
		double saleRatio;//VIP 고객 가격에서 할인해 줄 할인율(10% -> 0.1)
		
		//일반 생성자
		//                                   10020,                   "김유신",            12345
		public VIPCustomer(int customerID, String customerName, int agentID){
			super(customerID, customerName); //부모(상위) customerID에 멤버 변수에 대입
			super.customerGrade = "VIP"; //부모(상위 ) customerGrade에 멤버 변수에 대입
			super.bonusRatio = 0.05; //보너스 적립율(5%) -> 부모(상위 ) bonusRatio 멤버 변수에 대입
			this.saleRatio = 0.1; //할인율(10%)
			this.agentID = agentID; //VIP 고객 담당 상담원 아이디		
		}
		
		//보너스 포인트 적립, 지불 가격 계산 메서드 (재정의 : 오버라이드, 가상 메서드)
		//vip 고객은 할인율 적용해서 계산후 리턴
		
		
		public int calcPrice(int price) {
			//보너스포인트 = 보너스포인트 + (입력받은 가격 * 포인트 적립율)              
			//bonusPoint = bonusPoint + (price * bonusRatio);
			bonusPoint += (price * bonusRatio); //포인트 증가
			return price - (int)(price * saleRatio); //가격에 할인율 적용한 값을 차감해서 리턴
		}
		
		//고객이름, 등급, 보너스 포인트, 담당 상담원 번호 출력 메서드 (재정의 : 오버라이드, 가상 메서드)
		
		public String showCustomerInfo() {
			return super.showCustomerInfo() + " , 담당 상담원 번호 : " + this.agentID ;
		}

		//VIP 고객 담당 상담원 아이디	를 return : 따로 가져와서 사용하고 싶은 경우 -> getter 메서드
		public int getAgentID() {
			return agentID;
		}
	

}
