package OOPs;

class studentDetali{
	
	String name="naitik";
	int age=21;
	
	public void display() {
		System.out.println(name+" "+age);
	}
}

public class Student2 {
      public static void main(String[] args) {
		
    	  studentDetali s1=new studentDetali();
    	  s1.display();
	}
}
