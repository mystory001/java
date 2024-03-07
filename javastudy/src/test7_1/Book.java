package test7_1;

public class Book {
	
	private String bookName;
	private String author;
	
	//기본 생성자
	public Book() {  }
	
	//일반 생성자
	public Book(String bookName, String author) {		
		this.bookName = bookName;
		this.author = author;
	}
	
	//getter/setter
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//맴버 변수내의 데이터값을 출력해주는 메서드
	public void show() {
		
		System.out.println(this.bookName + " , " + this.author);
	}
	

}
