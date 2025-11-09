package Fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_outputStrem {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos=
					  new FileOutputStream("D:\\File\\test.txt");
			
			String s="this is my first io practical";
			byte b[]=s.getBytes();
			fos.write(b);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
