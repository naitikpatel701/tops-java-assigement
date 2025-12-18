package assignment;

class Person{
	
	String name;
	int age;
	double salary;
	
	//constructor 1=String parameter
	public Person(String name) {
		super();
		this.name = name;
	}
	//constructor 2=int parameter
	public Person(int age) {
		super();
		this.age = age;
	}
	//constructor 3=double parameter
	public Person(double salary) {
		super();
		this.salary = salary;
	}
	//constructor 4=all parameter
	public Person(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public void show() {
		
      System.out.println("name : " +name+ " age : " +age+ " salary : " +salary);
	}
	
}

public class A018_Constructor_Overloading1 {
	public static void main(String[] args) {
		
		Person p=new Person("naitik");
		Person p1=new Person(22);
		Person p2=new Person(25000);
		Person p3=new Person("pal", 21, 20000);
		
	    p.show();
	    p1.show();
	    p2.show();
	    p3.show();
	}

}
