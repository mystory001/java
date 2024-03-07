package test5;

//고객관리를 위한 클래스 : 고객 관리를 위한 기능 만들기
public class Person {

	//멤버 변수(속성, 특징)
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + gender);
		System.out.println("결혼여부 : " + married);
	}
	
	
	public static void main(String[] args) {
		//객체 생성(인스턴스 생성) : 클래스 내의 맴버 변수의 맴버 메서드를 Heap영역에 비어 있는 메모리 공간에 배치 시켜 사용할 수 있도록 함.
		
		
		Person per = new Person();
		
		per.name = "홍길동";
		per.height = 199;
		per.weight = 100.9;
		per.gender = '남';
		per.married = false;
		
		per.show();

	}

}
