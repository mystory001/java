package test5_2;

public class Person1_Main {

	public static void main(String[] args) {
		
		//name 변수에 데이터값을 입력 받아야 객체(인스턴스)를 생성해주는 Person1(String pname)을 호출해서 멤버변수들의 데이터값을 초기화함.
		Person1 p = new Person1("가나다");
		p.show();
		System.out.println("-----------------");
		
		//name, height 변수에 데이터값을 입력 받아야 객체를 생성해주는 Person1(String pname, float height)을 호출해서 멤버변수들의 데이터값을 초기화함 
		Person1 p1 = new Person1("가나다", 123.45f);
		p1.show();
		System.out.println("-----------------");
		
		//name, height 변수에 데이터값을 입력 받아야 객체를 생성해주는 Person1(String pname, float height, float weight)을 호출해서 멤버변수들의 데이터값을 초기화함 
		Person1 p2 = new Person1("가나다", 123.45f, 32.1f);
		p2.show();
		System.out.println("-----------------");
		
		//생성자를 직접 구현하여 디폴트 생성자가 없기 때문에 오류가 발생
		//기본 생성자 형식
		Person1 p3 = new Person1();
		p3.show();

	}

}
