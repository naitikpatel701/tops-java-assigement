package Fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desrialization1 {
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		ObjectInputStream os=null;
		
		try {
			fis=new FileInputStream("D:\\File\\seles.ser");
			os=new ObjectInputStream(fis);
			
			Product p=(Product) os.readObject();
			p.dispaly();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
