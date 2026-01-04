package assignment;

import java.util.Scanner;

public class A041_ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter i :");
		int i=sc.nextInt();
		System.out.println("enter j :");
		int j=sc.nextInt();
		System.out.println("enter name :");
		String name=sc.next();
		System.out.println("enter fullName :");
		String fullName=sc.nextLine();
		
		System.out.println(i+j);
		System.out.println(name);
		System.out.println(fullName);
	}

}
