package Thread;

class sample{
	
}

class th1 extends sample implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

public class Runnable_Interface {
	public static void main(String[] args) {
		
		th1 t1=new th1();
		th1 t2=new th1();
		
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		
		th1.setName("a");
		th2.setName("b");
		
		th1.start();
		th2.start();
	}

}
