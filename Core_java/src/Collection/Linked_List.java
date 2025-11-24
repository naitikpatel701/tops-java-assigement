package Collection;

import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(30);
		l.add(60);
		l.addFirst(5656);
		
		for(int i:l) {
			System.out.println(i);
		}
	}

}
