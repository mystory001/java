package test10_1;

//고객 상담 전화 배분 프로그램 작성
//공통으로 사용하는 메서드를 선언
//추상 메서드 형식으로 작성해서 구현하는 클래스가 메서드를 오버라이딩(overriding) 해서 강제 구현하게 만든다.!!
public interface Scheduler {
	
	public abstract void getNextCall(); //다음 전화 가져오는 기능
	public abstract void sendCalltoAgent();//상담원에게 전화를 배분하는 기능

}
