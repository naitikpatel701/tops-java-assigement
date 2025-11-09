package Thread;

class Demo extends Thread{
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
public class Join_Demo {
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		Demo d4=new Demo();
		
		d1.start();
		d2.start();
		try {
			d2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d3.start();
		d4.start();
	}

}
