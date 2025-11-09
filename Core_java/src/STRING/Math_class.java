package STRING;

import java.util.Date;
import java.util.Random;

public class Math_class {
	public static void main(String[] args) {
		
		
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(64));
		System.out.println(Math.floor(5.6));
		System.out.println(Math.ceil(5.6));
		System.out.println(Math.round(5.7));
		System.out.println(Math.pow(5, 5));
		System.out.println(Math.tan(0));
		
		System.out.println("****************");
		
		Date date =new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getYear());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getDay());
		System.out.println(date.getTime());
		System.out.println(date.getMonth());
		System.out.println(date.getTimezoneOffset());
		
		System.out.println("****************");
		
		Date d1=new Date(17600915384511l);
		System.out.println(d1);
		
		System.out.println("*********************");
		
		Random r=new Random();
		int num=r.nextInt(1000,9999);
		System.out.println(num);
	}

}
