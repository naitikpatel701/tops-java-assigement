package Thread;

import java.util.Scanner;

class Account{
	
	double balance;
	
	Account(double balance){
		
		this.balance=balance;
	}
	
	public boolean checkBalance(double amount) {
		
		boolean b=false;
		if(amount>balance) {
			
			b=false;
		}
		else {
			b=true;
		}
		return b;
	}
	
	public void withdeow(double amount) {
		
		balance =balance-amount;
		System.out.println("Current balance is :"+balance);
	}
}

class Customer extends Thread{
	
	String name;
	Account account;
	
	Customer(String name,Account account){
		
		this.name=name;
		this.account=account;
	}
	
	public void run(){
		
		synchronized (account) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter amount :"+name);
			double amount=sc.nextDouble();
			if(account.checkBalance(amount)) {
				account.withdeow(amount);
			}
			else {
				System.out.println("insuffient amount");
			}
		}
	}
}

public class Block_Sync {
	public static void main(String[] args) {
		
		Account ac=new Account(50000);
		
		Customer c1=new Customer("gopal", ac);
		Customer c2=new Customer("naitik", ac);
		
		c1.start();
		c2.start();
	}

}
