package Collection;

import java.util.Comparator;

public class SortByemail implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		
		return -o2.email.compareTo(o1.email);
	}

}
