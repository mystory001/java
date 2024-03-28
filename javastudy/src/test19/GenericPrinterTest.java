package test19;


//객체를 생성해서 사용할 클래스
class Powder{

	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}
	
	@Override
	public String toString() {
		return "재료는 Powder";
	}
}

//객체를 생성해서 사용할 클래스
class Plastic{
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}

	@Override
	public String toString() {
		return "재료는 Plastic";
	}
	
}
//제네릭 클래스 클래스의 구조를 일반화 시킨 클래스
class GenericPrint<T>{
	private T material; //제네릭 타입 변수

	public T getMaterial() { //제네릭 타입 메소드
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
}


public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrint<Powder> powder = new GenericPrint();
		powder.setMaterial(new Powder());
		System.out.println(powder.getMaterial());
		System.out.println(powder);
		
		System.out.println();
		
		GenericPrint<Plastic> plastic = new GenericPrint();
		plastic.setMaterial(new Plastic());
		System.out.println(plastic.getMaterial());
		System.out.println(plastic);
		System.out.println();
		
		//제네릭 클래스에 대입시킬 자료형을 명시하지 않는 경우 => Object형
		//컴파일 오류는 아니지만 강제로 사용할 타입으로 형 변환을 시켜줘야함
		GenericPrint powder1 = new GenericPrint();
		powder1.setMaterial(new Powder());
//		powder1.setMaterial(new Plastic());
		Powder p = (Powder)powder1.getMaterial();
		System.out.println(powder1);
		System.out.println(p);
		System.out.println((Powder)powder1.getMaterial());
		System.out.println();
		
		//강제로 사용할 타입으로 형 변환 시켜줘야함
		GenericPrint<Object> gp = new GenericPrint();
		gp.setMaterial(new Powder());
		
		Powder pp = (Powder)gp.getMaterial();
		System.out.println(gp);
		System.out.println(pp);
		System.out.println((Powder)gp.getMaterial());

	}

}
