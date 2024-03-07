package test5;

//학생 관리를 위해서 만들어 놓은 클래스 : 설계도를 만든다.
//컴퓨터 내부에서 아무런 동작을 할 수 없다.
public class Student {

	//클래스 내의 변수는 속성, 특징이라고 함.
	int studentID; //학번을 담아두는 멤버 변수
	String studentName; //학생이름을 담아두는 멤버 변수
	int grade; //학년을 담아두는 멤버 변수
	String address; //주소를 담아두는 멤버 변수
	//클래스 내의 함수(메서드)는 동작을 하기 위해 만듦.
	
	//출력하는 함수 만들기
	//public static을 넣었을 때 오류가 난다. 클래스이기 때문에 안붙여도 됨.
	void show() {
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
	}
	
	
	public static void main(String[] args) {
	
		//객체 생성(인스턴스 생성) : 클래스 설계대로 메모리 공간에 배치시켜 사용
		
		//Student st;
		//st = new Student();
		// ==
		Student st = new Student();
		
		st.studentID = 20231123;
		st.studentName = "홍길동";
		st.grade = 3;
		st.address = "부산시 부산진구 동천로 19";
		
		/*
		System.out.println("학번 : " + st.studentID);
		System.out.println("이름 : " + st.studentName);
		System.out.println("학년 : " + st.grade);
		System.out.println("주소 : " + st.address);
		*/
		
		st.show();
	}

}
