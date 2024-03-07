package test7;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		//배열(Array) : 같은 종류(자료형)의 데이터들이 순차적으로 저장되어 있는 것이다.
		//변수 형식으로 사용
		int student1 = 100;
		int student2 = 90;
		int student3 = 85;
		
		System.out.println("student1 = " + student1);
		System.out.println("student2 = " + student2);
		System.out.println("student3 = " + student3);
		System.out.println("--------------");
		
		//배열 형식으로 사용 : 여러개의 메모리공간에 담긴 데이터를 하나의 변수로 묶어서 관리한다.
		//배열의 생성
		//형식) 자료형 변수명[] = new 자료형[개수];
		
		int a = 10;
		
		//int student4[];
		//student4 = new int[3];
		
		int [] student4 = new int[3];
		
		//인덱스(index) : 배열의 요소 공간마다 붙여진 순서를 나타내는 번호 ( 0번부터 ~ n-1)
		//10개 (인덱스 순서 : 0 ~ 9) ** 0번 부터 시작한다.!!!
		//인덱스 연산자 ([]) : 배열을 생성하고 배열 요소에 접근한다.
		//접근 형식) 변수명(배열명)[인덱스번호];
		System.out.println("student4[0] = " + student4[0]);
		System.out.println("student4[1] = " + student4[1]);
		System.out.println("student4[2] = " + student4[2]);
		System.out.println("--------------");
		
		//배열 요소에 데이터값 넣기(수정)
		student4[0] = 100;
		student4[1] = 90;
		student4[2] = 85;
		
		System.out.println("student4[0] = " + student4[0]);
		System.out.println("student4[1] = " + student4[1]);
		System.out.println("student4[2] = " + student4[2]);
		System.out.println("--------------");
		
		student4[0] = student4[1] + student4[2];
		System.out.println("student4[0] = " + student4[0]);
		System.out.println("--------------");
		
		//배열의 초기화 (배열을 생성함과 동시에 데이터 값 넣어주기)
		//형식1) 자료형 변수명[] = new 자료형[개수 no!!!!] { 데이터값을 콤마로 구분};
		
		//                                [0]   [1]  [2]
		int stu[] = new int[] {100, 90, 85};
		System.out.println("stu[0] = " + stu[0]);
		System.out.println("stu[1] = " + stu[1]);
		System.out.println("stu[2] = " + stu[2]);
		System.out.println("--------------");
		
		
		//형식2) 자료형 변수명[] = { 데이터값을 콤마로 구분};
		 //                   [0]   [1]  [2]
		int [] stu1 = {200, 300, 400};
		
		for (int i = 0;  i < 3 ; i++) {
			
			System.out.print("stu1[" + i + "] = ");
			
			//        				    stu1[2]
			//        				    stu1[1]
			//                            stu1[0]
			System.out.println(stu1[i]);
		}
		System.out.println("--------------");
		
		//형식3) 형식2번과 다르게 지정하기 : 배열 변수를 선언하고 초기값을 따로 생성해서 넣어주는 경우는 new int[] 생략되지 않음!!!
		int [] stu2;
		stu2 = new int[]{400,500,600,700,800,900};
		
		//배열 요소값을 한번에 문자열로 표시해주는 메서드로 출력
		//Arrays.toString(배열명);
		System.out.println("stu2[] = " + Arrays.toString(stu2));
		System.out.println("--------------");
		
		//stu2배열의 개수를 자동으로 계산하기
		//형식) 배열명.length -> 자동으로 배열의 개수를 반환한다.
		int n = stu2.length;
		System.out.println("stu2배열의 개수 = " + n);
		System.out.println("stu2배열의 개수 = " + stu2.length);
		System.out.println("--------------");
		
		//p202 예제1)
		
		int num [] = new int[] {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0;  i < num.length ; i++) {
			
			System.out.print("num[" + i + "] = ");
			System.out.println(num[i]);
		}
		System.out.println("--------------");
		
		System.out.println("num[] = " + Arrays.toString(num));
		
		//p203 예제2)
		//                                [0] [1] [2] [3]
		int []arr = new int[] { 3,   6,   9, 12 };
		System.out.println("arr[0] + 2 = "  +  (arr[0] + 2));
		System.out.println("arr[0] + arr[2] = "  +  (arr[1] + arr[2]));
		System.out.println("arr[4] - 3 = "  +  (arr[4] - 3)); //배열의 인덱스 볌위를 벗어나면 오류 발생시키고 멈춤!!!
		System.out.println("--------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
