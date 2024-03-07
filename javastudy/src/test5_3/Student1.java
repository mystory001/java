//231204
package test5_3;

public class Student1 {
	
	int studentID;
	private String studentName;
	private int grade;
	public String address;
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getGrade(int grade) {
		return this.grade = grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void show() {
		System.out.println("studentID = " + studentID);
		System.out.println("studentName = " + studentName);
		System.out.println("grade = " + grade);
		System.out.println("address = " + address);
		
}
}
