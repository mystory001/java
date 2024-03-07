//231204
package test6;

class Person{
	
	public String name;
	public int age;
	
	//기본 생성자
	Person(){}
	

	//일반 생성자 : 1)객체 생성 시 이름을 넣어주지 않으면 객체를 생성해주지 않음
	public Person(String name) {
		this.name = name;
	}
	
	
	//일반 생성자 : 2) 객체 생성 시 이름, 나이를 넣어주지 않으면 객체를 생성해주지 않음
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
		
	//멤버 변수 내의 데이터값을 출력하는 메서드
	public void show() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
	}
	
}


public class CallAnotherConst {

	public static void main(String[] args) {
	 //기본 생성자를 호출해서 멤버 변수의 데이터값을 초기화해서 객체 생성
	 Person p = new Person();
	 p.show();
	 System.out.println("----------------");
	 
	 //일반 생성자 1)
	 Person p1 = new Person("단군");
	 p1.show();
	 System.out.println("----------------");
	 //일반 생성자 2)
	 Person p2 = new Person("단군", 1000);
	 p2.show();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
