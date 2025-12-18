package assignment;

abstract class Abs{
	
	public abstract void display() ;
	
	public void show() {
		
		System.out.println("Runing show...");
	}
}

class AbsImpl  extends Abs{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display Calling...");
	}
	
}

public class A025_Abstract_Demo {
	public static void main(String[] args) {
		
		AbsImpl abs= new AbsImpl();
		abs.show();
		abs.display();
	}

}
