package test11_2;

public class StringTest1 {

	public static void main(String[] args) {
		
		//문자열(String)
		
		/*
		//String 클래스는 toString() 메서드와 equals() 메서드를 미리 재정의해 두었다.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//String 클래스는 toString() 메서드를 재정의해서 문자열을 그대로 출력하게 지정해두었다.
		System.out.println("str1 = " + str1);
		System.out.println("str1 = " + str1.toString());
		System.out.println("str2 = " + str2);
		System.out.println("-----------------");
		
		//equals() 메서드를 미리 재정의해 두었다 -> 내용이 같으면 같다라고 바로 알려준다.!!!
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("-----------------");
		
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		System.out.println("-----------------");
		
		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		System.out.println("================");
		
		//String 클래스의 메서드를 이용해서 문자열 다루기
		String a = new String("java ");
		String b = new String(" , Programming ");
		System.out.println("a = " + a); //참조 변수를 출력하면 입력된 문자열이 그대로 출력된다.
		System.out.println("b = " + b);
		System.out.println("-----------------");
		
		//문자열의 길이(문자 개수)
		System.out.println(a + " 문자 개수 : " + a.length());
		System.out.println("-----------------");
		
		//문자열의 포함 관계
		System.out.println(a + "문자열 포함관계 : " + a.contains("v"));
		System.out.println("-----------------");
		
		//문자열 연결
		a = a.concat(b);
		System.out.println( "문자열 연결 : " + a);
		System.out.println(a + " 문자 개수 : " + a.length());
		System.out.println("-----------------");
		
		//문자열 앞 뒤에 공백 제거
		a = a.trim();
		System.out.println("문자열 앞 뒤에 공백제거 : " + a);
		System.out.println(a + " 문자 개수 : " + a.length());
		System.out.println("-----------------");
		
		//문자열 수정
		a = a.replace(a, "Have a good time");
		System.out.println("문자열 수정 : " + a);
		System.out.println("-----------------");
		*/
		
		
		//어떤 자료형이든 모두 문자열로 변환
		//valueOf(100) : static 메서드이므로 호출할때 ->클래스명.메서드명();
		String str5 = String.valueOf(100);
		System.out.println("정수를 문자열로 변환 : " + str5);
		System.out.println("-----------------");
		
		String a = new String("java ");
		String b = new String(" , Programming ");
		
		//문자열 중에서 1개만 가져오기
		System.out.println("인덱스 위치 번호는 0부터 시작한다.");
		System.out.println( a + "1번째 문자 가져오기 : " + a.charAt(1));
		System.out.println("-----------------");
		
		System.out.println("=== String.format() 메서드 ===");
		String str6 = new String("Have a good time");
		
		System.out.println("str6 = " + str6);
		System.out.println("-----------------");
		
		//형식)String str1 = String.format(“출력서식지정", 변수명);
		//문자열 : %s / 정수 : %d / 실수 : %f
		
		String str7 = String.format("%30s", str6);
		System.out.println("str7 = " + str7);
		System.out.println("-----------------");
		
		//숫자 표시 형식 설정 : 정수 3자리마다 콤마 표시(1,000,000) ->%d
		int number = 123456789;
		String str8 = String.format("%,d", number);
		System.out.println("str8 = " + str8);
		System.out.println("-----------------");
		
		//정수 3자리마다 콤마로 표시하고 소수점 둘째자리까지 표시(1,000.12) ->%f
		double number1 = 123456.789;
		
		String str9 = String.format("%,.2f", number1);
		System.out.println("str9 = " + str9);
		System.out.println("-----------------");
		System.out.println(String.format("%,.2f", number1));
		
		
		
		
		
		
		
		
		
	}

}
