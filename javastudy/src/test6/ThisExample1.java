//231204
package test6;

//설계도 클래스
//.java 형식으로 존재하지 않고 컴파일해서 사용할 때 존재하게 됨.(bin 폴더 내에 .class로만 존재)
class BirthDay1{
	public int day;
	public int month;
	private int year;
	
	//기본 생성자
	public BirthDay1() {}

	//접근자 : getter
	public int getYear() {
		return year;
	}
	//생성자 : setter
	public void setYear(int year) {
		this.year = year;
	}

	//this 출력 메서드 : 클래스내에서 자신을 출력해보는 메서드
	public void printThis() {
		System.out.println(this);//객체(인스턴스)를 생성하면 객체명이 됨
	}


	public void show() {
		System.out.println("day = " + day);
		System.out.println("month = " + month);
		System.out.println("year = " + year);
	}




}

public class ThisExample1 {

	public static void main(String[] args) {
		BirthDay1 b = new BirthDay1();
		b.show();
		System.out.println("-------------------");
		b.setYear(2000);
		System.out.println("b.getYear() = " + b.getYear());
		System.out.println("-------------------");
		b.show();
		System.out.println("-------------------");
		b.printThis();

	}

}
