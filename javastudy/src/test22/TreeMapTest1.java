package test22;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapTest1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "ㄱ");
		treeMap.put(3, "ㄴ");
		treeMap.put(2, "ㄷ");
		treeMap.put(4, "ㄹ");
		treeMap.put(5, "ㅁ");
		
		System.out.println(treeMap);
		
		System.out.println("============================");
		
		System.out.println(treeMap.get(1)); //key=1인 value
		System.out.println(treeMap.firstEntry()); //첫번째 Entry 가져오기
		System.out.println(treeMap.lastEntry()); //마지막 Entry 가져오기
		System.out.println(treeMap.firstKey()); //첫번째 키 가져오기
		System.out.println(treeMap.lastKey()); //마지막 키 가져오기

		System.out.println("============================");
		
		treeMap.remove(5);
		System.out.println(treeMap);
		
		System.out.println("============================");
		
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			Integer key = ir.next();
//			System.out.println(key); //key만 가져오기
//			System.out.println(ir.next());
			System.out.println(key + treeMap.get(key));
		}
		
		System.out.println("============================");
		
		
		Iterator<Entry<Integer,String>> ir1 = treeMap.entrySet().iterator();
		while(ir1.hasNext()) {
			Map.Entry<Integer, String> entry = ir1.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());	
		}
		
		
	}

}
