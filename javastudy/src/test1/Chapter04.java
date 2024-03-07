//231101
package test1;

import java.util.Scanner;

public class Chapter04 {

	public static void main(String[] args) {
		
		// 231101
		// 입력 : 키보드로 입력받은 값을 변수에 저장
		// Scanner 참조 변수명 = new Scanner(System.in);
		// class명 변수명 = new class명 (입력방법);
		// 사용 class import : Ctrl + Shift + O
		
		Scanner sc = new Scanner(System.in);
		//한 번만 선언하면 됨
		
		
		/*
		//정수 입력 : .nextInt();
		System.out.println("아래 줄에 정수를 입력해주세요.");
		int v1 = sc.nextInt();
		System.out.println(v1 + " 입력하였습니다. \n");
		
		//실수 입력 : .nextDouble();
		System.out.println("아래 줄에 실수를 입력해주세요.");
		double v2 = sc.nextDouble();
		System.out.println(v2 + " 입력하였습니다. \n");
				
		//문자 입력(단어별) : .next();
		System.out.println("아래 줄에 단어를 입력해주세요.");
		String v3 = sc.next();
		System.out.println(v3 + " 입력하였습니다. \n");
		
		
		.next(); 문자 입력(단어별). 변수가 String일 때 사용 
		ㄴex) String 변수명 = sc.next();
		.next().charAt(0); 문자 중 몇번째 글자? 를 뜻함. 변수가 Char일 때 사용 
		ㄴex) Char 변수명 = sc.next().charAt();
		
		
		//ex) 100 / Enter 100.0 / Enter 동해물과 Enter 동해물과 백두산이 마르고 닳도록 Enter
		
		sc.nextLine();
		
		//문장 입력 : .nextline();
		//nextLine()은 Enter 키를 만나기 전까지의 공백을 포함한 모든 문자열을 읽어온다. 
		System.out.println("아래 줄에 문장(공백 포함)을 입력해주세요.");
		String v4 = sc.nextLine();
		System.out.println(v4+"\n입력하였습니다.\n");
		
		//키보드로 문자입력 : 사용자가 입력하는 값을 공백(\t, n)으로 구분하여 읽음.(탭, 띄어쓰기 등으로 구분). 프로그램을 실행시키고 콘솔창에 문자열 입력
		
		//문자 하나만 가져오기
		System.out.println("문자열(단어)에서 글자 하나만 가져오기");
		char v5 = sc.next().charAt(0);	//sc.next().charAt(n); 가져올 위치는 0부터 시작. 0 지정 시 첫번째 글자를 가져온다 즉, 실제위치보다 -1
		System.out.println(v5);
		*/
		
		//이름, 나이, 키, 혈액형, 코딩여부 입력받고 출력하기
		
		/*
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		System.out.println("신장을 입력하세요.");
		double height = sc.nextDouble();
		
		System.out.println("혈액형을 입력하세요.");
		char blood = sc.next().charAt(0); //sc.next().charAt(n); 문자 중 n번째(n-1) 글자 를 뜻함
		//System.out.println("혈액형을 입력하세요.");
		//String blood = sc.next();
		
		System.out.println("코딩여부(True/False)를 입력하세요.");
		boolean coding = sc.nextBoolean();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("신장 : "+height);
		System.out.println("혈액형 : "+blood);
		System.out.println("코딩여부 : "+coding);
		
		
		//nextLine(); : 공백을 포함해서 Enter키 입력 전까지 문자열 모두 가져와서 저장.
		//nextInt(); : 정수형으로 변환해서 저장
		//nextDouble(); : 실수형으로 변환해서 저장
		//next(); : 단어로 변환해서 저장
		//next().charAt(n); : 단어의 n번째에서 가져오고 싶은 글자 위치를 지정해서 가져오기. 0은 첫번째 글자
		//자료형은 char 형으로 지정 
		//nextBoolean(); : True/False로 변환해서 저장. Console창에 입력할때 True/False 둘 중 하나 입력  
		*/
		
		
		System.out.println("페이지 입력");
		int page = sc.nextInt();
		
		System.out.println("기온 입력");
		float temp = sc.nextFloat();
		
		System.out.println("가지고 있는 현금");
		int cash = sc.nextInt();
		
		System.out.println("성별 입력(남/여 혹은 남자/여자)");
		char gender = sc.next().charAt(0);
		
		System.out.println("코딩여부(True/False)");
		boolean coding = sc.nextBoolean();
		
		System.out.println("공부하고 있는 페이지는 " + page + " 페이지입니다.");
		System.out.println("바깥 온도는 " + temp +" 도 입니다." );
		System.out.println("현금은 "+ cash + " 원을 가지고 있습니다.");
		System.out.println("성별은 "  + gender + " 입니다.");
		System.out.println("코딩을 " + coding + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
