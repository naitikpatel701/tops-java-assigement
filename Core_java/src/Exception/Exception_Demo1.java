package Exception;

public class Exception_Demo1 {
	public static void main(String[] args) {
		
		System.out.println("program started...");
		
		try {
			
			int a[]=new int[5];
			a[5]=45;
			System.out.println(a[5]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		
		}
		catch (Exception e) {
		    
			e.printStackTrace();
		}
		
		System.out.println("program ended...");
	}

}
