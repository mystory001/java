//231204
package test5_3;

public class Student_Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		System.out.println("------------------");

		s.studentID = 231204;
		//studentName은 나타나지 않음. Student class에서 접근 제어자 private로 설정해두었기 떄문이다.
		//즉 private 접근 제어자로 멤버 변수에 새로운 데이터값을 대입하지 못함.
		//s.studentName = "고주몽";
		//private로 선언한 studentName 변수를 외부 코드에서 사용하려면 get(), set() 메서드를 사용해야한다.		
		s.grade = 3;
		s.address = "고구려";
	
		s.show();
		System.out.println("------------------");
		//System.out.println(s.StudentName());//오류 발생
		//getter로 데이터값 확인
		System.out.println("s.getStudentName() = " + s.getStudentName());//null 출력
		System.out.println("------------------");
		//setter로 데이터값 넣기
		s.setStudentName("고주몽");
		s.show();
		
		
		
		
		
		
	}

}
