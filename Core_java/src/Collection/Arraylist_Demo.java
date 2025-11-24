package Collection;

import java.util.ArrayList;

public class Arraylist_Demo {
	public static void main(String[] args) {
		
		//dafault size :10
		//newsize=oldsize*3/2+1
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("java");
		al.add("php");
		al.add("android");
		al.add("SQL");
		al.add("java");
		al.add(null);
		//al.add(1,"oracle");
		//al.set(1, "oracle");
	//	al.remove(1);
		//System.out.println(al.size());
		//System.out.println(al.get(0));
		//System.out.println(al.contains("SQL"));
		
		for(String s:al) {
			
			System.out.println(s);
		}
	}

}
