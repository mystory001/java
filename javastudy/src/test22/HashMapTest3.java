package test22;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest3 {

	public static void main(String[] args) {

		Map map = new HashMap();
		
		//key
		int[] num = {19921213,19940831,19941104,19971222,20010212}; 
		//value		
		String[] dontMint = {"박순영","정은주","박재환","김동희","박재욱"};
		
//		map.put(dontMint, num);
		
		for(int i = 0 ; i < num.length; i++) {
			map.put(dontMint[i], num[i]);
		}
		
		System.out.println(map);
	}

}
