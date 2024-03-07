//231204
package test5_3;

public class Student2 {
	
	public int studentID;
	private String studentName;
	public int grade;
	public String address;
	
	//기본생성자
	public Student2() {}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void show() {
		System.out.println("studentID = " + studentID);
		System.out.println("studentName = " + studentName);
		System.out.println("grade = " + grade);
		System.out.println("address = " + address);
	}

	
}
