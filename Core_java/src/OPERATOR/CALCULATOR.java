package OPERATOR;

import java.util.Scanner;

public class CALCULATOR {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		char choice;
		
        do {
		System.out.println("enter the num1");
		double num1 =sc.nextDouble();
		System.out.println(num1);
		
		System.out.println("enter the num2");
		double num2=sc.nextDouble();
		System.out.println(num2);
		
		System.out.println("enter the operator'+','-','*','/','%'");
		char op=sc.next().charAt(0);
		System.out.println(op);
		
		double result=0;
		switch (op){
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num2 !=0 ? num1/num2:0;
				break;
			case'%':
				result=num2 !=0 ? num1%num2:0;
				break;
				
				default:
				System.out.println("invalid operator");
		}
		
				System.out.println("result:"+ result);
				
		System.out.println("do you want to continue(y/n)");
		 choice=sc.next().toLowerCase().charAt(0);
		 System.out.println(choice);
		
	}while( choice == 'y');
        
		
}

}
