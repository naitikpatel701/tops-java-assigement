package Fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization1 {
	public static void main(String[] args) {
		
		Product p=new Product();
		
		FileOutputStream fos=null;
		ObjectOutputStream os=null;
		
		try {
			fos=new FileOutputStream("D:\\File\\seles.ser");
			os=new ObjectOutputStream(fos);
			
			os.writeObject(p);
			System.out.println("done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
