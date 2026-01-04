package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Fileio.Student;

public class A037_SerializationDemo {
	public static void main(String[] args) {
		
     Student s=new Student();
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		ObjectOutputStream os=null;
		ObjectInputStream os1=null;
		
		try {
			fos=new FileOutputStream("D:\\full stack developer corurce\\28 AUG-java\\file\\Demo.ser");
			os=new  ObjectOutputStream(fos);
			
			os.writeObject(s);
			
			System.out.println("done");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fis =new FileInputStream("D:\\full stack developer corurce\\28 AUG-java\\file\\Demo.ser");
			os1=new ObjectInputStream(fis);
			
			Student s1=(Student) os1.readObject();
			s.display();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
