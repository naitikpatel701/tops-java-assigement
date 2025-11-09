package OOPs;

class DEMO{
	
	public void display() {
		System.out.println("running display...");
	}
	
	public void add(int a,int b) {
		System.out.println("addition is :"+(a+b));
	}
	
	public String massage() {
		return "Hello  naitik";
	}
	
	public int square(int i) {
		return i*i;
	}
	
     public void addArray(int a[]) {
    	 int sum=0;
    	 for (int i = 0; i < a.length; i++) {
		    sum+=a[i];	
		}
    	 System.out.println("sum :"+sum);
     }
     public int[] revArray(int a[]) {
    	 int b[]= new int[a.length];
    	 for (int i = 0; i < b.length; i++) {
			b[(a.length-1)-i]=a[i];
		}
    	 return b;
     }
     public void rendom(int...a) {
    	 for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
     }
	
}

public class Method_manipulction {
	
public static void main(String[] args) {
		
		DEMO d=new DEMO();
		d.display();
		d.add(150,150);
		
		String s=d.massage();
		System.out.println("massage is :" +s);
		System.out.println("massage is :" +d.massage());
		
		System.out.println("square is :" +d.square(20));
		
		int a[]= {10,20,30,45,50};
		int b[]= {1,2,6,45,89};
		d.addArray(b);
		
		System.out.println("*************************");
		
		int k[]=d.revArray(b);
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);	
		}
		d.rendom(10,20,30,40,50);
	}

}
