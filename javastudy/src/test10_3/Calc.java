package test10_3;

public interface Calc {
	
	public static final double PI = 3.14;
	public static final int ERROR = -999999999; //어디서나 ERROR 처리 코드값으로 공통으로 사용할 값 지정
	
	public abstract int add(int num1, int num2); //더하기 기능
	public abstract int subtract(int num1, int num2); //빼기 기능
	public abstract int times(int num1, int num2); //곱하기 기능
	public abstract int divide(int num1, int num2); //나누기 기능

}
