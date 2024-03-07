package test5_1;

public class Score_Main {

	public static void main(String[] args) {
		
		//객체(인스턴스) 생성 : 클래스 내의 멤버들을 실제로 Heap 영역에 배치시키는 것
		//기본형 : 자료형 변수명 = 값;
		//ex) int a = 10;
		
		Score s = new Score();
		
		System.out.println("s = " + s);
		System.out.println("이름 = " + s.name);
		System.out.println("국어 = " + s.kor);
		System.out.println("수학 = " + s.math);
		System.out.println("영어 = " + s.eng);
		System.out.println("---------------");
		
		//멤버 변수에 데이터값 넣기
		s.name = "홀붕이";
		s.kor = 20;
		s.math = 80;
		s.eng = 100;
		
		s.show();
		System.out.println(
			"---------------");
		s.sum(70); //매개변수 1개 입력한 합계를 구하는 sum 메서드
		System.out.println("---------------");
		s.sum(30,70); //매개변수 2개 입력한 합계를 구하는 sum 메서드
		System.out.println("---------------");
		s.sum(80,90,100); //매개변수 3개 입력한 합계를 구하는 sum 메서드
		System.out.println("---------------");
			
	}

}
