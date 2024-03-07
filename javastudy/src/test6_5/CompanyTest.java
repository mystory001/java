package test6_5;

public class CompanyTest {

	public static void main(String[] args) {
		
		//클래스명.getInstance() 호출하여 myCompany1변수에 대입
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		//myCompany1와 myCompany2 변수가 같은 객체를 가져온 것인지 확인
		System.out.println(myCompany1 == myCompany2);

	}

}
