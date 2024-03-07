package test11;

//Object 클래스의 toString() 메서드 : 객체(인스턴스) 정보를 문자열로 반환하는 메서드이다.
//Book 클래스로 객체 생성후에 출력 : 패키지명.클래스명@heap영역에 생성된 객체의 주소 -> test11.Book@7c30a502
//오버라이드 시켜서 보여주고자 정보를 변경할 수 있다.
class Book  {
	
	int bookNumber;
	String bookTitle;
	
	//일반 생성자
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;		
	}

	
	//Object 클래스의 toString() 메서드를 재정의
	@Override
	public String toString() {
		
		return this.bookTitle + "," + this.bookNumber;
	}	
		
}


public class ToStringEx {

	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		System.out.println("book1 = " + book1);		
		System.out.println("book1.toString() = " + book1.toString());
		
	}

}
