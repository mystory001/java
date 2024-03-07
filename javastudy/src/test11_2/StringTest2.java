package test11_2;

public class StringTest2 {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println("javaStr = " + javaStr);
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		System.out.println("-----------------");
		
		javaStr = javaStr.concat(androidStr);//문자열 연결
		System.out.println("javaStr = " + javaStr);
		System.out.println("연결된 문자열 주소값 : " + System.identityHashCode(javaStr));
		
	}

}
