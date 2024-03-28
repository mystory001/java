package test16;

//인터페이스 구현
interface Animal{
	
	//인터페이스 내에 구현할 추상 메소드만 정의
	abstract void what();
}

/*
//인터페이스는 구현 클래스가 반드시 만들어져 있어야함
class Ani implements Animal{

	@Override
	public void what() {
		
		System.out.println("Animal 인터페이스의 what() 메소드를 구현해서 호출");
		
	}
}
*/

//추상 클래스 구현
abstract class AnimalClass{
	//추상 메소드를 한 개라도 가지고 있는 클래스는 추상 클래스가 됨
	abstract void what1(); 
}

public class InnerTest6 {

	public static void main(String[] args) {
		
		/*
		//인터페이스를 구현한 클래스 객체로 생성해서 메소드 오버라이딩 사용
		Ani a = new Ani();
		a.what();
		
		//인터페이스 변수 = 구현 클래스의 객체를 생성해서 대입
		//인터페이스에 정의된 추상 메소드와 동일한 메소드를 구현한 클래스로 객체를 생성해서 오보라이드 (구현)된 메소드 호출해서 사용
		Animal a1 = new Ani();
		a1.what();
		*/
		
		//인터페이스와 추상 클래스는 객체를 생성할 수 없음
		//인터페이스로 객체를 생성
		//익명 클래스 => 익명 구현 객체
		Animal animal = new Animal() {

			@Override
			public void what() {
				
				System.out.println("Animal 인터페이스 what() 메소드를 구현하여 호출");
				System.out.println("Animal 인터페이스 구현");
				System.out.println("dog");
				
			}
		};
		
		animal.what();
		
		System.out.println("============================");
		
		//추상 클래스는 객체를 생성할 수 없음
		//익명 클래스는 익명 구현 객체
		//추상 클래스로 객체를 생성
		AnimalClass ac = new AnimalClass() {
			
			@Override
			void what1() {
				
				System.out.println("AnimalClass 추상 클래스 what1() 메소드를 구현하여 호출");
				System.out.println("AnimalClass 추상 클래스 구현");
				System.out.println("cat");
				
			}
		};
		
		ac.what1();
		
	}

}
