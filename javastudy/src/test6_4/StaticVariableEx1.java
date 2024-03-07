package test6_4;

public class StaticVariableEx1 {

	static int staticVariable = 5; // static 변수는 클래스 수준에 선언됩니다.

    public static void main(String[] args) {
        // static 변수에 직접 접근
        System.out.println("main: " + staticVariable);

        // 다른 메서드에서도 static 변수 사용 가능
        anotherMethod();
        
        // static 변수 값 변경
        staticVariable = 10;
        
        // 변경된 static 변수 값 확인
        System.out.println("Updated main: " + staticVariable);
        
        staticVariable = 15;
        
        anotherMethod1();
       
        System.out.println("Updated main: " + staticVariable);
    }

    public static void anotherMethod() {
        // 다른 메서드에서도 static 변수 사용 가능
        System.out.println("anotherMethod: " + staticVariable);
    }
    
    public static void anotherMethod1() {
    	System.out.println("anotherMethod1: " + staticVariable);
    }
    	
    
}