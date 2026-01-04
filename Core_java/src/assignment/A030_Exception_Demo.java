package assignment;

public class A030_Exception_Demo {
	public static void main(String[] args) {
		
		System.out.println("Program started...");
		
		try {
				
				int a[]=new int[5];
				a[5]=46;
				
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
		
	}
		finally {
			System.out.println("finally block always exucate");
		}
		System.out.println("Program ended...");
	}
}
