package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Demo {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map=new TreeMap<String, Integer>();
		map.put("java", 21);
		map.put("python", 22);
		map.put("php", 51);
		map.put("Android",49);
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
