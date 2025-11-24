package Imp_Classes;

import java.util.Arrays;


public class Sort {
	public static void main(String[] args) {
		
		
		String s="keep";
		
		char a[]=s.toCharArray();
		for (int i = 0; i < a.length; i++) {
		//	System.out.print(a[i]);
			
			Arrays.sort(a);
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
	
	String k="peek";
	
	char b[]=k.toCharArray();
	for(int j=0; j<b.length;j++) {
		//System.out.print(b[j]);
		
		Arrays.sort(b);
		
		System.out.print(b[j]+" ");
	}
     System.out.println();
     
     boolean resulat=Arrays.equals(a, b);
     
     if(resulat) {
    	 System.out.println("String have anagram ");
     }
     else {
    	 System.out.println("String have not anagram");
     }
}
}
