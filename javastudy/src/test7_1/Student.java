package test7_1;

public class Student {
	
	private static int serialNum = 1000;
	public int studentID;
	public String name;
	
	//기본 생성자
	public Student() { 
		serialNum++;
		this.studentID = serialNum;
	}
	
	
	//일반 생성자
	public Student(int studentID, String name){
		this.studentID = studentID;
		this.name = name;
	}
	
	void showStudentInfo() {
		System.out.println(this.studentID + " , " + this.name);
	}

}
