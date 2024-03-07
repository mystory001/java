package test10_4;

public interface Calc {
	
	
	//1. default 메서드 : 인터페이스가 기본으로 제공해주는 메서드이다.
	//인터페이스내에 메서드 선언시에 앞쪽에 default 지정 -> 인터페이스내에서 몸체를 구현해놓은 메서드이다.
	//구현하는 클래스에서 기본으로 사용할 수 있는 메서드가 된다.
	public default void description() {
		System.out.println("정수 계산기를 구현합니다.!!!");
		this.myMethod();
	}	

	
	
	//2.정적 메서드(static 메서드) 
	public static int total(int[] arr) {
		int total = 0;
		
		for( int i : arr) {
			total += i;
		}
		 myStaticMethod();
		 return total;
	}
	
	//private 메서드 : 기존의 구현된 코드를 변경하지 않고 인터페이스를 구현한 클래스에서 공통으로 사용한다.
	//클라이언트 프로그램에 제공한 기본 기능을 private 메서드로 구현하기도 한다.
	private void myMethod() {
		System.out.println("private 메서드입니다.!!!");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.!!!");	
	}

}