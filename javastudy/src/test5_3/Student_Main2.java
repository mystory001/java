//231204
package test5_3;

public class Student_Main2 {

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.show();
		System.out.println("--------------------");
		s.studentID = 231204;
		s.grade = 2;
		s.address = "한양";
		s.show();
		System.out.println("--------------------");
		s.setStudentName("이성계");
		s.show();
		System.out.println("--------------------");
		

	}

}
