package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class User_collection {
	public static void main(String[] args) {
		
		ArrayList<User> al=new ArrayList<User>();
		al.add(new User(10, "naitik", "naitik@gmail.com"));
		al.add(new User(12, "patel", "patel@gamil.com"));
		al.add(new User(15, "gopal", "gopal@gmail.com"));
		
		//Collections.sort(al,new SortByid());
		//Collections.sort(al,new SortByname());
		Collections.sort(al,new SortByemail());
		
		for(User u : al) {
			System.out.println(u);
		}
	}

}
