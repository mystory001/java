package test8_4;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.!!!");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.!!!");
	}	
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.!!!");
	}
}

class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.!!!");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.!!!");
	}
	
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.!!!");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉펴고 멀리 날아갑니다.!!");
	}
}


public class AnimalTest {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	//ArrayList에 추가되면서 Animal형으로 형변환됨(업캐스팅)
	//Animal aniList = new Human();
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());		
	
		for(Animal ani : aniList) {
			ani.move();
		}
	}

	public void testCasting() {
		
		for(int i = 0 ; i < aniList.size(); i++) { //모든 배열 요소를 하나씩 돌면서
			
			Animal ani = aniList.get(i);
			
			if(ani instanceof Human) {   //Human이면
				Human h = (Human)ani;    //Human 형으로 다운 캐스팅
				h.readBook();
			} 
			else if(ani instanceof Tiger) {   //Human이면
				Tiger t = (Tiger)ani;    //Human 형으로 다운 캐스팅
				t.hunting();
			} 
			
			else if(ani instanceof Eagle) {   //Human이면
				Eagle e = (Eagle)ani;    //Human 형으로 다운 캐스팅
				e.flying();
			} 
			else {
				System.out.println("지원되지 않는 형입니다.!!!");
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		aTest .addAnimal();
		System.out.println("--- 원래 자료형으로 다운 캐스팅---");
		aTest.testCasting();
	}

}
