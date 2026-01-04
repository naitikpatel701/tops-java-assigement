package assignment;

import java.util.HashMap;
import java.util.Map.Entry;

public class A040_HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("java", 50);
		map.put("python", 51);
		map.put("php", 55);
		
		System.out.println(map.get("java"));
		
		for(Entry<String,Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
