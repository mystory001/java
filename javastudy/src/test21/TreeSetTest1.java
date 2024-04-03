package test21;

import java.util.Comparator;

class Student implements Comparable<Student>{
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	@Override
	public int compareTo(Student o) {
		
		//자기자신(this) 객체와 전달받은 매개변수(객체) 비교
		if(this.age > o.age) {
			return 1; //오름차순
		} else if(this.age == o.age) {
			return 0;
		} else {
			return -1;// 내림차순
		}
	}
	*/
	//==
	@Override
	public int compareTo(Student o) {
		return (this.age-o.age);
	}
	
	
}

class Student1 implements Comparator<Student1>{
	String name;
	int age;
	
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//콜백 메소드 : 프로그래머가 작성하지만 시스템이나 자바 컬렉션 프레임워크가 호출하는 메소드
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.age-o2.age;
	}
	
}


public class TreeSetTest1 {

	public static void main(String[] args) {

		Student a = new Student("ㄱ", 20);
		Student b = new Student("ㄱ", 20);
		Student c = new Student("ㄱ", 21);
		Student d = new Student("ㄱ", 19);
		
		int result = a.compareTo(b);
		System.out.println(result);
		
		result = a.compareTo(c);
		System.out.println(result);
		
		result = a.compareTo(d);
		System.out.println(result);
		
		System.out.println();
		
		Student1 a1 = new Student1("a", 18);
		Student1 b1 = new Student1("a", 18);
		Student1 c1 = new Student1("a", 17);
		Student1 d1 = new Student1("a", 19);
		
		int result1 = a1.compare(a1, b1);
		System.out.println(result1);
		
		result1 = a1.compare(a1, c1);
		System.out.println(result1);
		
		result1 = a1.compare(a1, d1);
		System.out.println(result1);
		
		result1 = a1.compare(c1, d1);
		System.out.println(result1);
	}

}
