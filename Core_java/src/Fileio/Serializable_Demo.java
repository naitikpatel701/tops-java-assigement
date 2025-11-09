package Fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable_Demo {
	public static void main(String[] args) {
		
		Student s=new Student();
		
		FileOutputStream fos=null;
		ObjectOutputStream os=null;
		
		try {
			fos=new FileOutputStream("D:\\File\\demo.ser");
			os=new  ObjectOutputStream(fos);
			
			os.writeObject(s);
			
			System.out.println("done");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
