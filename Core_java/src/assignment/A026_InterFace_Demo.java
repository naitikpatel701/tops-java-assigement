package assignment;

interface I1{
	
	public static final int a=10;
	void display();
}

interface I2{
	
	public void display();
}

class InterImpl implements I1,I2{

	@Override
	public void display() {
		
		System.out.println("Display Calling");
		System.out.println(a);
		
	}
	
}

public class A026_InterFace_Demo {
	public static void main(String[] args) {
		
		InterImpl i=new InterImpl();
		i.display();
	}

}
