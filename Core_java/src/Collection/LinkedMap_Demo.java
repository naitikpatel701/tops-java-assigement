package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMap_Demo {
	public static void main(String[] args) {
		
	LinkedHashMap<String,Integer> map=new LinkedHashMap();
		
		map.put("java", 50);
		map.put("php", 51);
		map.put("Android",49);
		map.put("python", 45);
		map.put("java", 52);
		
		System.out.println(map.get("java"));
		
		System.out.println(map);
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
