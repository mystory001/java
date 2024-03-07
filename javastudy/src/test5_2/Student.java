//231130
package test5_2;

//정보 은닉 : 멤버 변수에 새로운 데이터값을 넣지 못하도록 함. 이때 사용하는 것이 접근 제어자
//접근제어자에는 public, protected, private, 아무것도 없는 경우
//public : 외부 클래스 어디에서나 접근할 수 있음. 접근 제한이 없음.
//protected : 동일한 패키지 내에 존재하거나 상속관계의 하위 클래스에서만 접근이 가능
//아무것도 없는 경우(default) : 같은 패키지 내부에서만 접근 가능
//private : 같은 클래스 내부에서만 접근 가능


//this 키워드 : 객체 자신에 대한 참조로써 메서드 안에 사용. 자기 자신의 메모리 주소를 나타냄
//클래스의 멤버변수의 메서드 안에서만 사용되는 매개변수의 이름이 같은 경우 구분을 명확하기 위해서 사용됨. 
//this 키워드를 통해 클래스 내의 멤버에 접근할 수 있음.

public class Student {
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	//기본 생성자
	public Student(){}
	
	//일반 생성자
	//멤버 변수 4개의 데이터값을 입력하지 않으면 객체를 생성하지 않음
	/*
	Student(int sstudentID, String sstudentName, int sgrade, String saddress){
		studentID = sstudentID;
		studentName = sstudentName;
		grade = sgrade;
		address = saddress;
	}
	*/
	/*
	//멤버변수와 매개변수 이름을 같게 하는데, 매개변수는 아무렇게나 작성해도 됨.
	Student(int ID, String Name, int gr, String addr){
		//멤버변수   =   매개변수(메서드 내에서만 사용되고 사라지는 변수)
		studentID = ID;
		studentName = Name;
		grade = gr;
		address = addr;
	}
	*/
	/*
	public Student(int studentID, String studentName, int grade, String address) {
		//멤버변수 = 매개변수
		//똑같은 변수명이 2개. 변수명이 같을 수는 없음. 구분이 필요 this를 사용함
		//this는 자기자신. 맴버변수에 붙힘.
		studentID = studentID;
		studentName = studentName; 
		grade = grade;
		address = address;
	}
	*/
	
	public Student(int studentID, String studentName, int grade, String address) {
		//this가 지정된 변수는 클래스 내에서 사용되는 멤버 변수라고 표현함
		this.studentID = studentID;
		this.studentName = studentName; 
		this.grade = grade;
		this.address = address;
	}
	
	/*
	//다르다
	public Student(int studentID, String studentName, int grade, String address) {
		studentID = this.studentID;
		studentName = this.studentName; 
		grade = this.grade;
		address = this.address;
	}
	*/
	
	
	
	public void show() {
		System.out.println("studentID : " + studentID);
		System.out.println("studentName : " + studentName);
		System.out.println("grade : " + grade);
		System.out.println("address : " + address);
		
	}
	
	
}
