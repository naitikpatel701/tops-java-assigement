package assignment;

class mathod{
	
	public void sum(int a,int b) {
		
		int r=a+b;
		System.out.println("sum :"+ r);
	}
	
	public void sum(double a,int b) {
		
		double r=a+b;
		System.out.println("sum :"+ r);
	}
	
	public void sum(double a,double b) {
		
		double r=a+b;
		System.out.println("sum :"+ r);
	}
	
	public void sum(int a,int b,int c) {
		
		int r=a+b+c;
		System.out.println("sum :"+ r);
	}
}

public class Mathod_Overloading {
	public static void main(String[] args) {
		
		mathod m=new mathod();
		
		m.sum(10,20);
		m.sum(10.5, 5);
		m.sum(2.5, 5.5);
		m.sum(10, 52, 21);
	}

}
