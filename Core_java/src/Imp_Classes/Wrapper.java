package Imp_Classes;

public class Wrapper {
	public static void main(String[] args) {
		
		int i=10;
		
		//boxing
		Integer i1= new Integer(i);
		
		//auto boxing
		Integer i2=i;
		
		Integer a=15;
		
		//unboxing
		int a1=a.intValue();
		
		//auto unboxing
		int a2=a; 
		
		System.out.println(i);
		System.out.println(a);
		
		int k=454545;
		
		Integer k1=k;
		int j=k1.toString().length();
		System.out.println(j);
	}

}
