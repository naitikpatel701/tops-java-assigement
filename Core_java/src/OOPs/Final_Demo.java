package OOPs;

/*final*/class X{
	
	/*final*/public void test() {
		
		
	}
}

class Y extends X{
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
}

public class Final_Demo {
	public static void main(String[] args) {
		
		final int a=20;
		// a=200;
		System.out.println(a);
	}

}
