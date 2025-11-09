package OOPs;

class student{
	
	int sid=101;
	String name="naitik";
	String emaill="naitikp701@gmail.com";
	String collageName ="tops";
	
	public void display() {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(emaill);
		System.out.println(collageName);
	}
}

public class Student_Detali {
	
public static void main(String[] args) {
		
		student s1=new student();
		s1.sid=45;
		s1.name="naitik patel";
		s1.emaill="naitikpatel@gmail.com";
		s1.collageName="tops tech";
		s1.display();
		
		student s2=new student();
		s2.display();
	}

}
