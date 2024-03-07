package test6_2;
//학생 클래스 구현
public class Student {
	public String studentName; //학생 이름
	public int money; //학생이 가진 돈

//학생 이름과 학생이 가진 돈을 매개변수로 받는 생성자
public Student(String studentName, int money) {
	this.studentName = studentName;
	this.money = money;
}
//학생이 버스를 타면 1000원을 지불하는 기능을 구현한 매서드
public void takeBus(Bus bus) {
	bus.take(1000);
	this.money -= 1000;
}
//학생이 지하철을 타면 1500원 지불하는 기능을 구현한 메서드
public void takeSubway(Subway subway) {
	subway.take(1500);
	this.money -= 1500;
}
//학생의 현재 정보를 출력하는 메서드
public void showS() {
	System.out.println(studentName + " 남은 돈은 " + money);
}












}
