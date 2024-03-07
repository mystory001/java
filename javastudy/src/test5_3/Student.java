//231204
package test5_3;
//정보 은닉 → 멤버 변수 앞에 접근 제어자를 붙여서 새로운 데이터값을 대입하거나 그러지 못하도록 함
public class Student {
	//public과 private 구분
	int studentID;//default : 아무런 접근 제어자를 지정하지 않은 경우, 동일한 패키지 내에서만 접근 가능
	private String studentName;//private : 자신의 클래스 내에서만 접근 가능
	public int grade;//public : 외부 클래스 어느 곳에서나 접근 제한이 없음
	public String address;
	
	//생성자를 하나라도 만들지 않으면 컴파일러가 기본생성자(default construct)형식으로 생성 및 추가하여 
	//멤버 변수의 자료형이 가지고 있는 기본값으로 멤버 변수에 데이터값을 초기화시킴
	public Student() {}
	
	//private로 선언한 studentName 변수를 외부에서 사용
	//필요 시 멤버 변수에 데이터값을 넣어야하는 경우가 필요할 때가 있음
	//setter(설정자), getter(접근자) 메서드 사용
	
	//getter 메서드 : 멤버 변수에 저장된 데이터값을 가져오는 역할
	public String getStudentName() {
		return this.studentName;//호출하는 곳으로 반환값(결과값)을 반환
	}
	
	//setter 메서드 : 멤버 변수에 새로운 데이터 값을 저장하는 역할
	public void setStudentName(String studentName) {
		//멤버변수 = 매개변수;
		this.studentName = studentName;
	}
	
	
	//멤버 변수 내의 데이터값을 출력해주는 일반 메서드
	public void show() {
		System.out.println("studentID = " + studentID);
		System.out.println("studentName = " + studentName);
		System.out.println("grade = " + grade);
		System.out.println("address = " + address);
	}
	

}
