package test6_3;

public class StudentTest2 {

	public static void main(String[] args) {
		//클래스 변수 : 객체 생성없이 static 멤버 변수에 접근
		//형식) 클래스명.변수명
		//public static int serialNum = 1000; 에 접근
		System.out.println(Student1.serialNum);
		System.out.println(" -------------------");
		
		//객체 생성 : public Student1() 생성자 호출
		Student1 studentLee = new Student1();
		
		//studentName 멤버변수에 이름을 넣어주는 경우
		//setter 함수를 호출해서 넣어주기
		//public void setStudentName(String studentName) 함수 호출해서 이름 넣기
		//setStudentName("이지원");
		studentLee.studentName = "이지원";
		
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentID);
		System.out.println(studentLee.studentName + " 학번 = " + studentLee.studentID);
		
		System.out.println(" ------- 2번째 객체 만들기 ------- ");
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentID);
		System.out.println(studentSon.studentName + " 학번 = " + studentSon.studentID);
		
		System.out.println(" ------- 3번째 객체 만들기 ------- ");
		Student1 studentJo  = new Student1();
		studentJo.setStudentName("조영현");
		
		System.out.println(studentJo.serialNum);
		System.out.println(studentJo.studentID);
		System.out.println(studentJo.studentName + " 학번 = " + studentJo.studentID);
		
		System.out.println(" ------- 4번째 객체 만들기 ------- ");
		Student1 s1  = new Student1();
		s1.studentName = "김자바";
		
		
		//static 변수에 접근 : 클래스명.변수명
		//                            자신의객체명.변수명
		System.out.println(s1.serialNum);
		System.out.println(Student1.serialNum);
		
		System.out.println(s1.studentID);
		System.out.println(s1.studentName + " 학번 = " + s1.studentID);

	}

}
