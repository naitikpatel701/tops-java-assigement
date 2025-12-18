package assignment;

class studentDetali{
	
	String name="naitik";
	int age=22;
	
	public void display() {
		System.out.println(name+" "+age);
	}
}

public class A007_Sudent2 {
      public static void main(String[] args) {
		
    	  studentDetali s1=new studentDetali();
    	  s1.display();
    	  
    	  studentDetali s2 =new studentDetali();
    	  s2.name="pal";
    	  s2.age=25;
    	  s2.display();
	}
}
