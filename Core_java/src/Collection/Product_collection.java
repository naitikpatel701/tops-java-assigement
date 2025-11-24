package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Product_collection {
	public static void main(String[] args) {
		
		
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(new Product(10, "shoes", 2500, 5));
		al.add(new Product(20, "sandal", 2000, 4));
		al.add(new Product(30,"sallipers" , 1500, 3));
	
	    Iterator<Product> itr= al.iterator();
	          while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
