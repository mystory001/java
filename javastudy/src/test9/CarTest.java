package test9;

//1.템플릿 메서드(Templete Method)
//템플릿 메서드는 디자인 패턴 중 하나로, 틀이 정해진 메서드를 의미한다. 
//템플릿 메서드를 사용하면 실행의 순서를 정할 수 있다. (시나리오를 정의)
// 템플릿 메서드를 사용하면 실행의 순서는 정해놓고 구현은 상속받는 각 하위 클래스마다 다르게 할 수 있게 된다

//2.final 제어자
//final 클래스 : 확장(상속)할 수 없는 클래스 -> 하위 클래스에서 상위 클래스를 상속 받지 못한다.
//final 메서드 : 변경될 수 없는 메서드  ->  하위 클래스에서 메서드 재정의(override)를 할 수 없다.
//final 변수 : 데이터값을 변경할 수 없는 변수 -> 변수에 새로운 데이터 값을 대입할 수 없으므로 상수가 된다.

abstract class Car{
	
	//생성자를 하나도 정의하지 않으면 컴파일러가 기본 생성자를 추가해서 객체를 생성하도록 해준다.
	public static int size = 10;
	
	//추상 메서드
	public abstract void drive();
	public abstract void stop();
	
	//일반 메서드
	public void startCar( ) {
		System.out.println("시동을 켭니다.!!!");
	}
	
	public void turnOff( ) {
		System.out.println("시동을 끕니다.!!!");
	}
	
	//템플릿 메서드 : 메서드 실행의 순서를 정할 수 있다. (시나리오를 정의)
	//final 메서드 : 변경될 수 없는 메서드  ->  하위 클래스에서 메서드 재정의(override)를 할 수 없다.
	final public void run() {
		startCar( );
		drive();
		stop();
		turnOff( );		
	}
}

//추상 메서드를 모두 구현한 객체를 생성할 수 있는 일반 클래스이다.!!
class AICar extends Car{
	
	/*
	//기본 생성자
	 public AICar() {
		 super(); //부모의 생성자 중에서 기본생성자를 호출해서 size멤버 변수에 데이터값을 초기화시킨다.
		 super.size = 20;
	 }
	 */
	
	@Override
	public void drive() {
		System.out.println("자율 주행합니다.!!!");
		System.out.println("자동차가 알아서 방향을 전환합니다.!!!");		
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.!!!");
		
	}	
	
	
	
}

//추상 메서드를 모두 구현한 객체를 생성할 수 있는 일반 클래스이다.!!
class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.!!!");
		System.out.println("사람이 핸들을 조작합니다.!!!");	
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.!!!");
		
	}
	
	
}


public class CarTest {

	public static void main(String[] args) {

		//추상 클래스는 객체를 생성할 수 없다.
		//Car car = new Car();
		
		
		Car myCar = new AICar();
		myCar.drive();
		myCar.stop();
		myCar.startCar();		
		myCar.turnOff();
		System.out.println("myCar.size = " + myCar.size );
		myCar.size = 20;
		System.out.println("myCar.size = " + myCar.size );
		
		System.out.println("----------------");
		
		//템플릿 메서드내의 정의된 시나리오 순서대로 수행된다.
		System.out.println("=== 자율 주행하는 자동차 ===");
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		
		Car hisCar = new ManualCar();
		hisCar.run();

	}

}
