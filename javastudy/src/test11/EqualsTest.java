package test11;
//Object 클래스의 equals() : public boolean equals(Object obj)
//자신의 객체와 매개변수값으로 넘어온 객체를 비교하여 객체의 내용이 같은지를 비교하는 메서드이다.
//-> 객체의 내용이 같더라도 heap영역에 생성되는 객체의 주소가 다르면 주소와 내용이 모두 다르다고 판단한다.
//형식) 객체1 == 객체2 : heap영역에 생성되는 객체의 주소가 동일한가?
//형식) 객체1.equals(객체2) : 객체의 내용이 동일한가? -> 오버라이드 시켜서 맞추어 주어야 한다.!!!

class Student{
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	/*
	//tostring() 메서드 재정의
	//객체 정보를 문자열로 반환하는 메서드 재정의 (생성된 객체 주소 표시 -> 멤버 변수내의 값으로 표시)
	@Override
	public String toString() {
		return this.studentId + " , " + this.studentName;
	}
	 */
	
	
	//equals() 메서드 재정의
	/*
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			return true;
		}
		else {
			return false;
		}
		
	}
	*/
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			
			Student std = (Student)obj;
			
			if (this.studentId == std.studentId)  return true;
			else return false;
		}
		return false;
	}
	
	
	//해시코드(hashcode) 메서드 재정의
	@Override
	public int hashCode() {		
		return studentId;
	}
	
	
}


public class EqualsTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(100, "이상원");
		Student s2 = s1; //주소 복사 (얕은 복사)
		Student s3 = new Student(100, "이상원");
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("-------------------");
		
		System.out.println("주소 : s1 == s2 :" + (s1 == s2));
		System.out.println("내용 : s1.equals(s2) : " + s1.equals(s2));
		System.out.println("-------------------");
		
		System.out.println("주소 : s1 == s3 :" + (s1 == s3));
		System.out.println("내용 : s1.equals(s3) : " + s1.equals(s3));
		System.out.println("-------------------");
		
		
		if (s1 == s2) { //비교연산자 (==)
			System.out.println("s1 객체와 s2의 주소는 같음!!");
		}
		else {
			System.out.println("s1 객체와 s2의 주소는 다름!!");
		}
		
		if (s1.equals(s2)) { //equals() 메서드 
			System.out.println("s1 객체와 s2의 내용은 같음!!");
		}
		else {
			System.out.println("s1 객체와 s2의 내용은 다름!!");
		}
		System.out.println("-------------------");
		
		
		if (s1 == s3) { //비교연산자 (==)
			System.out.println("s1 객체와 s3의 주소는 같음!!");
		}
		else {
			System.out.println("s1 객체와 s3의 주소는 다름!!");
		}
		
		if (s1.equals(s3)) { //equals() 메서드 
			System.out.println("s1 객체와 s3의 내용은 같음!!");
		}
		else {
			System.out.println("s1 객체와 s3의 내용은 다름!!");
		}
		
		System.out.println("----해시 코드 (hashcode) ---");
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("-------------------");
		
		//객체의 주소 알아내기
		//1.Object 클래스의 hashcode() ;
		//형식)객체명.hashcode()
		System.out.println("s1의 hashcode = " + s1.hashCode());
		System.out.println("s2의 hashcode = " + s2.hashCode());
		System.out.println("s3의 hashcode = " + s3.hashCode());
		System.out.println("-------------------");
		
		//2.System 클래스의 identityHashCode() ;
		//형식)System.identityHashCode(객체명);
		System.out.println("s1의 실제 주소값 = " + System.identityHashCode(s1));
		System.out.println("s2의 실제 주소값 = " + System.identityHashCode(s2));
		System.out.println("s3의 실제 주소값 = " + System.identityHashCode(s3));
		System.out.println("-------------------");
		
		//3.생성된 객체의 실제 메모리 주소를 16진수로 표현은 Integer.toHexString();
		//형식) Integer.toHexString(Integer.toHexString(System.identityHashCode(객체명));
		System.out.println("s1의 실제 주소값(16진수로 표현) = " + Integer.toHexString(System.identityHashCode(s1)));
		System.out.println("s2의 실제 주소값(16진수로 표현) = " + Integer.toHexString(System.identityHashCode(s2)));
		System.out.println("s3의 실제 주소값 (16진수로 표현)= " + Integer.toHexString(System.identityHashCode(s3)));
		System.out.println("-------------------");
		
	}

}
