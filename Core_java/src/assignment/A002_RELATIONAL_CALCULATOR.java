package assignment;

import java.util.Scanner;

public class A002_RELATIONAL_CALCULATOR {
	
public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in); 
		
		System.out.println("enter the num1");
		int num1=sc.nextInt();
		System.out.println(num1);
		
		System.out.println("enter the num2");
		int num2=sc.nextInt();
		System.out.println(num2);
		
		System.out.println("enter the operator'+','-','*','/','%'");
		char op=sc.next().charAt(0);
		System.out.println(op);
		
		if(num1==num2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if(num1<num2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if (num1>num2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if (num1!=num2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if (num1<=num2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if (num1>=num2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
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
					System.out.println("invalied operator");
				
	}
		         System.out.println("result"+result);
	}
}
