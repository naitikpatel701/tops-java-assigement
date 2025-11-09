package OOPs;

class Base{
	
	private void test() {
		
		System.out.println("running class Base test");
	}
}

class derived extends Base{
	
	//@override
	public void test() {
		System.out.println("Running class derived test");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		
		derived d=new derived();
		d.test();
	}
}
