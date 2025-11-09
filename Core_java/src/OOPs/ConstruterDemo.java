package OOPs;

class Student3{
	
	int id;
	String name;
	
	Student3(int id, String name){
		
		this.id =id;
		this.name =name;
	}
	
	public void display() {
		
		System.out.println(id+" "+name);
		
	}
}


public class ConstruterDemo {
	
public static void main(String[] args) {
		
		Student3 st=new Student3(1,"naitik");
		st.display();
		
		Student3 st1=new Student3(2,"patel");
		st1.display();
	}

}
