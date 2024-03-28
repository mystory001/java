package test17;

public class TravelCustomer {
	private String name;
	private int price;
	private int grade;
	
	public TravelCustomer() {}
	
	public TravelCustomer(String name, int price, int grade) {
		this.name = name;
		this.grade = grade;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price + ", 등급 : " + grade;
	}
	
	
	
}
