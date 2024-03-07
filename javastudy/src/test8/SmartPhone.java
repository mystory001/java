package test8;
//핸드폰의 기능을 가진 클래스 
//상속관계 확인 : Ctrl + T

//** 상속을 받은 클래스는 객체 생성시에 부모(상위) 클래스의 객체를 먼저 생성하고, 부모(상위) 클래스의 멤버 변수를 먼저 초기화시켜 주어야만 자신의 객체가 생성된다.
//자식(하위) 클래스에서 객체를 생성할 때 생성자를 호출해서 객체를 생성한다.
//->**생성자를 만들어 줄때 자신의 생성자내에 부모의 생성자를 호출해서 부모(상위) 클래스의 멤버 변수를 먼저 초기화시켜 주어야 한다.!!!
//->**그렇지 않으면 자식(하위) 클래스의 객체를 생성해주지 않으며 부모(상위)클래스의 멤버 변수를 사용할 수 없다.

//**super() : 자식(하위) 클래스내에 생성자에서 부모의 생성자를 호출한다.!!
// -> 자식(하위) 클래스내에 생성자를 만들어줄때 생성자 내에 부모의 생성자를 호출할때 사용!!!
//**super : 자식(하위) 클래스내에서 부모(상위) 클래스 멤버에 접근할때 사용한다.!!
//->super.(부모)멤버변수명()  or super.(부모)멤버메서드();

//**this() : 자식(하위) 클래스의 생성자내에서 자신 생성자를 호출해서 사용한다.!!
//->자식(하위) 클래스내에 생성자를 만들어줄때 자신의 생성자중 하나를 호출할때 사용!!!
//**this : 자식(하위) 클래스의 자신의 멤버에 접근할 때 사용한다.!!
//this.(자신)멤버변수명()  or this.(자신)멤버메서드();


//클래스 상속받는 형식 :  class 새로운클래스명 extends 부모(상위) 클래스명
public class SmartPhone extends Phone {
	
	int memory; //SmartPhone 클래스에만 존재하는 멤버 변수
	
	//생성자를 하나도 정의하지 않으면 컴파일러가 기본생성자 형식으로 추가해서 객체를 생성해준다.
	public SmartPhone() {  
		//부모 생성자 중에서 기본 생성자를 호출해서 멤버 변수의 데이터값을 초기화시켜준다.!!! 
		//super(); //정의 하지 않으면 컴파일러가 자동으로 추가해서 부모(상위)클래스의 멤버 변수를 초기화시켜준다.!!!
		
		//부모 생성자 중에서 모델명, 색상, 가격을 입력해주지 않으면 객체를 생성해주지 않는 일반 생성자를 호출해서 멤버 변수의 데이터값을 초기화시켜준다.!!!  
		//public Phone(String modelName, String color, int price) 생성자 호출!!
		super("샤오미", "Gold", 800000);
	}
	
	//일반 생성자
	//                                        "모토로라",          "Blue",       1300000,      16
	public SmartPhone(String modelName, String color, int price, int memory) {
		//public Phone(String modelName, String color, int price) 부모 생성자 호출
		super(modelName, color,price);
		this.memory = memory;
	}
	
	
	public void installApp() {
		System.out.println("앱 설치 기능!!");
	}
	
	public void gamePlayer() {
		System.out.println("게임 기능!!");
	}
	
	public void movie() {
		System.out.println("동영상 촬영 기능!!");
	}
	
	public void show() {
		System.out.println("(Phone클래스)모델명 = " + super.modelName);
		System.out.println("(Phone클래스)색상 = " + super.color);
		System.out.println("(Phone클래스)가격 = " + super.price);
		System.out.println("(SmartPhone클래스)메모리용량 = " + this.memory);
	}
	
}
