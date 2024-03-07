package test6_3;

//클래스 변수(static variable)
//1.인스턴스  생성(객체생성)과 상관없이 먼저 변수가 만들어지고 데이터값이 초기화되어 있다. 
//2.초기화되어 있는 클래스(static) 변수는 생성되는 모든 객체(인스턴스)에서 공유해서 사용된다.
//-> 생성되는 객체내에 static으로 지정된 멤버 변수의 값을 똑같이 적용하기 위해서이다.
//3.클래스를 설계할때 멤버변수에 데이터값을 먼저 초기화시켜 놓기 때문에 클래스에 기반한 변수라고해서 클래스 변수라고 한다.
//4.static변수나 객체에서 값이 수정되면 다른 객체들에서도 따라 변경된다.

public class Student {
	
	public int studentID;
	public String studentName;
	public static  int grade = 3; //정적변수 , static변수, 클래스 변수
	public String address;
	
	public  void show() {
		System.out.println("studentID = " + studentID);
		System.out.println("studentName = " + studentName);
		System.out.println("grade = " + grade);
		System.out.println("address = " + address);
		
	}	

}