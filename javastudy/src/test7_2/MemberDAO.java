package test7_2;

import java.util.ArrayList;

//DAO는 Data Access Object의 약자로, DB의 데이터에 접근하기 위한 객체를 가리킨다. 
//DB에 접근하기 위한 로직을 분리하기 위해 사용한다. 
//직접 DB에 접근 하여 data를 삽입, 삭제, 조회 등 조작할 수 있는 기능을 수행한다.

public class MemberDAO {

	    //객체 1개만 매개변수로 전달됨                       m1(객체)
		public void insertMember(Member member) {
			System.out.println("MemberDAO : insertMember(Member member) 메서드 호출!!");
			System.out.println("아이디 : " + member.getId());
			System.out.println("비밀번호 : "+ member.getPassword());
			System.out.println("이름 : "+ member.getName());
		}
		
		//객체 배열이 매개변수로 전달됨             member(배열)
		public void insertMember1(Member[] m) {
			for(int i = 0 ; i < m.length ; i++) {
				System.out.println("MemberDAO : insertMember1(Member[] m) 메서드 호출!!");
				System.out.println(m[i]);
				System.out.println("아이디 : " + m[i].getId());
				System.out.println("비밀번호 : " + m[i].getPassword());
				System.out.println("이름 : " + m[i].getName());
				System.out.println("--------------------");
			}
		}
		
		//ArrayList 클래스를 이용한 배열이 매개변수로 전달됨            mem(Arraylist 객체)
		public void insertMember2(ArrayList<Member> mem) {
			System.out.println("MemberDAO : insertMember2(ArrayList<Member> mem) 메서드 호출!!");
			
			for(int i = 0; i< mem.size(); i++) {
				Member m = mem.get(i);
				System.out.println(m.getId());
				System.out.println(m.getPassword());
				System.out.println(m.getName());
				System.out.println("---------------");
			}
		}
	
	
	
	
	
	
}
