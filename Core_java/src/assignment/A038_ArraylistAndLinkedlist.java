package assignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class A038_ArraylistAndLinkedlist {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("php");
		al.add(null);
		
		for(String s:al) {
			System.out.println(s);
		}
			
			LinkedList<Integer> l= new LinkedList<Integer>();
			l.add(10);
			l.add(30);
			l.add(60);
			l.add(5656);
			
			for(int i:l) {
				System.out.println(i);
			}
		
	}

}
