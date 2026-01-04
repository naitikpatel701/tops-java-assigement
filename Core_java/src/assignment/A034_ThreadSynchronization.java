package assignment;

class Calc{
	
	synchronized void table(int number) {
		
       for(int i=1; i<=10; i++) {
    	   
    	   System.out.println( Thread.currentThread().getName()+" "+ number*i);
       }
	}
}

class test extends Thread{
	
	Calc c;

	public test(Calc c) {
		
		this.c = c;
	}
	
	@Override
	public void run() {
		
		c.table(5);
	}
	
}

public class A034_ThreadSynchronization {
	public static void main(String[] args) {
		
		Calc c=new Calc();
		
		test t1=new test(c);
		test t2=new test(c);
		test t3=new test(c);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
