//231211
package test6_4;
/*
 * 클래스 멤버와 인스턴스 멤버 간의 참조와 호출
 * 클래스 멤버(클래스 변수, 클래스 메소드) 존재하는 시점은 처음 클래스가 메모리에 올라갈 때
 * 클래스 멤버는 존재
 * 인스턴스 멤버(인스턴스 변수, 인스턴스 메소드)는 객체를 생성해야만 존재할 수 있음
 * 인스턴스 멤버는 객체를 생성하기 전까지는 존재하고 있지 않음
 */
public class Check {
    static int cv = 5; //클래스 변수, 객체를 생성하지 않아도 사용이 가능함
    int iv = 10; //인스턴스 변수, 객체를 생성해야 사용이 가능함, 객체를 호출해서 사용
    
    //클래스 메소드 현재 존재하고 있는 메소드. 바로 호출해서 사용 가능
    static void cm() {
    	System.out.println("클래스 메소드");
    	System.out.println("객체를 생성하지 않아도 호출이 가능한 메소드");
    	//System.out.println(this.iv); static에는 this를 붙일 수 없음
    	System.out.println(cv);
    	//System.out.println(iv); 인스턴스 변수는 객체가 생성되지 않아 사용이 불가능 즉, 변수의 값이 존재하지 않는다고 취급하기 때문에 접근할 수 없음. 
    }
    
    //인스턴스 메소드. 객체를 생성하고 객체 내에서 호출해야만 사용 가능
    void im() {
    	System.out.println("인스턴스 메소드");
    	System.out.println("객체를 생성해야만 객체 내에서 호출이 가능한 메소드");
    	System.out.println(this.iv);
    }
    	


    	   	
    
}
