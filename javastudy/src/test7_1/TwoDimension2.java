package test7_1;

import java.util.Arrays;

public class TwoDimension2 {

	public static void main(String[] args) {
		
		
		//2차원 배열 예제
		//학점의 합계와 평균 구하기
		
		double score[][] = {
				
				{3.3, 3.4}, //1학년 1,2 학기 평점-> score[0]행
				{3.5, 3.6}, //2학년 1,2 학기 평점-> score[1]행
				{3.7, 4.0}, //3학년 1,2 학기 평점-> score[2]행
				{4.1, 4.2}, //4학년 1,2 학기 평점-> score[3]행
		};
		
		System.out.println("배열 요소값 츨력 = " + Arrays.deepToString(score));
		System.out.println("---------------");
		
		double sum = 0; 
		int g; //초기화 변수 ->바깥쪽 for문 초기화 변수 (행(학년) 초기화 변수)
		int s; //초기화 변수 ->안쪽 for문 초기화 변수 (열(학기) 초기화 변수)
		
		for (g = 0 ; g < score.length ; g++ ) { //각 학년별로 반복(행의 개수)
			
			System.out.println("학년 구분 --------" + (g + 1) + "학년");
			
			//                                   2
			for ( s = 0 ; s < score[g].length ;s++ ) { // 각 학년의 학기별로 반복(열의 개수)
			
				System.out.print(score[g][s]);
				System.out.println(" -- score[" + g + "][" + s + "]");
				sum += score[g][s] ; //sum = sum + score[g][s] ; 전체 평점의 합
			}
			
			
			
		}
		System.out.println("4학년 전체 평점 합계 = " + sum);
		System.out.println("4학년 전체 평점 평균 = " + sum / 8.0);
		System.out.println("-------------------");

	}

}
