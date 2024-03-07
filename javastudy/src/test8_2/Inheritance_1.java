package test8_2;

//다형성(polymorphism)
//1.하나의 기호를 여러 가지 의미로 사용하는 기술 -> 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
//2.객체 지향 기법의 특징 중의 하나로서 동일한 코드로 다양한 타입의 객체를 처리하는 기술이다.
//3.같은 메시지를 보내더라도 객체의 타입에 따라 다른 동작을 하게 하는 것이다.

//업캐스팅(upcasting) / 다운캐스팅(downcasting)

class Person1{
	
	String name; //이름
	
	//기본 생성자
	public Person1() {  }
	
	//일반 생성자
	//                        name=()
	//                         김하나
	public Person1(String name) {  
		this.name = name;
	}
	
	//
	public void person1Show() {
		System.out.println("name = " + this.name);
	}
	
}

class Student1 extends Person1{
	
	int grade;//학년
	
	//기본 생성자
	public Student1() {
			super(); //부모의 기본 생성자를 호출해서 부모의 멤버 변수를 초기화시킨후 데이값 대입 가능
		    
			//이름을 입력해야만 하는 일반생성자 public Person1(String name) 호출해서 
			//부모의 멤버 변수를 초기화시킨후 데이값 대입 가능
		    //super("김하나"); 
	}
	
	//일반 생성자
	public Student1(String name, int grade) {
		//이름을 입력해야만 하는 일반생성자 public Person1(String name) 호출해서 
		//부모의 멤버 변수를 초기화시킨후 데이값 대입 가능
		super(name);
		this.grade = grade;
	}
	
	public void student1Show() {
		System.out.println("grade = " + this.grade);
	}
	
}


public class Inheritance_1 {

	public static void main(String[] args) {
		
		Person1 p = new Person1();
		Student1 s = new Student1();
		
		p.person1Show();
		s.student1Show();
		System.out.println("----------------------");
		
		//다형성 : 객체의 형변환
		//부모(상위) 클래스에서 만든 객체는 부모(상위) 클래스의 멤버들만 사용이 가능하다.
		p.name = "김하나";
		p.person1Show();
		System.out.println("----------------------");
		
		//자식(하위) 클래스에서 만든 객체는 부모(상위) 클래스 멤버들과 자식(하위) 클래스 멤버들을 모두 사용할 수 있다.
		s.grade = 2;
		s.name = "이두나";
		s.person1Show();
		s.student1Show();
		System.out.println("----------------------");
		
		//업캐스팅(upcasting) : 상속된 자식(하위) 클래스에서 부모(상위) 클래스의 멤버들만 사용하게 제한하는 것이다.
		//Person1 p1; //부모(상위) 클래스형의 변수(객체명, 참조변수)
		//Student1 s1 = new Student1(); //자식(하위) 클래스형의 변수(객체명, 참조변수)
		//p1 = (Person1)s1;
		
		// 하위 클래스의 인스턴스가 상위 클래스로 형변환되는 과정이 묵시적으로 이루어진다.
		Person1 p1 = new Student1();
		
		p1.name = "박세나";
		p1.person1Show();
		//p1.grade = 1; //자신의 멤버는 사용할 수 없음
		//p1.student1Show(); //자신의 멤버는 사용할 수 없음
		System.out.println("----------------------");
		
		//다운캐스팅(downcasting) : 업캐스팅된 객체를 다시 자식(하위) 클래스의 객체의 멤버들을 사용할 수 있도록 되돌리는 것이다.
		//반드시 타입변환(형변환)을 지정해 주어야 한다.
		Student1 s2 = (Student1)p1;
		
		//*** 아래와 같은 다운케스팅 형식은 구현할 수 없다.!!!!
		//Student1 s3 = new Person1();
		
		s2.person1Show();
		s2.student1Show();
		System.out.println("----------------------");
		
		//업캐스팅되어 사용할 수 없었던 자신의 멤버 변수 grade에 새로운 데이터값을 대입해서 사용할 수 있다.
		s2.grade = 3;
		s2.person1Show();
		s2.student1Show();
		System.out.println("----------------------");
		
		
		
		
		
		
		

	}

}
