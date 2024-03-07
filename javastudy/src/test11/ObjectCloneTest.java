package test11;

//Object 클래스의 멤버 메서드 : clone()
//x, y, radius를 멤버 변수로 가지는 Circle 클랫의 인스턴스를 생성하고 clone() 메서드를 사용하는 복제하는 프로그램 작성
//객체 복제하기 위해서는 Object 클래스의 clone() 메서드를 오버라이딩해야 한다.
//-> 이때 데이터의 보호를 위해서 Cloneable 인터페이스를 구현한 클래스의 인스턴스만 복제 할수 있도록 지정해야 한다.!!!
//Cloneable 인터페이스를 선언해도 별도로 구현해야 하는 메서드는 없다. 
//->이렇게 구현할 메서드가 없는 인터페이스를 마커 인터페이스(marker interface)라고 한다.
import java.util.Arrays;

//Cloneable 이라는 interface를 반드시 구현해야 한다.!!!
//Cloneable 이라는 interface를 구현하는 클래스만 객체 복사 기능이 가능하다.!!!
class Circle implements Cloneable {
	
	int x;
	int y;
	int radius;
	
	//생성자
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;		
	}

	
	//toString() 메서드 재정의
	@Override
	public String toString() {
		return  "x=" + this.x + ", y=" + this.y + ", radius=" + this.radius;
	}

	
	//객체 복사시에는 반드시 clone() 메서드 재정의 해주기!!!
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); //Object 클래스(상위 클래스) 의 clone() 메서드 그대로 사용
	}
		
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		//기본형 배열 복사 : 깊은 복사
		int score[] = {10,20,30,40,50}; //원본 배열
		int jumsu[] = score.clone(); //복사할 배열 
		System.out.println("score = " + score);
		System.out.println("jumsu = " + jumsu);
		System.out.println("score = " + Arrays.toString(score));
		System.out.println("jumsu = " +Arrays.toString(jumsu));
		System.out.println("--------------------");
		
		//객체 복사
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println("circle : " + circle);
		System.out.println("copyCircle : " + copyCircle);
		
		
		

	}

}
