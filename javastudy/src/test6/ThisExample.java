//231204
package test6;
//설계 + 수행하는 클래스
public class ThisExample {

	public int day;
	public int month;
	public int year;
	
	//기본 생성자
	public ThisExample() {}
	//멤버 변수 내의 데이터값을 출력하는 메서드
	public void show() {
		System.out.println("day = " + day);
		System.out.println("month = " + month);
		System.out.println("year = " + year);
	}
	
	
	
	public static void main(String[] args) {
		ThisExample t = new ThisExample();
		t.show();
		System.out.println("----------------");
		
		
	}

}
