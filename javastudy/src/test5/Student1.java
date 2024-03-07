package test5;

public class Student1 {

	int studentID; //학번을 담아두는 멤버 변수
	String studentName; //학생이름을 담아두는 멤버 션수
	int grade; //학년을 담아두는 변수
	String address; //주소를 담아두는 변수
	
	void show() {
		//					변수명만 써준다.
		//4개의 멤버 변수에 저장되어 있는 데이터값을 출력하는 메서드
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
	}
	
	
	//매개변수값이 없고, 반환값이 있는 경우
	//맴버 변수에 이름이 저장되어 있는 데이터값 출력
	public String getStudentName() {
		return studentName; //멤버 변수 이름에 저장되어 있는 값만 호출한 곳으로 반환
	}
		
	
	public static void main(String[] args) {
		//기본 : 자료형 변수명 = 값;
		int a = 10;
		
		//객체 생성(인스턴스 생성)
		//자료형 참조(변수명) or 객체형 = new 자료형();
		//new? heap 영역에 배치시키고 stack 영역의 변수에 찾아갈 주소를 담아줌
		Student1 st = new Student1();
		//Student1 st; st= new Student1();
		
		System.out.println(a);
		System.out.println(st);//참조변수명(객체형)에는 주소가 들어있음
		
		System.out.println(st.studentID);
		System.out.println(st.studentName);
		System.out.println(st.grade);
		System.out.println(st.address);
		System.out.println("-------------");
		
		//멤버 변수에 데이터값 넣기
		st.studentID = 231127;
		st.studentName = "홍길동";
		st.grade = 1;
		st.address = "서울특별시";

		System.out.println(st.studentID);
		System.out.println(st.studentName);
		System.out.println(st.grade);
		System.out.println(st.address);
		System.out.println("-------------");
		
		st.show();
		System.out.println("-------------");
		
		st.getStudentName();//함수 호출과 결과값을 가지고 있음.
		String name = st.getStudentName();
		System.out.println(st.getStudentName());
		System.out.println("-------------");
		
		st.studentName = "자바";
		System.out.println(st.studentName);//멤버 변수명으로 출력
		System.out.println(st.getStudentName());//만들어 놓은 메서드 결과값 출력
		
		/*
		Student1 studentAhn = new Student1();
		studentAhn.studentName="안연수";
		*/
		


	}

}
