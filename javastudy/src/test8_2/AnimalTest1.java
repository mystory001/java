package test8_2;

//상속을 받은 클래스는 객체 생성시에 부모(상위) 클래스의 객체를 먼저 생성하고
//부모(상위)의 멤버 변수를 먼저 초기화 시켜주어야만 자신의 객체가 생성된다. 

//1.상속에서 부모(상위) 클래스와 자식(하위) 클래스에 동일한 이름의 메서드가 존재할 때 
//호출되는 메서드는 자식(하위) 클래스의 인스턴스 메서드가 호출된다. 
//2.부모(상위) 클래스의 메서드의 호출이 아닌 생성된 인스턴스의 메서드를 호출하는 것이다.
//3.인스턴스의 메서드가 호출되는 기술을 '가상 메서드' 라고 한다.

class Animal {
	
	//생성자가 하나도 정의되어 있지 않으면 컴파일러가 기본 생성자를 추가해서 객체를 생성하게 한다.!!!
	
	
	public void move() {
		System.out.println("동물이 움직입니다.!!!");
	}
}

class Human extends Animal{
	//생성자가 하나도 정의되어 있지 않으면 컴파일러가 기본 생성자를 추가해서 객체를 생성하게 한다.!!!
	public  Human() {
		super(); //컴파일러가 부모(상위) 생성자를 호출해서 객체를 생성시켜주도록 자동으로 추가해서 넣어준다.!!!
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.!!!");
	}	
	
}

class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.!!!");
	}	
	
}


class Eagle extends Animal{
		
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.!!!");
	}	
}


class Cast{
	
	//Animal 클래스를 상속받은 자식(하위) 클래스의 객체를 생성해서 매개변수로 넘겨주면 업캐스팅이 일어나게 하는 메서드 작성 
	//Animal animal = new Human();
	//Animal animal = new Tiger()
	//Animal animal = new Eagle()
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}

public class AnimalTest1 {

	
	    
	
	
	
	public static void main(String[] args) {
		
		
		Animal a = new Animal();
		a.move();
		System.out.println("--------------");
		
		//부모(상위) 클래스의 메서드의 호출이 아닌 생성된 인스턴스의 메서드를 호출하는 것이다.
		Human h =new Human();
		h.move();
		System.out.println("--------------");
		
		Tiger t = new Tiger();
		t.move();
		System.out.println("--------------");
		
		Eagle e = new Eagle();
		e.move();
		System.out.println("===========");
		
		//Cast 클래스로 객체 생성
		Cast c = new Cast();
		
		//public void moveAnimal(Animal animal)메서드 호출
		
		c.moveAnimal(new Human());
		c.moveAnimal(new Tiger());
		c.moveAnimal(new Eagle());
		System.out.println("--------------");
		
		c.moveAnimal(h);
		c.moveAnimal(t);
		c.moveAnimal(e);
		System.out.println("--------------");
		
		System.out.println("===========");
		AnimalTest1  aTest = new AnimalTest1 ();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
			
		
		/*
		c.moveAnimal(h);
		c.moveAnimal(t);
		c.moveAnimal(e);
		*/
		
	}
	
	//Animal 클래스를 상속받은 자식(하위) 클래스의 객체를 생성해서 매개변수로 넘겨주면 업캐스팅이 일어나게 하는 메서드 작성
	//자식(하위) 객체가 업캐스팅 되었을때는 부모(상위) 클래스의 멤버만 사용이 가능하도록 제한한다.
	//그러나 메서드 호출은 부모(상위)의 move() 메서드가 아니라 오버라이드된 자식(하위) 메서드가 호출된다.!!
    //Animal animal = new Human();
	//Animal animal = new Tiger()
	//Animal animal = new Eagle()
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
