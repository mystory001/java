//231130
package test5_2;

public class Student_Main {

	public static void main(String[] args) {
		
		//기본생성자 호출해서 객체 생성
		Student s = new Student();
		s.show();
		System.out.println("-------------");
		
		//일반생성자 호출해서 객체 생성 
		Student s1 = new Student(1, "동명왕", 3, "고구려");
		s1.show();
		System.out.println("-------------");
		
		
	}

}
