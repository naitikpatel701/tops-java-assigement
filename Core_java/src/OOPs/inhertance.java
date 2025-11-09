package OOPs;

class A{
	
	int id=10;
	public void display() {
		System.out.println("running class A display");
	}
}

//sub/child/derived
class B extends A{
	
	int id=65;
	public void sample() {
		int id =98;
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
	}
}

public class inhertance {
    public static void main(String[] args) {
		
   
    	B b=new B();
    	
    	b.display();
  
    	b.sample();
    	
    	//upcasting
    	//B b =(B) new A();
    	
    	System.out.println(new B() instanceof A);
    	System.out.println(new A() instanceof B);
	}
}
