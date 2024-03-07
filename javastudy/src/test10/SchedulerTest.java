package test10;

// 인터페이스 작성 : 추상메서드 형식으로 작성!!!-> 구현된 내용은 없고 사용자가 작성할 메서드의 원형(껍데기)만 정의해 놓았다.
interface Scheduler {
	
	//추상 메서드 형식으로 작성하기
	//public abstract를 붙이지 않으면 컴파일러가 자동으로 붙여준다.!!!
		public abstract void getNextCall();
	//public  void getNextCall();	
	//void getNextCall();
		
		public abstract  void sendCallToAgent();	
}

//구현 클래스(implement class) : 인터페이스의 추상 메서드를 구현하는 클래스 만들기
//1.순서대로 배분하기 : 상담원 한 명씩 돌아가며 동일하게 상담 업무 배분
class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");		
	}	
	
}

//구현 클래스(implement class) : 인터페이스의 추상 메서드를 구현하는 클래스 만들기
//2.짧은 대기열 먼저 배분하기 : 현재 상담 업무가 없거나 상담 대기자가 가장 적은 상담원에게 배분
class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");			
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");			
	}
	
}

//구현 클래스(implement class) : 인터페이스의 추상 메서드를 구현하는 클래스 만들기
//3.우선 순위에 따라 배분하기 : 고객등급이 높은 고객의 전화부터 대기열에서 가져와 업무 능력이 높은 상담원 우선 배분
class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 전화를 먼저 가져옵니다.");			
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.");			
	}
	
}

public class SchedulerTest {

	public static void main(String[] args) {
		
		//개발코드 -> 인터페이스 -> 구현 클래스에서 객체를 생성하게 되면 에서 overrideing된 메서드가 호출될 수 있다.
		//인터페이스 참조변수 = new 구현클래스();
		
		//RoundRobin class : 객체 생성 후 Scheduler 인터페이스 변수에 대입(구현 객체)
		//RoundRobin class 에서 구현(overriding)해놓은  메서드가 호출되어 사용된다.
		//1.순서대로 배분하기  : 상담원 한 명씩 돌아가며 동일하게 상담 업무 배분
		Scheduler sc = new RoundRobin();
		sc.getNextCall();
		sc.sendCallToAgent();
		System.out.println("----------------------");
		
		
		//LeastJob class : 객체 생성 후 Scheduler 인터페이스 변수에 대입(구현 객체)
		//LeastJob class 에서 구현(overriding)해놓은  메서드가 호출되어 사용된다.
		//2.짧은 대기열 먼저 배분하기 : 현재 상담 업무가 없거나 상담 대기자가 가장 적은 상담원에게 배분
		sc = new LeastJob();
		sc.getNextCall();
		sc.sendCallToAgent();
		System.out.println("----------------------");
		
		
		//PriorityAllocation class : 객체 생성 후 Scheduler 인터페이스 변수에 대입(구현 객체)
		//PriorityAllocation class 에서 구현(overriding)해놓은  메서드가 호출되어 사용된다.
		//3.우선 순위에 따라 배분하기 : 고객등급이 높은 고객의 전화부터 대기열에서 가져와 업무 능력이 높은 상담원 우선 배분
		sc = new PriorityAllocation();
		sc.getNextCall();
		sc.sendCallToAgent();

	}

}
