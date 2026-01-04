package assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A036_FileReadWriter {
	public static void main(String[] args) {
		
		FileWriter fw=null;
		FileReader fr=null;
		
		try {
			 fw=new FileWriter("D:\\full stack developer corurce\\28 AUG-java\\file\\Demo.txt");
			
			String str="hello java,hello tops";
			fw.write(str);
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 fr=new FileReader("D:\\full stack developer corurce\\28 AUG-java\\file\\Demo.txt");
			int i=fr.read();
			
			while(i!= -1) {
				char ch=(char) i;
				System.out.print(ch);
				 i=fr.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
