package test5_1;
//설계만 해놓은 클래스
//메서드 오버로드(method overload) : 메서드 중복. 
//메서드의 이름은 같고 매개변수의 자료형의 개수나 다른 여러 개의 함수를 작성해 놓고 사용할 수 있음.
public class Score {

	String name; //이름
	int kor, math, eng; //점수
	
	//국어 점수만 출력하는 메서드 만들기
	void sum(int kor) {
		System.out.println("국어 점수 = " + kor);
	}
	
	//국어 + 수학 점수 출력하는 메서드 만들기
	void sum(int kor, int math) {
		System.out.println("국어+수학 점수 = " + (kor + math));
	}
	
	//국어 + 수학+ 영어 점수를 출력하는 메서드 만들기
	void sum(int kor, int math, int eng) {
		System.out.println("국어+수학+영어 점수 = " + (kor + math + eng));
	}
	
	//멤버 변수에 저장된 데이터값을 출력해주는 메서드
	void show() {
		System.out.println("이름 = " + name);
		System.out.println("국어점수 = " + kor);
		System.out.println("수학점수 = " + math);
		System.out.println("영어점수 = " + eng);
	}
	
}
