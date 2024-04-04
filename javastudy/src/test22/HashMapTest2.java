package test22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
//		== HashMap<String, String> map = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		map.put("민트", "좋아하시나요? 치약을 먹어?");
		map.put("탕수육", "은 당연히 찍먹이지");
		map.put("닭발", "징그러. 식감도 별로야");
		map.put("평양냉면", "흙탕물맛. 밍밍하고 무슨맛인지?");
		
//		System.out.println(map);
		
		while(true) {
			System.out.println("줘도 안먹을 음식을 선택하세요.");
			System.out.println("보기는 다음과 같습니다.");
			System.out.println("민트, 탕수육, 닭발, 평양냉면");
			System.out.println("프로그램을 종료하려면 quit를 누르세요.");
			
			String word = sc.nextLine();
			if(word.equals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//key와 일치하는 value값
			if(map.containsKey(word)) {
				System.out.println(word+" "+ map.get(word));
				System.out.println("=====================");
			} else {
				System.out.println("다시 입력해주세요.");
			}
			
		}
		
		
	}

}
