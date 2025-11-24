package Imp_Classes;

public class StringBuffer_Bulider {
	public static void main(String[] args) {
		
	
	//sync - slow
	
	double startTime = System.currentTimeMillis();
	StringBuffer sb= new StringBuffer("hello");
	for(int i=1;i<=1000000;i++){
		sb.append("python");
	}
	double endTime =System.currentTimeMillis();
	
	//sync - fast
	
	double startTime1 = System.currentTimeMillis();
	StringBuilder sb1= new StringBuilder("hello");
	for(int i=1;i<=1000000;i++){
		sb.append("python");
	}
	double endTime1 =System.currentTimeMillis();
	
	System.out.println("TIme Taken by buffer :"+(endTime-startTime));
	System.out.println("TIme Taken by builder :"+(endTime1-startTime1));

}
}