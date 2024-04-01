package test21;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Hash{
	
	//Set 인터페이스 : 순서와 상관없이 중복을 허용하지 않음
	//기본적으로 인스턴스 주소가 같으면 동일한 객체임(Hash 함수를 이용한 저장 위치가 같은지 여부)
	//아이디가 같아도 같은 회원(객체 내의 저장된 내용(id)가 같은지 여부)
	//equals(), hashCode() 메소드 재정의 해서 아이디가 같으면 동일한 회원임을 구현해줘야함
	
	int id;
	String name;
	
	//일반 생성자
	public Hash(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "(" + this.id + " , " + this.name + ")";
	}

	//equals(), hashCode()메소드를 재정의해서 논리적으로 같은 객체를 인식할 수 있도록 해주어야함.
	@Override
	public int hashCode() {
		//hashCode() 메소드가 아이디를 반환하도록 재정의
		return Objects.hash(id);
	}
	
	//매개변수로 반환받은 아이디가 자신의 아이디와 같다면 ture로 반환
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hash other = (Hash) obj;
		return id == other.id;
	}
	
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Hash) {
			Hash hash = (Hash)obj;
			if(this.id == hash.id) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println(System.identityHashCode(id));
		//hashCode() 메소드가 회원 아이디를 반환하도록 재정의
		return this.id;
	}
	*/
}

public class HashSetTest1 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("D"); //중복 허용 X
		System.out.println(hashSet);
		
		Set<Hash> set = new HashSet<Hash>();
		set.add(new Hash(1,"A"));
		set.add(new Hash(2,"B"));
		set.add(new Hash(3,"C"));
		set.add(new Hash(3,"C"));
		System.out.println("Set : " + set);
		
		
		
	}

}
