package Imp_Classes;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		
	String x="abcd";
	String y="bcad";
	
	char k[]=x.toCharArray();
	for (int i = 0; i < k.length; i++) {
	//	System.out.print(k[i]);
		
		Arrays.sort(k);
		System.out.print(k[i]+" ");
	}
	System.out.println();
	
	char l[]=y.toCharArray();
	for (int i = 0; i < l.length; i++) {
		//System.out.print(l[i]);
		
		Arrays.sort(l);
		
		System.out.print(l[i]+" ");
	}
	System.out.println();
	
	   boolean resulat=Arrays.equals(k, l);
	     
	     if(resulat) {
	    	 System.out.println("String have anagram ");
	     }
	     else {
	    	 System.out.println("String have not anagram");
	     }
	}
}
