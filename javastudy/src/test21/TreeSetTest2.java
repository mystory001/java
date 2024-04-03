package test21;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Tree로 시작하는 클래스는 데이터를 추가한 후 결과를 출력하면 결과값이 정렬
//데이터의 중복은 허용하지 않고 츨력 결과값을 정렬하는 클래스
//정렬 방식을 어떻게 지정하느냐에 따라 오름차순, 내림차순으로 결정됨

//Comparable 인터페이스와 Comparator 인터페이스 -> 자신의 객체와 전달 받은 객체를 비교
//Comparable 인터페이스 > Comparator 인터페이스 사용빈도는 Comparable인터페이스를 더 많이 사용함
//Comparator 인터페이스 : Comparable 인터페이스가 이미 구현되어 있는 경우 사용. 전달되는 매개변수 2개를 비교. 생성자에 Comparator 인터페이스를 구현한 객체를 매개변수로 전달

//콜백(callback) 메소드
//객체가 TreeSet에 요소를 추가할 때 호출
class Descending implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*-1; //음수로 만들어 내림차순
	}
	
}

class Descending1 implements Comparable<Descending1>{
	String name;
	int age;
	
	public Descending1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Descending1 o) {
		return this.age-o.age;
	}

	@Override
	public String toString() {
		return "this.name = " + this.name + ", this.age = " + this.age;
	}
	
}

public class TreeSetTest2{
	
	public static void main(String[] args) {
		//String 클래스는 Comparable 인터페이스를 이미 구현해놓음 -> 기본적으로 오름차순 정렬되어 있음
		TreeSet<String> set = new TreeSet<String>();
//		Set<String> set = new TreeSet<String>();
		
		set.add("A");
		set.add("C");
		set.add("D");
		set.add("B");
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		System.out.println();
		
		//내림차순 정렬
		//TreeSet 생성자에 Comparator 인터페이스를 구현한 객체를 매개변수로 전달
		TreeSet<String> treeSet = new TreeSet<String>(new Descending());
		treeSet.add("D");
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		
		System.out.println(treeSet);
		
		System.out.println();
		
		TreeSet<Descending1> treeSet1 = new TreeSet<Descending1>();
		treeSet1.add(new Descending1("K", 18));
		treeSet1.add(new Descending1("K", 19));
		treeSet1.add(new Descending1("K", 18));
		treeSet1.add(new Descending1("K", 17));
		
		System.out.println(treeSet1);
		
		
	}



}
