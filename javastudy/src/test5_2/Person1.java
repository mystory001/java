package test5_2;

public class Person1 {

	String name;
	float height;
	float weight;
	
	//클래스 내에 생성자가 1개라도 정의되어 있으면 기본 생성자는 컴파일러가 자동으로 추가해주지 않음
	//정의된 생성자 형식에 맞추어서만 객체가 생성됨. 즉 클래스 내의 생성자가 작성되어 있는지 확인하고 객체(인스턴스)를 생성함
	
	//기본 생성자(default construct) : 매개변수가 없는 생성자
	Person1(){}
	
	
	//(일반) 생성자 : 매개변수가 있는 생성자
	//반드시 데이터값을 멤버 변수에 넣어줘야만 객체가 생성되는 강제성이 있음
	//예시1)멤버 변수 중에서 name 변수에 지정한 데이터값을 넣어주지 않으면 객체(인스턴스)를 생성하지 않음.
	Person1(String pname){
		name = pname;
	}
	
	//예시2) 멤버 변수 중에서 name,height 변수에 지정한 데이터값을 넣어주지 않으면 객체(인스턴스)를 생성하지 않음.
	Person1(String pname, float pheight){
		name = pname;
		height = pheight;
	}
	
	//예시3) 멤버 변수 모두 지정한 데이터값을 넣어주지 않으면 객체(인스턴스)를 생성하지 않음
	Person1(String pname, float pheight, float pweight){
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
	}
	
}
