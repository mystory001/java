package test6_3;

public class StudentMain {

	public static void main(String[] args) {
		
		//클래스 변수(static variable)
		//객체를 생성하지 않고도 사용이 가능
		//접근방법 : 클래스명.변수명
		System.out.println("클래스 변수 출력 : " + Student.grade);
		System.out.println("------------------");
		
		Student st = new Student(); //기본 생성자
		st.show();
		System.out.println("------------------");
		
		st.studentName = "자바";
		System.out.println(st.grade);
		st.show();
		System.out.println("------------------");
		
		Student st1 = new Student(); //두 번째 객체 생성
		st1.studentName = "자바스크립트";
		System.out.println(st1.grade);
		st1.show();
		System.out.println("------------------");
		
		/*
		 * 클래스 변수
		 * 인스턴스 생성(객체 생성)과 상관없이 먼저 변수가 먼저 생성되고 데이터 값이 초기화되어 있음
		 * 초기화되어 있는 클래스(static) 변수를 생성되는 모든 객체(인스턴스)에서 공유하여 사용됨
		 * → 생성되는 객체 내에 static으로 지정된 멤버 변수의 값을 똑같이 적용하기 위해서
		 * 클래스를 설계할 때 멤버 변수에 데이터 값을 먼저 초기화시켜 놓기 때문에 클래스에 기반한 변수라고해서 클래스 변수라고함
		 */
		
		/*
		 * System.out.println("클래스 변수 출력 : " + Student.grade); /  System.out.println(st.grade);
		 * 둘 중 왼쪽 것을 사용해야함.
		 */
		
		
	}

}
