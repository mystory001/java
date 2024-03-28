package test19;

//일반 클래스 형태 : 클래스를 만들 때 멤버들의 자료형이 지정됨
class Normal1{ //문자열 배열만 사용 가능
	private String[] str;

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	
	public void show() {
		for(String s : str) {
			System.out.println(s);
		}
	}
	
}
class Normal2{ //정수형 배열만 사용 가능
	private Integer[] num;

	public Integer[] getNum() {
		return num;
	}

	public void setNum(Integer[] num) {
		this.num = num;
	}
	
	public void show() {
		for(Integer n : num) {
			System.out.println(n);
		}
	}
	
}

class Normal3{//Object형 배열 사용 가능(모든 자료형 사용 가능)
	private Object[] obj;
	
	public Object[] getObj() {
		return obj;
	}

	public void setObj(Object[] obj) {
		this.obj = obj;
	}

	public void show() {
		for(Object obj : obj) {
			System.out.println(obj);
		}
	}
	
}

class GenericClass<T>{
	T[] t;
	
	public T[] getT() {
		return t;
	}

	public void setT(T[] t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return t.getClass().getName() +" "+ t;
	}
	
	public void show() {
		for(T obj : t) {
			System.out.println(obj);
		}
	
	}
}

public class Generic3 {

	public static void main(String[] args) {
		
		//제네릭 클래스로 객체 생성
		GenericClass<String> gcStr = new GenericClass();
		//String 타입 매개 변수 T : String[] 객체 전달
		String[] s1 = {"A","B","C"};
		gcStr.setT(s1);
		gcStr.show();
		//하나씩 꺼내오기
		System.out.println("하나씩 꺼내오기");
		for(String str : gcStr.getT()) {
			System.out.println(str);
		}
		
		System.out.println();
		
		
		GenericClass<Integer> gcInt = new GenericClass();
		//Integer 타입 매개 변수 T : Integer[] 객체 전달
		Integer[] s2 = {1,2,3,4};
		gcInt.setT(s2);
		gcInt.show();
		System.out.println("하나씩 꺼내오기");
		for(Integer integer : gcInt.getT()) {
			System.out.println(integer);
		}
		
		//객체 내 요소값을 꺼내올 때 String, Integer 등 자료형만 지정해두기 때문에 형 변환이 필요없음.
		
	}

}
