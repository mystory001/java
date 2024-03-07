package test7_1;

public class EnhencedForLoop {

	public static void main(String[] args) {
	
		//향상된 for문 
		//for ~ each문 : 배열 전용 for문
		//형식) for (배열 요소값을 가져와서 저장할 변수명 : 배열명) { 반복 출력 내용 }
		
		String [] strArray = {"Java", "Android", "C", "Javascript", "Python"};

		for (int i = 0 ; i < strArray.length ; i++) {
			System.out.print("strArray[" + i + "] = ");
			System.out.println(strArray[i]);
		}		
		System.out.println("------------------");
		
		for (String s : strArray) {
			System.out.println("s = " + s); 			
		}
		System.out.println("------------------");
		
		int[] numArray = {1,2,3,4,5,6,7,8,9,10};
		
		for (int k : numArray) {
			System.out.println(k);
		}
		System.out.println("-----------------");
		
		
		
	}

}
