package test10_1;

//구현 클래스 만들기 : Scheduler 인터페이스를 구현(overriding)해서 객체로 생성해서 메서드 호출!!
//2.짧은 대기열 먼저 배분하기 : 현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 배분
public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.!!!");			
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.!!!");		
	}
	

}
