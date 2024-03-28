package test20;

class Point<T,V>{
	private T x;
	private V y;
	
	//일반 생성자
	public Point(T x, V y){
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public V getY() {
		return y;
	}

	public void setY(V y) {
		this.y = y;
	}
	
}

public class GenericMethod {
	
	//1. 제네릭 메소드 활용(타입 매개변수를 메소드 선언부에 지정)
	//제네릭 메소드 : 제네릭 클래스 일반화 해서 사용하는 형태가 아닌 메소드에 독립적으로 제네릭 유형을 선언하고
	//			 독립적으로 운용 가능한 방법
	//			 타입 매개변수는 매소드 내에서만 유효하게 사용할 수 있음
	//형식)
	//			  <타입 매개변수>			<타입매개변수 형태의 자료형>
	public static <T, V> double makeRectangle(Point<T,V> a) {
		
		double width = ((Number)a.getX()).doubleValue();
		double height =	((Number)a.getY()).doubleValue();
		
		return width * height;
	}
	
	
	public static void main(String[] args) {
		
		//사각형의 넓이
		Point<Integer, Integer> p1 = new Point(7, 23);
		int rec1 = p1.getX()*p1.getY();
		System.out.println(rec1);
		
		System.out.println();
		
		Point<Integer, Double> p2 = new Point(7, 23.2);
		double rec2 = p2.getX() * p2.getY(); //더 큰 쪽으로 타입이 따라가야함
		System.out.println(rec2);
		
		System.out.println();
		
		Point<Double, Double> p3 = new Point(7.7, 23.2);
		double rec3 = p3.getX() * p3.getY(); //더 큰 쪽으로 타입이 따라가야함
		System.out.println(rec3);
		
		System.out.println();
		
		Point<Double, Double> p4 = new Point(7.7, 7.7);
		double rec4 = GenericMethod.makeRectangle(p4);
		System.out.println(rec4);
		
		System.out.println();
		
		Point<Double, Integer>p5 = new Point(23.4,71);
		double rec5 = GenericMethod.makeRectangle(p5);
		System.out.println(rec5);
		
		System.out.println();
		
		Point<Double, Integer>p6 = new Point(10.1,23);
		double rec6 = makeRectangle(p6);
		System.out.println(rec6);
	}
	
}
