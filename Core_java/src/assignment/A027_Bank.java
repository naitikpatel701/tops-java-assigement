package assignment;

abstract class Account{
	
	double balance;
	public void checkbalance() {
		
		System.out.println("your current balance is :"+balance);
	}
	
	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
}

class Saving extends Account{
	
	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
	    balance+=amount;	
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>balance) {
			System.out.println("insuffcient amount");
		}
		else {
			balance-=amount;
		}
	}
}

class Loan extends Account{
	
	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
	  	balance-=amount;
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
	    balance+=amount;	
	}
}

public class A027_Bank {
	public static void main(String[] args) {
		
		Saving s=new Saving();
		s.checkbalance();
		s.deposite(10000);
		s.checkbalance();
		s.withdraw(5500);
		s.checkbalance();
		
		System.out.println("********************");
		
		Loan l=new Loan();
		l.checkbalance();
		l.deposite(50000);
		l.checkbalance();
		l.withdraw(25000);
		l.checkbalance();
	}
	}

