package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A042_CopyFile {
	public static void main(String[] args)  {
		
		String SourcePath   = "D:\\full stack developer corurce\\28 AUG-java\\file\\Hello.txt";
		String destPath   = "D:\\full stack developer corurce\\28 AUG-java\\file\\Home.txt";
		
		  
		   try {
			   FileOutputStream  out = new FileOutputStream(SourcePath);
			
			String s="this is my first io practical";
			byte b[]=s.getBytes();
			out.write(b);
			out.close();
		     

		        System.out.println("Done");
		        
		        FileInputStream in = new FileInputStream(SourcePath);
				FileOutputStream out2 = new FileOutputStream(destPath);
					  int ch;
				        while ((ch = in.read()) != -1)
				            out2.write(ch);
				        
				        in.close();
				        out2.close();
				        
				        System.out.println("File copied successfully");
		
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	      
	}
}