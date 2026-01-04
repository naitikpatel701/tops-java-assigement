package assignment;

class Test{
	 synchronized public void show() {
	
		try {
			System.out.println("Waiting...");
			wait();
			System.out.println("Resumed...");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	 synchronized void display() {
			
		 System.out.println("notifying...");
		 notify();
		}
}

public class A035_TheradMethod {
	public static void main(String[] args) {
		
		Test t= new Test();
		
		new Thread(()-> t.show()).start();
		new Thread(()-> t.display()).start();
	}

}
