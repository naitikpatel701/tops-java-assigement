package assignment;

import java.util.HashSet;
import java.util.Iterator;

public class A039_RemoveDuplicate {
	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
