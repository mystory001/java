package test6_2;

public class TakeTrans {

	public static void main(String[] args) {
		Student student1 = new Student("학생1", 100000); //학생 1 생성
		Student student2 = new Student("학생2", 1000000); //학생 2 생성
		
		Bus bus = new Bus(1); //버스 번호가 1인 버스 생성
		student1.takeBus(bus); //student1이 1번 버스를 탐
		student1.showS(); //학생 1 정보 출력
		bus.showB(); //버스 정보 출력
		
		Subway subway = new Subway("1호선"); //지하철 1호선인 지하철 생성
		student2.takeSubway(subway); //student2가 1호선 지하철을 탐
		student2.showS(); //학생 2 정보 출력
		subway.showSub(); //지하철 정보 출력
		
		
	}

}
