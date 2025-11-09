package Thread;

class Calc{
	
	synchronized public void table(int number) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+ number*i);
		}
	}
}

class test extends Thread{
	
	Calc c;
	test(Calc c){
		
		this.c=c;
	}
	public void run() {
		
		c.table(5);
	}
}

public class Method_Sync {
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
