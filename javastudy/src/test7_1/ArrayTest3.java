package test7_1;

import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
	
		/*
		//예제
		//시험 점수의 합계와 평균 구하기
		//                   [0]  [1]  [2] [3] [4]
		int [] stu = { 100, 95, 90, 88, 93, 100,100 };
		
		int sum = 0; //합계
		double avg = 0.0; //평균
		
		
		sum = stu[0] + stu[1] + stu[2] + stu[3] + stu[4];
		avg = sum  / 5.0;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		System.out.println("-----------------");
		
		
		//합계를 구하는 for문
		for( int i = 0 ; i < stu.length ; i++) {
			
			System.out.print("stu[" + i + "]=");
			System.out.println(stu[i]);
			sum = sum + stu[i];
			//System.out.println("sum = " + sum);			
		}
		System.out.println("-----------------");
		System.out.println("sum = " + sum);		
		
		//avg = sum  / 5.0;
		avg = sum  / (double)stu.length;
		System.out.println("avg = " + avg);
		*/
		
		//배열 다루기 : java.util.Arrays 클래스
		
		//배열 복사
		
		int [] arrInt = {10, 20, 30};
		
		for( int i = 0 ; i < arrInt.length ; i++) {
			
			System.out.print("arrInt[" + i + "]=");
			System.out.println(arrInt[i]);
		}
		System.out.println("-------------------");
		
		//배열 요소값 변경을 위한 for문
		for( int i = 0 ; i < arrInt.length ; i++) {
			
			//arrInt[i] = 0; //배열의 요소값을 모두 0으로 대입(수정)
			arrInt[i] = arrInt[i] * 10; //원래 가지고 있던 배열의 요소값에서 10을 곱한값으로 대입(수정)
			
			System.out.print("arrInt[" + i + "]=");
			System.out.println(arrInt[i]);
		}
		System.out.println("-------------------");
		
		System.out.println("arrInt[] = " + Arrays.toString(arrInt));
		System.out.println("-------------------");
		
		//얕은 복사(Shallow copy)와 깊은 복사(Deep copy)
		int a[] = {10,20,30,40,50,60}; //원본 배열
		int b[] = new int[6]; //복사 대상 배열
		//int b[] = a; //이런 코딩도 가능!!!
		
		System.out.println("a[] = " + a); //배열명은 heap영역에 찾아갈 주소를 담고 있다. I@7f63425a
		System.out.println("b[] = " + b); //배열명은 heap영역에 찾아갈 주소를 담고 있다. [I@36d64342
		System.out.println("-------------------");
		
		System.out.println("a[] = " + Arrays.toString(a));
		System.out.println("b[] = " + Arrays.toString(b));
		System.out.println("-------------------");
		
		//1.얕은 복사(Shallow copy) : 배열의 주소만 복사 -> 2개의 배열이 요소값을 공유해서 사용하게 된다.
		b = a; //a배열의 주소를 b배열에 대입(주소가 복사된다.) => 배열 요소값을 공유해서 사용한다.
		
		System.out.println("a[] = " + a); //배열명은 heap영역에 찾아갈 주소를 담고 있다. I@7f63425a
		System.out.println("b[] = " + b); //배열명은 heap영역에 찾아갈 주소를 담고 있다. [I@36d64342
		System.out.println("-------------------");
		
		System.out.println("a[] = " + Arrays.toString(a));
		System.out.println("b[] = " + Arrays.toString(b));
		System.out.println("-------------------");
		
		a[0] = 100;
		b[2] = 500;
		
		System.out.println("얕은 복사 a[] = " + a); //배열명은 heap영역에 찾아갈 주소를 담고 있다. I@7f63425a
		System.out.println("얕은 복사b[] = " + b); //배열명은 heap영역에 찾아갈 주소를 담고 있다. [I@36d64342
		System.out.println("-------------------");
		
		System.out.println("얕은 복사a[] = " + Arrays.toString(a));
		System.out.println("얕은 복사b[] = " + Arrays.toString(b));
		System.out.println("-------------------");
		
		//2.깊은 복사(Deep copy) : 배열 요소 하나 하나씩 가져다가 새로운 배열에 복사한다.
		//주로 java.util.Arrays 클래스의 메서드를 사용, System.arraycopy() 메서드를 사용
		// 배열의 일부분만 복사하는 형식으로 사용 -> 원본 배열과 대상 배열의 위치를 임의로 지정할 수 있다.
		//형식)arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//형식) System.arraycopy(원본배열명, 시작위치, 대상배열명, 복사될위치, 복사할개수)
		
		int f[] = {100,200,300,400,500,600};
		int g[] = new int [10];
		
		System.out.println("깊은 복사 f[] = " + f);
		System.out.println("깊은 복사 g[] = " + g);
		System.out.println("-------------------");
		
		System.out.println("깊은 복사f[] = " + Arrays.toString(f));
		System.out.println("깊은 복사g[] = " + Arrays.toString(g));
		System.out.println("-------------------");
		
		//형식) System.arraycopy(원본배열명, 시작위치, 대상배열명, 복사될위치, 복사할개수)
		//f배열의 0번째 위치부터 3개를 g배열의 3번째 위치부터 3개 복사
		System.arraycopy(f, 0, g, 3, 3);
		
		System.out.println("깊은 복사f[] = " + Arrays.toString(f));
		System.out.println("깊은 복사g[] = " + Arrays.toString(g));
		System.out.println("-------------------");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
