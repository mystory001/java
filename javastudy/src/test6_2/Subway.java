package test6_2;
//지하철 클래스 구현
public class Subway {
	String subLine; //지하철 노선
	int money; //지하철 수익
	//지하철 노선을 매개변수로 받는 메서드
	public Subway(String subLine) {
		this.subLine = subLine;
	}
	//승객이 지하철을 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money;
	}
	//지하철 정보를 출력하는 메서드
	public void showSub() {
		System.out.println(subLine + " 수익 " + money);
	}
}
