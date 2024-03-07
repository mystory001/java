package test6_4;

public class Student4 {
	private static int serialNum = 1000; //static 멤버
	public int studentID; //인스턴스 멤버 변수
	public String studentName; //인스턴스 멤버 변수
	public int grade; //인스턴스 멤버 변수
	public String address; //인스턴스 멤버 변수
	
	//기본 생성자
	public Student4() {
		serialNum++; //학생이 생성될때마다 증가(객체가 생성될때마다 증가)
		studentID = serialNum;
	}

	//학번 기준값 : 1000 getter, setter
	//static 메서드는 인스턴스 멤버변수studentName는 아직 생성되지 않아서 접근 불가능하다.!!
	public static int getSerialNum() {
		//studentName = "이지원"; //접근 오류(인스턴스 멤버 변수로 접근 안됨)
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student4.serialNum = serialNum;
	}
}
