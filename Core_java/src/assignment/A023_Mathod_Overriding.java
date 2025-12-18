package assignment;

class Vehicle1{
	
		public void run() {
			
			System.out.println("Vehicle is running");
		}
}

class Car1 extends Vehicle1{
	
	@Override
	public void run() {
		
		System.out.println("car is running smoothly");
	}
}
public class A023_Mathod_Overriding {
	public static void main(String[] args) {
		
		Car1 c=new Car1();
		
		c.run();
	}

}
