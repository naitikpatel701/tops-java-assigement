package Basic;

public class Varible {
	public static void main(String[] args) {
		
		byte b=-127;
		short s=32767;
		int i=4545;
		long l=564564566545654l;
		
		float f=45.545f;
		double d=44545.65656;
		
		char ch='a';
		
		boolean bool=true;
		String st="hi";
		
		System.out.println(s);
		
		//widining-implicit
		int a=10;
		long c=a;
		System.out.println(c);
		
		//nerrowing - explicite
		long x=45;
		int y=(int) x;
		System.out.println(y);

	}

}
