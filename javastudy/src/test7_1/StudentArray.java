package test7_1;

public class StudentArray {

	public static void main(String[] args) {
		
		//객체 배열 생성
		Student [] stu = new Student[3];
		
		stu[0] = new Student(1001,"James");
		stu[1] = new Student(1002,"Tomas");
		stu[2] = new Student(1003,"Edward");
		
		for (int i = 0 ; i < stu.length ; i++) {
			System.out.print("stu[" + i + "]= ");
			System.out.println(stu[i]);
			stu[i].showStudentInfo();
		}
		System.out.println("-------------");
		
		//객체 배열내의 요소값을 찾아가서 멤버 변수값 수정
		stu[0].name = "박제현";
		stu[1].name = "박재환";
		stu[2].name = "박재욱";
		
		
		for (int i = 0 ; i < stu.length ; i++) {
			System.out.print("stu[" + i + "]= ");
			System.out.println(stu[i]);
			stu[i].showStudentInfo();
		}
		System.out.println("-------------");
		
		//for문 내에서 기본 생성자로 객체 배열 생성
		for (int i = 0 ; i < stu.length ; i++) {
			//기본 생성자 호출해서 객체 생성하고 배열 요소값에 객체 주소 넣어주기
			stu[i] = new Student();
			System.out.print("stu[" + i + "]= ");
			System.out.println(stu[i]);
			stu[i].showStudentInfo();
		}
		System.out.println("-------------");
		
		
		
	}

}
