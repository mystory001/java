//231130
package test5_2;

public class Person2 {
	
	String name;
	float height;
	float weight;
	//1 기본생성자 : 매개변수 없는 생성자
	Person2(){};
	
	//2 일반생성자 : 매개변수가 있는 생성자(이름을 입력 받아야만 객체를 생성해주는 일반 생성자)
	Person2(String pname){
		name = pname;
	}
	
	//3 일반생성자 : 매개변수가 있는 생성자(이름,신장을 입력 받아야만 객체를 생성해주는 일반 생성자)
	Person2(String pname, float pheight){
		name = pname;
		height = pheight;
	}
	
	//4 일반생성자 : 매개변수가 있는 생성자(이름,신장,체중을 입력 받아야만 객체를 생성해주는 일반 생성자)
	Person2(String pname, float pheight, float pweight){
		name=pname;
		height=pheight;
		weight=pweight;
	}
	
	void show() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		
		
	}

}
