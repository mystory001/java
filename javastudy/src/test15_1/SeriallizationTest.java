package test15_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 5346469700390219681L; //Ctrl + 1 => 2번째 옵션
	String name;
	String job;
//	transient String job; 직렬화하고 싶지 않은 변수가 있을 때 사용하는 예약어

//기본 생성자
public Person() {}

//생성자
public Person(String name, String job) {
	this.name = name;
	this.job = job;
}

//toString 재정의(오버라이딩)
public String toString() {
	return name + " " + job; 
}
}

public class SeriallizationTest {

	public static void main(String[] args){
		Person p1 = new Person("이성계","창업주");
		Person p2 = new Person("이방원","명예회장");
		
		System.out.println(p1);
		System.out.println(p2);
		
		//직렬화
		try(FileOutputStream fos = new FileOutputStream("src/test15_1/serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
				//p1과 p2의 값을 파일에 씀(직렬화) 
				oos.writeObject(p1);
				oos.writeObject(p2);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		//역직렬화
		try(FileInputStream fis = new FileInputStream("src/test15_1/serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
					//p1과 p2의 값을 파일에서 읽어 들임(역직렬화) 
					Person pa = (Person)ois.readObject();
					Person pb = (Person)ois.readObject();
					
					System.out.println(pa);
					System.out.println(pb);
				} catch(IOException e) {
					e.printStackTrace();
				} catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
	}

}
