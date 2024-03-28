package test17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		//정수 배열에 스트림 사용
		int[] arr = {1,2,3,4,5};
		
		//합계 구하기
		int total = 0;
		for(int i = 0; i<=arr.length;i++) {
			total += i;
		}
		System.out.println(total);
		
		//또는
		int total1 = 0;
		for(int j : arr) {
			total1 += j;
		}
		System.out.println(total1);
		
		System.out.println("=====================");
		
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.println(s));
		
		System.out.println("=====================");
		int sumVal = Arrays.stream(arr).sum();
		System.out.println(sumVal);
		
		//count() 최종연산 메소드 long형으로 결과값을 돌려줌 -> 형 변환이 필요함
		int countVal = (int) Arrays.stream(arr).count();
		System.out.println(countVal);
		
		Object avgVal = Arrays.stream(arr).average();
		System.out.println(avgVal);
		
		System.out.println("=====================");
		IntStream intstream2 = IntStream.of(1,2,3,4,5);
		intstream2.forEach(s -> System.out.println(s));
		
		System.out.println("=====================");
		IntStream intstream3 = IntStream.range(1,10);
		intstream3.forEach(s -> System.out.println(s)); //1~9까지
		
		System.out.println("=====================");
		IntStream intstream4 = IntStream.rangeClosed(1,10);
		intstream4.forEach(s -> System.out.println(s)); //1~10까지
		
	}

}
