package test10_1;

//구현 클래스 만들기 : Scheduler 인터페이스를 구현(overriding)해서 객체로 생성해서 메서드 호출!!
//1. 순서대로 배분하기 : 상담원 한 명씩 돌아가며 동일하게 상담 업무 배분
public class Roundrobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.!!!");			
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.!!!");		
	}
	
}
