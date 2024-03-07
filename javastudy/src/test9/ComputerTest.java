package test9;

//1.추상 메서드(abstract method) : 메서드  형태( 선언부, 원형 )만 정의하고 구체적으로 처리할 내용(몸체)은 비워놓은 메서드이다.
//상속을 받은 하위 클래스에서 실제 처리할 내용(몸체)을 구현(override)해야 한다.
//메서드 앞에 abstract 제어자를 붙여 준다.


//2.추상 클래스 (abstract class)
//하위 클래스에서 구현할 메서드의 형태(원형,선언부)만 가진 상위 클래스이다.
//추상 클래스는 상속을 목적으로 하는 클래스이다.
// 추상 메서드(abstract method)를 하나라도 가지고 있는 클래스는 추상 클래스가 된다.
// 클래스 이름 앞에 abstract 제어자를 붙여 주어야 한다.
// 추상 클래스는 객체를 생성하지 못한다.


abstract class Computer{
	
	//추상 메서드 : 메서드 앞에 abstract를 붙여주고 메서드명 뒤에 { 메서드 몸체} 는 붙이지 않는다.
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.!!!");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.!!!");
	}	
	
}

class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display() 추상 메서드 구현 !!!");		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing() 추상 메서드 구현!!!");		
		
	}
	
}

//display() 메서드 1개만 구현하고 아직 구현하지 않은 typing() 메서드가 남아있기 때문에 컴파일이 안된다.
//구현하지 않은 typing() 메서드 :  추상 메서드(abstract method)를 하나라도 가지고 있는 클래스는 추상 클래스가 된다.
//NoteBook 클래스는 abstract를 붙여서 추상 클래스로 만들어 주어야 컴파일이 된다.!!!
abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook display() 추상 메서드 구현 !!!");	
		
	}	
	
}

//NoteBook 클래스에서 구현하지 않은 typing() 메서드를 구현했기 때문에 추상 클래스가 아니다.!!
class MyNoteBook extends NoteBook{

	@Override
	public void typing() {
		System.out.println("MyNoteBook typing() 추상 메서드 구현 !!!");			
	}
	
}

public class ComputerTest {

	public static void main(String[] args) {
		
		//추상 클래스는 객체를 생성할 수 없다.!!
		//Computer c1 = new Computer();
		Computer c2 = new Desktop();
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
		System.out.println("--------------");
		
		//추상 클래스는 객체를 생성할 수 없다.!!
		//Computer c3 = new NoteBook();
		System.out.println("--------------");
		
		Computer c4 = new MyNoteBook();
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();
		

	}

}
