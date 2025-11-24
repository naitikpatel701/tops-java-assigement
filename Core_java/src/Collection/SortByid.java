package Collection;

import java.util.Comparator;

public class SortByid implements Comparator<User>{


	@Override
	public int compare(User o1, User o2) {
		
		int Currentid=o2.id;
		int newid=o1.id;
		int i=0;
		
		if(Currentid<newid) {
			
			i=1;
		}
		else if(Currentid>newid){
			
			i=-1;
		}
		else {
			i=0;
		}
		return 0;
	}
	

}
