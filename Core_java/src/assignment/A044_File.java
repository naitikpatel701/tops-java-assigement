package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A044_File {
	public static void main(String[] args) {
		
		String SourceFile   = "D:\\full stack developer corurce\\28 AUG-java\\file\\Hello.txt";
		String destinationFile= "D:\\full stack developer corurce\\28 AUG-java\\file\\Test.txt";
		
		 try {
	            FileInputStream in = new FileInputStream(SourceFile);
	            FileOutputStream out = new FileOutputStream(destinationFile);

	            int data;
	            while ((data = in.read()) != -1) {
	                out.write(data);
	            }

	            in.close();
	            out.close();

	            System.out.println("File copied successfully");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
