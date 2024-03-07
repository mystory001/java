//231204
package test6;

class Person1{
	
	public String name;
	public int age;
	
	//기본 생성자
	Person1(){
		this("단군",20);
		// ==
		//this.name = "단군";
		//this.age = 1000;
	}
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}	
		
	//멤버 변수 내의 데이터값을 출력하는 메서드
	public void show() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
	}
	
}

public class CallAnotherConst1 {

	public static void main(String[] args) {
	 //기본 생성자를 호출해서 멤버 변수의 데이터값을 초기화해서 객체 생성
	 Person1 p = new Person1();
	 p.show();
	 System.out.println("----------------");
	 
	}

}
