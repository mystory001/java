package test6;
//만들어진 클래스로 객체를 생성하고 수행하는 클래스
public class BirthDay {
	public int day;
	public int month;
	public int year;
	
	//기본 생성자
	public BirthDay() {}
	//멤버 변수 내의 데이터값을 출력하는 메서드
	public void show() {
		System.out.println("day = " + day);
		System.out.println("month = " + month);
		System.out.println("year = " + year);
	}
}
