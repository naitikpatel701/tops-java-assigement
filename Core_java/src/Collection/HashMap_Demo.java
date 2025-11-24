package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Demo {
	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap();
		
		map.put("java", 50);
		map.put("php", 51);
		map.put("Android",49);
		map.put("python", 45);
		map.put("java", 52);
		
		System.out.println(map.get("java"));
		
		//System.out.println(map);
		//Set s=map.entrySet();
		//Iterator itr=s.iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		//}
		
		for(Entry<String,Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
