package test6_2;
//버스 클래스 구현
public class Bus {
	int busNum; //버스 번호
	int money; //버스 수입
	//버스 번호를 매개변수로 받는 생성자
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	//승객이 버스를 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money;
	}
	//버스 정보를 출력하는 메서드
	public void showB() {
		System.out.println(busNum + " 수익 " + money);
	}
	
	
	
	
	
	

}
