package assignment;

import java.util.Scanner;

class Max{
	
	public int max(int a,int b,int c) {
		return Math.max(a, Math.max(b, c));
		
	}
}

public class A011_Maximum_Number {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter three number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		Max m=new  Max();
		
		System.out.println("maximum :"+m.max(x, y, z));
	}

}
