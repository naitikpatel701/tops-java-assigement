package OOPs;

class Method{
	
	public void add(int a,int b) {
		
		int r=a+b;
		System.out.println("m1 :"+r);
	}
	
	public void add(double a,int b) {
		
		double r=a+b;
		System.out.println("m2 :"+r);
	}
	
	public void add(int a,int b,int c) {
		int r=a+b+c;
		System.out.println("m3 :"+r);
	}
	
	public void add(double a,double b) {
		
		double r=a+b;
		System.out.println("m4 :"+r);
	}
}

public class MethodOverLoading {
	public static void main(String[] args) {
		
		Method m=new Method();
		m.add(10, 52);
		m.add(5.5, 45);
		m.add(40, 60, 50);
		m.add(10.5, 42.8);
	}

}
