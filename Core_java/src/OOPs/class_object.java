package OOPs;

class pen{
	
	int price=10;
	String color="red";
	
	public void toWrite() {
		System.out.println(price+" "+color);
	}
}

public class class_object {
	
	public static void main(String[] args) {
		pen p1=new pen();
		p1.price=65;
		p1.toWrite();
		
		pen p2=new pen();
		p2.toWrite();
		
	}
}
