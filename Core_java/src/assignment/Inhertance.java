package assignment;

class A{
	
	int id=10;
    public void display() {
	
    	System.out.println("runing a class display");
	} 
}
    
class B extends A{
	
	int id =15;
	public void sample() {
	
         int id=20;
         System.out.println(id);
         System.out.println(this.id);
         System.out.println(super.id);
	}
}


public class Inhertance {
	public static void main(String[] args) {
		
		B b=new B();
		
		b.display();
		b.sample();
		
		System.out.println(new B() instanceof A);
		System.out.println(new A() instanceof B);
	}

}
