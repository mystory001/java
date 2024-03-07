package test8_2;

//상속을 받은 클래스는 객체 생성시에 부모(상위) 클래스의 객체를 먼저 생성하고
//부모(상위)의 멤버 변수를 먼저 초기화 시켜주어야만 자신의 객체가 생성된다. 

//**super() : 자식(하위) 클래스내에 생성자에서 부모의 생성자를 호출한다.!!
//-> 자식(하위) 클래스내에 생성자를 만들어줄때 생성자 내에 부모의 생성자를 호출할때 사용!!!
//**super : 자식(하위) 클래스내에서 부모(상위) 클래스 멤버에 접근할때 사용한다.!!
//->super.(부모)멤버변수명()  or super.(부모)멤버메서드();

//**this() : 자식(하위) 클래스의 생성자내에서 자신 생성자를 호출해서 사용한다.!!
//->자식(하위) 클래스내에 생성자를 만들어줄때 자신의 생성자중 하나를 호출할때 사용!!!
//**this : 자식(하위) 클래스의 자신의 멤버에 접근할 때 사용한다.!!
//this.(자신)멤버변수명()  or this.(자신)멤버메서드();

class Person{	
	String name; //null
	int age; //0
	
	//기본 생성자	
	public Person() {
		System.out.println("Person 클래스 기본 생성자 호출");
	}
	
	//일반 생성자
	//                        name("김하나"), age(20)
	public Person(String name, int age) { 
		this.name = name; //김하나
		this.age = age; //20
		System.out.println("Person 클래스 일반 생성자 호출");
	}
	
	public void show() {
		
		System.out.println("이름 : " + this.name + " , 나이 : " + this.age);
	}
}

//상속받은 자식(하위) 클래스
//형식)class 새로운 클래스명 extends 부모(상위)클래스
class Student extends Person{
	
	int kor; //국어 점수
	int math; //수학 점수
	int eng; //영어 점수
	
	//일반 생성자 : 상속받은 클래스는 자신의 생성자를 만들때 부모의 멤버변수에 넣어줄 
	//데이터값도 같이 초기화시키도록 지정해야 한다.!!
	//                              "김하나",       20,      100,      100,       100
	public Student(String name, int age, int kor, int math, int eng) {
		//super.name = name; //부모 멤버 변수 ->부모의 기본 생성자로 멤버 변수가 초기화된 상태에서 대입됨
		//super.age = age; //부모 멤버 변수->부모의 기본 생성자로 멤버 변수가 초기화된 상태에서 대입됨
		//super(); //부모의 기본 생성자로 멤버 변수가 초기화된 상태에서 대입됨
		//부모 생성자 중에서 public Person(String name, int age) 호출해서 멤버 변수에 데이터값을 초기화도시키고 대입시키는 기능을 동시에 한다.!!!	
		super(name, age);
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	//메서드 재정의 : 부모(상위) 클래스에서 상속받은 메서드가 자식(하위)클래스에서 필요한 내용을 바꿔서 사용할 수 있다.
	//메서드의 반환자료형, 메서드명, 매개변수 개수(자료형),리턴형식이 모두 동일해야 한다.
	@Override
	public void show() {
		super.show();
		System.out.println("국어 : " + this.kor);
		System.out.println("수학 : " + this.math);
		System.out.println("영어 : " + this.eng);		
	}

}

public class Inheritance {

	
	public static void main(String[] args) {
		
		//public Student(String name, int age, int kor, int math, int eng) 생성자 호출
		Student s = new Student("김하나", 20, 100,100,100);
		s.show();
		System.out.println("-----------------------");
		
		
		s.name = "이두나";
		s.age = 21;
		s.kor = 90;
		s.math = 90;
		s.eng = 90;
		s.show();

		
	}

}
