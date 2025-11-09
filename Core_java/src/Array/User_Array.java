package Array;

import java.util.Scanner;

public class User_Array {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("enter the number of array arr[]");
		int n=sc.nextInt();
	    int[] arr=new int[n];
	    
             int a[] = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Enter value for index : "+i);
			a[i] = sc.nextInt();	
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
			
	}	
	}
