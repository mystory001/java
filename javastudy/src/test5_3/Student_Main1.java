//231204
package test5_3;

public class Student_Main1 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.show();
		System.out.println("-----------------");
		
		s.studentID = 231204;
		s.address = "철원";
		s.show();
		System.out.println("-----------------");
		
		//getter 호출 및 반환값
		
		System.out.println("s.getStudentName = " + s.getStudentName());
		System.out.println("s.getGrade = " + s.getGrade(0));
		System.out.println("-----------------");
		
		//setter로 데이터값 넣기
		s.setGrade(2);
		s.show();
		System.out.println("-----------------");
		s.setStudentName("궁예");
		s.show();
		System.out.println("-----------------");
		
		
		
		

	}

}
