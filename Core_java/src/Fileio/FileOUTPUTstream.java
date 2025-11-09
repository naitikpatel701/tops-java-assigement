package Fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOUTPUTstream {
     public static void main(String[] args) {
		
    	 FileOutputStream fos=null;
    	 
    	 try {
			fos =new FileOutputStream("D:\\File\\hello.txt");
			
			String str="this is my second io practical";
			byte b[]=str.getBytes();
			fos.write(b);
			System.out.println("Done");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 finally {
    		 
    		 try {
    				fos.close();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    	 }
    	
	}
}
