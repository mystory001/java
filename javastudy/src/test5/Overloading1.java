package test5;


//메서드 오버로딩 : 메서드 중복
//메서드의 이름은 같고 매개변수의 자료형이나 개수가 다른 여러 개의 함수를 작성해 놓고 사용할 수 있음.
public class Overloading1 {
	//a
	public static int sum(int a, int b) {
		System.out.println("인자가 2개일 경우");
		return a + b;
	}
	
	//b : 매개변수 개수가 다른 경우
	public static int sum(int a, int b, int c) {
		System.out.println("인자가 3개일 경우");
		return a + b + c;
	}
	
	//c : 자료형이 다른 경우
	public static double sum(double a, double b, double c) {
		System.out.println("인자가 3개이고 자료형이 다른 경우");
		return a + b + c;
	}
	
	
	
	public static void main(String[] args) {
	
		//a
		System.out.println("sum(10,5)=" + sum(10,5));
		
		//b
		System.out.println("sum(10,5,1)=" + sum(10,5,1));
		
		//c
		System.out.println("sum(10.5,5.5,1.5)=" + sum(10.5,5.5,1.5));
		System.out.println("-----------------");
		System.out.println(1);
		System.out.println("오버로딩 : 메서드 출력");
		System.out.println('a');
	}

}
