package Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Demo{
	
	public void test() throws FileNotFoundException {
		
		try {
			FileOutputStream fos=new FileOutputStream("D://test.txt");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		FileOutputStream fos=new FileOutputStream("D://test.txt");
	}
}

public class CompileTime {
	public static void main(String[] args) {
		
		Demo d=new Demo();
		try {
			d.test();
			System.out.println("hello naitik");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
