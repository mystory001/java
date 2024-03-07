//231211
package test6_4;

public class Student3 {
	private static int serialNum = 1;
	private String studentName;
	public int grade;
	public String address;
	int studentID;

	public Student3() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
}
