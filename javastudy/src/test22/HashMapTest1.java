package test22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		
		//Map 인터페이스로 구현한 클래스 : HashMap 클래스
		//Map : key-value 값으로 구성되어 있음
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		//데이터 저장하기 : put(K key, V value) : Associates the specified value with the specified key in this map.
		hashMap.put("java", "자바");
		hashMap.put("javascript", "자바스크립트");
		hashMap.put("pythone", "파이썬");
		hashMap.put("ruby", "루비");
		System.out.println(hashMap);
		
		System.out.println("=======================");
		
		//key가 있는지 확인 : containsKey(Object key)
		System.out.println("'java' key 여부 : "+hashMap.containsKey("java"));
		
		System.out.println("=======================");
		
		//value가 있는지 확인 : containsValue(Object value)
		System.out.println("'java' value 여부 : " + hashMap.containsValue("java"));
		
		System.out.println("=======================");
		
		//key로 value 확인(Map의 기본 구조): get(Object key) 
		System.out.println("java key의 value : " + hashMap.get("java"));
		System.out.println("javascript key의 value : " + hashMap.get("javascript"));
		
		System.out.println("=======================");
		
		//map의 크기 : size()
		System.out.println("map의 크기" + hashMap.size());
		
		System.out.println("=======================");
		
		//Map에서 데이터를 한번에 조회
		//1. keySet() : Returns a Set view of the keys contained in this map.
		Set<String> keys = hashMap.keySet();
		for(String a : keys) {
			System.out.println(a);
		}
		
		System.out.println("=======================");

		//2. Iterator
		Iterator<String> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			String a = ir.next();
			System.out.println(a);
		}
		
		System.out.println("=======================");
		
		//value만 가져오기 values() : Returns a Collection view of the values contained in this map.
		Collection values = hashMap.values();
		
		System.out.println("value만 가져오기 values()");
		Iterator<String> ir1 = values.iterator();
		while(ir1.hasNext()) {
			String a = ir1.next();
			System.out.println(a);
		}
		
		System.out.println("=======================");
		//3. key, value를 한 번에 들고 오기 Set<Map.Entry<K,V>> entrySet() : Returns a Set view of the mappings contained in this map.
		//Map.Entry 인터페이스는 Map 객체의 키와 값에 접근할 수 있도록 해주는 메소드를 가지고 있음(getKey(), getValue()). 키와 값을 추출(entrySet())
		
		Set set = hashMap.entrySet();
		
		Iterator ir2 = set.iterator();
		while(ir2.hasNext()) {
			
			Map.Entry<String, String> entry = (Entry<String, String>)ir2.next();
//			System.out.println(entry.getKey() + " : " + entry.getValue());	
			String entryKey = entry.getKey();
			String entryValue = entry.getValue();
			System.out.println("entryKey = " + entryKey);
			System.out.println("entryValue = " + entryValue);
			
		}
		
	}

}
