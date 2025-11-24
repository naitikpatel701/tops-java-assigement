package Collection;

import java.util.Comparator;

public class SortByname implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		
		return -o2.name.compareTo(o1.name);
	}
	
}
