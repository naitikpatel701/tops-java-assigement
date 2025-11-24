package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(200);
		set.add(30);
		set.add(400);
		set.add(100);
		
	//	Iterator<Integer> itr=set.iterator();
		Iterator<Integer> itr=set.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
