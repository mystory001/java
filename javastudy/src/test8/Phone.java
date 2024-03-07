package test8;

//상속 (inheritance) : 새로운 클래스를 작성할 때 기존에 존재하는 클래스를 물려받아 이용하는 것이다.

//Object 클래스 : 모든 클래스의 조상이다. ->모든 클래스는 Object클래스 하위 클래스로 등록된다.
//-> Object클래스 내의 모든 멤버들을 모든 클래스에서 사용할 수 있다.!!!!
//핸드폰에 대한 정보를 가진 클래스
public class Phone {
	String modelName; //핸드폰 모델명
	String color; //핸드폰 색상
	int price; //핸드폰 가격
	
	//생성자를 하나도 정의하지 않으면 컴파일러가 기본생성자 형식으로 추가해서 객체를 생성해준다.
	//기본 생성자
	public Phone() {   }
	
	//일반 생성자
	//                                "모토로라",          "Blue",       1300000,16
	public Phone(String modelName, String color, int price) {
		this.modelName = modelName;
		this.color = color;
		this.price = price;
	}
	
	
	 public void call( ) {
		System.out.println("전화를 거는 기능!!");
	}
	
	public void receive() {
		System.out.println("전화를 받는 기능!!");
	}
	
	public void show() {
		System.out.println("(Phone클래스)모델명 = " + this.modelName);
		System.out.println("(Phone클래스)색상 = " + this.color);
		System.out.println("(Phone클래스)가격 = " + this.price);
	}
	
	
}
