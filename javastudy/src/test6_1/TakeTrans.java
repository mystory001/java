//231206
package test6_1;

class Bus{
	int busNumber;
	int passengerCount;
	int money;
	
	//버스 번호를 매개변수로 받는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객이 버스에 탄 경우 버스 요금을 지불하는 메서드 → 버스 수입 증가
	public void take(int busMoney) {
		this.money += busMoney;//지불 받은 요금을 가지고 있는 busMoney 매개변수 값을 멤버 변수 this.money에 저장
	}
	
	public void show() {
		System.out.println("버스번호 : " + this.busNumber + ", 승객이 지불한 요금 : " + this.money);
	}
	
}

class Subway{
	int lineNumber;
	int passengerCount;
	int money;
	
	//지하철 노선을 매개변수로 받는 생성자
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int subMoney) {
		this.money += subMoney;
	}
	
	public void show1() {
		System.out.println("지하철 라인 : " + this.lineNumber + ", 승객이 지불한 요금 : " + this.money);
	}
}

class Student{
	String studentName;
	int money;
	
	//객체 생성 시 이름과 가진 돈을 곡 넣어주지 않으면 객체가 생성되지 않음.
	//이름과 가진 돈을 매개변수로 받는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}	
	
	//학생이 버스를 타면 3100원을 지불하는 기능을 구현하는 메서드. 학생 -3100, 버스 수익 +3100
	public void takeBus(Bus bus) //Bus 클래스 객체
	{
		this.money -= 3100; //Student 클래스의 멤버 변수 money: 학생이 가지고 있는 돈에서 감소
	}
	
	//학생이 지하철을 타면 3000원이 지불하는 기능을 구현하는 매서드. 학생 -3000, 지하철 수익 +3000
	public void takeSubway(Subway subway) //Subway 클래스 객체
	{
		this.money -= 3000; //Student 클래스의 멤버 변수 money;
	}
	
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈 : " + money);
	}
	
	
}


public class TakeTrans {

	public static void main(String[] args) {
		Bus bus100 = new Bus(100); //버스 객체 생성
		bus100.show();
		
		bus100.take(3100);//버스 요금 메서드
		bus100.show();
		
		
		Subway subway1 = new Subway(1);//지하철 객체 생성
		subway1.show1();
		
		subway1.take(3000); //지하철 요금 메서드
		subway1.show1();
		
		Student James = new Student("James",100000); //학생 객체 생성
		James.showInfo();
		
		bus100.take(3100);
		bus100.show();
		subway1.take(3000);
		subway1.show1();
		
		James.takeBus(bus100); //takeBus메서드에 매개변수는 객체형. Bus 클래스로 생성한 객체만 매개변수로 넘겨 줄 수 있음
		James.showInfo();
		
		James.takeSubway(subway1); //takeSubway 메서드에 매개변수는 객체형. Subway 클래스로 생성한 객체만 매개변수로 넘겨 줄 수 있음
		James.showInfo();
		
		
		
	}

}
