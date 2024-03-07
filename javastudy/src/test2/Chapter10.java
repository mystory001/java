package test2;

import java.util.Scanner;

public class Chapter10 {

	public static void main(String[] args) {
//		231108
		
		Scanner sc = new Scanner(System.in);
		
		
//		if문 내에 if문으로 구성. 처음 if문의 조건이 맞지 않으면 if문 내의 if문을 수행하지 않는다.
//		if문이 참이어야 if문 안 if문이 수행 가능
//		ex) id가 맞아야 pw를 입력할 수 있다.
		
		//수학 점수가 70점 이상이고, 영어점수가 60점 이상일때 통과
		int math = 70;
		int eng = 55;
		if(math>=70) {
			if(eng>=60) {
				System.out.println("pass");				
			}
			else {			
			System.out.println("fail");
			}
		}
		
		//또는

//		if(math>=70 && eng>=60) {
//				System.out.println("pass");				
//			}
//			else {			
//			System.out.println("fail");
//			}
//		}
		//로그인 예제 id: abcde, pw : 12345
		String id = "abcde";
		String pw = "12345";
		if(id.equals("abcde")) {
			if (pw.equals("12345")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		}
		
//		if(id.equals("abcde")&&pw.equals("12345")) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
		
		//id와 pw를 입력 받아서
		String id1, pw1;
		System.out.println("ID를 입력하세요");
		id1 = sc.nextLine();
		
		if(id1.equals("abcde")) {
			System.out.println("ID가 일치합니다");
			
			System.out.println("PW를 입력하세요");
			pw1 = sc.nextLine();
			
			if(pw1.equals("12345")) {
				System.out.println("PW가 일치합니다.");
				System.out.println("로그인 성공");
			} 
			else  {
				System.out.println("PW가 틀립니다.");
				System.out.println("PW를 확인해주세요");
			}
		} else {
			System.out.println("ID를 확인해주세요");
		}
		
		
		
		

	}

}
