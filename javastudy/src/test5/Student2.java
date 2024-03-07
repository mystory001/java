package test5;
//설계도만 있는 클래스
//main 함수를 포함한 실행 클래스를 따로 작성한 클래스
public class Student2 {

	int studentID; 
	String studentName; 
	int grade; 
	String address; 
	
	void show() {
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
	}
	

	public String getStudentName() {
		return studentName;
	}
	
	//main 함수가 없음. 객체 생성할 수 없음.
}
