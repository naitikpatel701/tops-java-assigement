package Exception;

class InsufficentFoundAmount extends Exception{
	
	double d;
	
	 public InsufficentFoundAmount(double d) {
		 
		super(String.format("your account need more : %s",d));
		this. d=d;
		
	}
	
}

class Bank{
	
	double balance;
	
	public void checkBalancee() {
		
		System.out.println("Cureent balance is :"+balance);
	}
	
	public void deposite(double amt) {
		
		balance+=amt;
	}
	
	public void Withdrew(double amt) throws InsufficentFoundAmount{
		
		if(amt>balance) {
			
			throw new InsufficentFoundAmount(amt-balance);
			
		}
		else {
			
			balance-=amt;
		}
		
	}
}

public class Coutume_Exception {
	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.checkBalancee();
		b.deposite(5000);
		b.deposite(2000);
		b.checkBalancee();
		try {
			b.Withdrew(70000);
		} catch (InsufficentFoundAmount e) {
		
			e.printStackTrace();
		}
		b.checkBalancee();
		
	}
}
