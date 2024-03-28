package test19;

//제네릭 클래스(T => 타입)
class Gen2<T>{
	
	private T type;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type.getClass().getName() + " " + type;
	}
}

public class Generic2 {

	public static void main(String[] args) {
		//Gen2 제네릭 클래스 객체 생성
		//타입(자료형) 매개 변수 T로 지정해서 객체 생성하는 예제
		Gen2<String> a = new Gen2();
		a.setType("제네릭");
		System.out.println(a.getType());
		System.out.println(a.toString());
		System.out.println(a);
		
		//제네릭 형태가 아닌 일반 객체 생성 형태 : Object형으로 자동 인식
		//Object형 : 모든 자료형이 올 수 있음
		Gen2 b = new Gen2();
		b.setType(100);
		System.out.println(b.toString());
		b.setType('A');
		System.out.println(b.toString());
		b.setType(3.14);
		System.out.println(b.toString());
		
		System.out.println();
		
		Gen2<Object> obj = new Gen2();
		obj.setType('A');
		System.out.println(obj.toString());
		obj.setType("Object형");
		System.out.println(obj.toString());
		obj.setType(100);
		System.out.println(obj.toString());
		obj.setType(3.14);
		System.out.println(obj.toString());
		
		System.out.println();
		System.out.println((int)'가');
		
		//객체형 형 변환을 했을 경우 컴파일 오류가 발생함
		obj.setType('A');
//		System.out.println((Integer)obj.toString());
		


	}

}
