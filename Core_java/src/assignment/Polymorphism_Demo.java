package assignment;

class Bank{
	
	public double getInterestRate() {
		
		return 5.0;
	}
}

class SBI extends Bank{
	
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 7.2;
	}
}

class HDFC extends Bank{

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 6.5;
	}	
}

public class Polymorphism_Demo {
	public static void main(String[] args) {
		
		Bank b=new SBI();
		System.out.println("SBI Interset Rate :"+b.getInterestRate());
		
		Bank b1=new HDFC();
		System.out.println("HDFC Interset Rate :"+b1.getInterestRate());
	}

}
