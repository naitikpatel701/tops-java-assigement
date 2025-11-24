package assignment;

class X{
	
	X(){
		System.out.println("running X class constructor");
	}
	
	public void display() {
		System.out.println("running X class mathod");
	}
}


class Y extends X{
	
	Y(){
		super();
	}
	
	@Override
	public void display() {
		
		super.display();
	}
}
public class Super_KeyWord {
	public static void main(String[] args) {
		
		Y y=new Y();
		y.display();
	}

}
