package assignment;

import java.util.Scanner;

public class A005_Switch_case {
	public static void main(String[] args) {
		
	int chioce=0;
	do {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter chioce");
	 chioce=sc.nextInt();
	 
	switch(chioce) {
	case 0:
		System.out.println("exit");
		break;
	case 1:
		System.out.println("gujarati");
		break;
	case 2:
		System.out.println("hindi");
		break;
	case 3:
		System.out.println("maths");
		break;
	case 4:
		System.out.println("science");
		break;
		default:
			System.out.println("invalid input");
	}
	}while(chioce!=0);
}

}
