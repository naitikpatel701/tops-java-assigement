package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vctor_Demo {
	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer>();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
