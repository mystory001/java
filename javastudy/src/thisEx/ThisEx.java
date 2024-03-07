package thisEx;
//자신의 메모리를 가리키는 this
class BirthDay{
	int day;
	int month;
	int year;
	
	//태어난 연도를 지정하는 메서드
	public void setYear(int year){
		this.year = year; //b.Day.year = year;과 같음
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	
}


public class ThisEx {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();

	}

}
