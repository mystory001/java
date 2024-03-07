package test10_1;

//구현 클래스 만들기 : Scheduler 인터페이스를 구현(overriding)해서 객체로 생성해서 메서드 호출!!
//3.우선 순위에 따라 배분하기 : 고객등급이 높은 고객의 전화부터 대기열에서 가져와 업무 능력이 높은 상담원 우선 배분
public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 전화를 먼저 가져옵니다.!!!");		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.!!!");		
	}
	
}
