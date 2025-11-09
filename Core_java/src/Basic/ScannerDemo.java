package Basic;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of i");
		int i=sc.nextInt();
		System.out.println("enter the value of j");
		int j=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter fullname");
		//sc.nextline();
		String fullname=sc.nextLine();
		
		System.out.println(i+j);
		System.out.println(name);
		System.out.println(fullname);
	}

}
