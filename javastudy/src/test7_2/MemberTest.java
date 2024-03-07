package test7_2;

import java.util.ArrayList;

public class MemberTest {

	public static void main(String[] args) {
		
		//id, password, name의 데이터값을 담은 객체 3개를 생성하여 저장해 둘 객체 배열 생성
		
		//3명의 Member 객체 생성 : 일반생성자 호출   
		Member m1 = new Member("j1", "123", "정은주");
		Member m2 = new Member("s2", "456", "손예률");
		Member m3 = new Member("c3", "789", "천세훈");
		
		//3명의 Member 객체 생성 : 객체 배열 생성
		Member[] member = new Member[] {m1,m2,m3};
		
		for(int i = 0 ; i < member.length ; i++) {
			System.out.println("-- 객체 배열로 출력 --");
			System.out.println(member[i].getId());
			System.out.println(member[i].getPassword());
			System.out.println(member[i].getName());
			System.out.println("---------------");
		}
		System.out.println("---------------");
		
		
		// ArrayList 배열에 Member 3명 저장
		ArrayList<Member> mem = new ArrayList<Member>();
		mem.add(m1);
		mem.add(m2);
		mem.add(m3);		
		System.out.println("---------------");
		
		// for 출력 
		for(int i = 0; i < mem.size(); i++) {
			System.out.println("-- ArrayList 출력 --");
			Member m = mem.get(i); //변수에 객체 주소를 받아 넣기
			//System.out.println(mem.get(i)); //객체 주소를 출력
			
			System.out.println(m.getId());
			System.out.println(m.getPassword());
			System.out.println(m.getName());
			System.out.println("------------------");
		}
		
		System.out.println("--- 향상된 for문 사용 ---");
		for (Member m : mem) {			
			System.out.println(m.getId());
			System.out.println(m.getPassword());
			System.out.println(m.getName());
			//m.show();
		}
			
		System.out.println("=====================");
		
		//MemberDAO 객체 생성
		MemberDAO memberDAO1 = new MemberDAO();
		
		//객체 1개만 매개변수로 전달됨 : m1 객체를 매개변수로 넘기기
		//public void insertMember(Member member)메서드 호출
		
		memberDAO1.insertMember(m1);
		System.out.println("------------------");
		
		
		//객체 배열이 매개변수로 전달됨 : member 객체 배열을 매개변수로 넘기기
		//public void insertMember1(Member[] m) 메서드 호출
		memberDAO1.insertMember1(member);
		System.out.println("------------------");
		
		
		//ArrayList 클래스를 이용한 배열이 매개변수로 전달됨 : mem 제네릭 배열을 매개변수로 넘기기
		//public void insertMember2(ArrayList<Member> mem) 메서드 호출
		memberDAO1.insertMember2(mem);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
