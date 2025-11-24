package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Student_Collection {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student(10, "om", "om@gmail.com"));
		al.add(new Student(15, "gopal", "gopal@gmail.com"));
		al.add(new Student(20, "drashen", "drashen@gmail.com"));
		
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext()) {
			
			//Student st=itr.next();
			//st.display();
			//System.out.println(st);
			
			System.out.println(itr.next());
		}
	}

}
