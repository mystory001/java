package test7_1;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
	
		//배열 생성 : 초기값은 0으로 지정되어 있다.		
		double[] data = new double[5];
		System.out.println("data[] = " + Arrays.toString(data));
		System.out.println("-----------------");
		
		data[0] = 10.0;  //첫 번째 요소에 값 10.0 대입
		data[1] = 20.0;  //두 번째 요소에 값 20.0 대입
		data[2] = 30.0;  //세 번째 요소에 값 30.0 대입
		System.out.println("-----------------");
		
		//배열의 개수를 자동으로 구하기 : 형식)배열명.length
		System.out.println(" data 배열의 개수를 자동으로 구하기 : data.length= " + data.length);
		System.out.println("-----------------");
		
		//					5 < 5 : 조건이 거짓 -> for문 수행하지 않고 빠져 나간다.!!!
		//      				4 < 5
		//                     3 < 5	
		//                     2 < 5		
		//                     1 < 5
		 //                    0 < 5       5      
		for ( int i = 0 ; i < data.length ; i++) {
			
			//          							    	4			
			//          							    	3
			//          							    	2
			//                                           1
			//                                           0
			System.out.print("data[" + i + "] = ");

			//			 				data[4]		
			//			 				data[3]		
			//         					 data[2]			
			//         					 data[1]
			//                             data[0]
			System.out.println(data[i]);
			
		}
		
		System.out.println("-----------------");
		
		System.out.println("data[] = " + Arrays.toString(data));
		System.out.println("-----------------");
		
		
		//배열의 유효한 요소값만 출력하기
		
		double[] data1 = new double[5];
		int size = 0; //유효한 값이 저장된 배열 요소 개수를 저장할 변수 선언
		
		data1[0] = 10.0;  size++; //요소값을 저장한 후 size 변수값 증가
		data1[1] = 20.0;  size++; //요소값을 저장한 후 size 변수값 증가
		data1[2] = 30.0;  size++;  //요소값을 저장한 후 size 변수값 증가

		System.out.println("size = " + size);
		System.out.println("-----------------");
		
		//                            3
		for ( int i = 0 ; i < size ; i++) { //유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
			System.out.print("data1[" + i + "] = ");
			System.out.println(data1[i]);
			
		}
		System.out.println("-------------");
		
		//문자 저장 배열 만들기 : A ~ Z까지
		
		char [] alphabets = new char[26];
		char ch = 'A';
		//char ch = 65;
		//int ch = 65;
		System.out.println("alphabets[] = " + Arrays.toString(alphabets));
		System.out.println("-----------------");
		
		/*
		//알파벳 문자 'A' ~ 'Z' 까지 alphabets[i] 배열 요소에 계속 대입하는 for문
		for ( int i = 0 ; i < alphabets.length; i++, ch++) { //유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
			//alphabets [1] = 'B'		
			//alphabets [0] = 'A'
			alphabets[i] = ch;//문자를( 아스키 값으로) 각 요소에 저장
		}
	 
		//알파벳 문자 'A' ~ 'Z' 까지 alphabets[i] 배열 요소에 대입된 데이터값 출력하는 for문
		for ( int i = 0 ; i < alphabets.length; i++) { //유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
			
			//                            alphabets [0]                            
			System.out.println(alphabets[i] + " , " + (int)alphabets[i]);
			
		}
		System.out.println("alphabets[] = " + Arrays.toString(alphabets));
		System.out.println("-----------------");
		*/
		
		for ( int i = 0 ; i < alphabets.length; i++) {
			
			alphabets[i] = ch;//문자를( 아스키 값으로) 각 요소에 저장
			ch++;
			System.out.println(alphabets[i] + " , " + (int)alphabets[i]);
			
		}
		
	}

}
