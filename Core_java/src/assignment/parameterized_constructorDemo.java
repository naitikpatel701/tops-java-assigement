package assignment;

class student{
	
	int id;
	String name;
	int age;
	String email;
	public student(int id, String name, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
     public void show() {
		
    	 System.out.println("id :"+id);
    	 System.out.println("name :"+name);
    	 System.out.println("age :"+age);
    	 System.out.println("email :"+email);
	}
}

public class parameterized_constructorDemo {
	public static void main(String[] args) {
		
		student s=new student(10, "naitik", 22, "naitik@gmail.com");
		student s1=new student(15, "neel", 21, "neel@gmail.com");
		
		s.show();
		s1.show();
	}

}
