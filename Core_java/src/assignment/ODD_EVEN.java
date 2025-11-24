package assignment;

import java.util.Scanner;

public class ODD_EVEN {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println(num);
		
		if(num==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}


}
