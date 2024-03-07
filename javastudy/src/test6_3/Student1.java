package test6_3;

public class Student1 {
	
	//학번을 1000번부터 시작하기 위한 초기값 static변수 지정
	public static int serialNum = 1000;
	
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++; //학생이 생성될때마다 증가(객체가 생성될때마다 증가)
		studentID = serialNum;
	}
	
	//setter, getter 메서드
	public String getStudentName() {
		return studentName;
	}
	
    //                                                 "이지원"
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
