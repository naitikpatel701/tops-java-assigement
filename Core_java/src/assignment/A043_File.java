package assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A043_File {
	public static void main(String[] args) {
		
		String SourceFile   = "D:\\full stack developer corurce\\28 AUG-java\\file\\Hello.txt";
		String destinationFile= "D:\\full stack developer corurce\\28 AUG-java\\file\\Test.txt";
		
		 try {
	            FileReader fr = new FileReader(SourceFile);
	            FileWriter fw = new FileWriter(destinationFile);

	            int data;
	            while ((data = fr.read()) != -1) {
	                fw.write(data);
	            }

	            fr.close();
	            fw.close();

	            System.out.println("File copied successfully");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
