package OOPs;

class P{
	
	P(){
		System.out.println("runing P class const...");
	}
}

class Q extends P{
	
	Q(){
		
		super();
		System.out.println("runing Q class const");
	}
	
	Q(int i){
		
		this();
		System.out.println(i);
	}
}
class V extends Q{
	V(){
		super(45);
		System.out.println("runing V class const");
	}
}

public class concstutor_chaningg {
     public static void main(String[] args) {
		
    	V v=new V();
	}
}
