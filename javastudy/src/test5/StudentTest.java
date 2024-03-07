package test5;
//수행만 하는 클래스
//설계만 해놓은 클래스
public class StudentTest {

	public static void main(String[] args) {
		// 클래스형 변수이름 = new 생성자;
		Student2 st = new Student2();
		
		System.out.println(st);
		System.out.println("------------");
		st.show();
		System.out.println("------------");		
		st.studentName = "자바";
		System.out.println("이름 : " + st.studentName);
		
		st.getStudentName(); //호출+결과값을 가지고 있음
		System.out.println("이름 : " + st.getStudentName());
		
		System.out.println("------------");
		Student2 st1 = new Student2();
		System.out.println("st1 : " + st1);
		System.out.println("------------");
		st1.show();
		System.out.println("------------");
		st1.studentName = "두번째";
		System.out.println("이름 : " + st1.studentName);
		st1.getStudentName();
		System.out.println("이름 : " + st1.getStudentName());
		
		
		
	}

}
