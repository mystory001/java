package test9;
//객체간 협력
class Player {
	
	   //PlayerLevel 추상 클래스의 객체를 멤버 변수로 지정
		private PlayerLevel level;
		
		//기본 생성자 
		public Player() {
			level = new BeginnerLevel(); //초급자 객체 생성
			level.showlevelMessage();
		}
		
		//멤버 변수 level 의 값을 가져오는 getter 메서드
		public PlayerLevel getLevel() {
			return level;
		}
		
		//생성된 하위 객체들이 메서드의 매개변수로 넘어온다.(다형성)
		//업캐스팅 : 생성된 인스턴스의 메서드가 수행된다.
		//PlayerLevel level = new AdvancedLevel();
		//PlayerLevel level = new SuperLevel();
		public void upgradeLevel(PlayerLevel level) {
			this.level = level;
			level.showlevelMessage();
		}
			
		//상속이 아닌 객체간 협력 : 템플릿 메서드 go() 호출하는 메서드
		public void play(int count) {
			
			//final public void go(int count) 템플릿 메서드 호출
			level.go(count);
		}	
}


//추상 클래스 : 공통적인 기능을 사용하는 메버들은 추상클래스에서 정의
abstract class PlayerLevel {
	
	//추상 메서드 : 공통적인 기능을 사용하는 메서드는 추상클래스에서 정의
	public abstract void run(); //달린다
	public abstract void jump(); //점프한다
	public abstract void turn(); //턴한다
	public abstract void showlevelMessage();//레벨별 메시지 출력
	
	//템플릿 메서드 구현
	//                               1
	final public void go(int count) {
		run(); //달리고
		
		//                            1
		for(int i = 0 ; i < count; i++) {
			jump(); //점프하고
		}
		
		turn(); //턴한다
		
		}
	
}

//초보자 레벨 클래스 : PlayerLevel 추상 클래스 상속해서 메서드 오버라이딩(강제 구현)
class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.!!!");		
	}

	@Override
	public void jump() {
		System.out.println("Jump할 줄 모르지롱.!!!");		
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모르지롱.!!!");		
	}

	@Override
	public void showlevelMessage() {
		System.out.println("***** 초보자 레벨입니다 *****");		
	}	
	
}

class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.!!!");		
	}

	@Override
	public void jump() {
		System.out.println("높이 Jump 합니다.!!!");		
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모르지롱.!!!");		
	}

	@Override
	public void showlevelMessage() {
		System.out.println("***** 중급자 레벨입니다 *****");		
	}		
	
}

class SuperLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.!!!");		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 Jump 합니다.!!!");		
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다.!!!");		
	}

	@Override
	public void showlevelMessage() {
		System.out.println("***** 고급자 레벨입니다 *****");		
	}	
	
}
public class MainBoard {

	public static void main(String[] args) {
		
		//BeginnerLevel() 클래스의 객체가 생성된다.
		Player player = new Player();
		player.play(1);
		System.out.println("--------------");
		
		//AdvancedLevel alevel = new AdvancedLevel();
		//player.upgradeLevel(alevel);
		player.upgradeLevel(new AdvancedLevel());
		
		player.play(2);
		System.out.println("--------------");
		
		//SuperLevel slevel = new SuperLevel();
		//player.upgradeLevel(slevel);
		player.upgradeLevel(new SuperLevel());		
		player.play(3);
	}

}
