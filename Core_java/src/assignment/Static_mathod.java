package assignment;

class Demo{
	
	static int x=10;
	
    static void show() {
		
    	System.out.println("enter the value of x :"+x);
	}
}

public class Static_mathod {
	public static void main(String[] args) {
		
		Demo d=new Demo();
		
		d.show();
		
		System.out.println("static varibale x : "+d.x);
		
	}

}
