package assignment;

class Demo1{
	
	public void display() {
	  
		System.out.println("running Demo class mathod");
	}
}

class derived extends Demo1{
	
	public void sample() {
		
     System.out.println("running derived class mathod");
	}
}

public class Inhertance_Demo {
	public static void main(String[] args) {
		
		derived d=new derived();
		d.display();
		d.sample();
	}

}
