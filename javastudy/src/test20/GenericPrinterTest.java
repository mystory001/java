package test20;

//추상 클래스
abstract class Material{
	public abstract void doPrinting();
}

//일반 클래스
class Powder extends Material{

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}

	@Override
	public String toString() {
		return "재료는 Powder";
	}
	
}

//일반 클래스
class Plastic extends Material{

	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}

	@Override
	public String toString() {
		return "재료는 Plastic";
	}

}

//제네릭 클래스 : Material 클래스를 상속받은 클래스(자료형)들만 사용할 수 있게 제한
//<T extends Material> 제네릭 클래스에서 사용할 수 있는 클래스(자료형)에 제한을 둠
class GenericPrinter<T extends Material>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}


public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powder = new GenericPrinter();
		powder.setMaterial(new Powder());
		powder.printing();
		
		System.out.println();
		
		GenericPrinter<Plastic> plastic = new GenericPrinter();
		plastic.setMaterial(new Plastic());
		plastic.printing();
		
		System.out.println();
		
		GenericPrinter printer = new GenericPrinter<>();
		printer.setMaterial(new Powder());
		printer.printing();
		printer.setMaterial(new Plastic());//2번째 객체가 저장됨
		printer.printing();
		
		System.out.println();
		
		
	}

}
