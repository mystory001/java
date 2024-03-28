package test19;

//제네릭 클래스(E => 요소값 지정)
class Gen1<E>{//제네릭 클래스
	
	private E element; //제네릭 타입 변수

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return element.getClass().getName() +" "+ element;
	}
}


public class Generic1 {
	
	public static void main(String[] args) {
	
		//Wrapper class : 기본 자료형을 객체형으로 변환하고 처리하는 클래스

		Byte type1 = 127;
		Short type2 = 255;
		Integer type3 = 1000;
		Long type4 = 10000L;
		
		Float type5 = 0.01F;
		Double type6 = 0.0000001;
		
		Boolean type7 = true;
		Character type8 = 'A';
		
		//객체 출력
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		System.out.println(type5);
		System.out.println(type6);
		System.out.println(type7);
		System.out.println(type8);
		
		System.out.println();
		
		//객체의 클래스 출력
		System.out.println(type1.getClass().getName());
		System.out.println(type2.getClass().getName());
		System.out.println(type3.getClass().getName());
		System.out.println(type4.getClass().getName());
		System.out.println(type5.getClass().getName());
		System.out.println(type6.getClass().getName());
		System.out.println(type7.getClass().getName());
		System.out.println(type8.getClass().getName());
		
		System.out.println();
		
		//제네릭 클래스 객체 생성
		//제네릭 클래스 객체 생성 시 < > 안에 생성할 객체 타입을 매개변수로 넘겨줌
		//타입(자료형) 매개 변수 E로 지정해서 객체 생성하는 예제
		Gen1<String> a = new Gen1();
		//a 객체는 String형(객체) 이외의 다른 자료형은 대입할 수 없음
		a.setElement("제네릭");
		System.out.println(a.getElement()); 
		System.out.println(a.toString());
//		a.setElement(10); //지정해둔 데이터형만 들어갈 수 있음
		
		System.out.println();
		
		Gen1<Integer> b = new Gen1();
		b.setElement(10);
		System.out.println(b.getElement());
		System.out.println(b.toString());
		
		System.out.println();
		
		Gen1<Double> c = new Gen1();
		c.setElement(3.14);
		System.out.println(c.getElement());
		System.out.println(c.toString());
		
		
		
		
	}
}
