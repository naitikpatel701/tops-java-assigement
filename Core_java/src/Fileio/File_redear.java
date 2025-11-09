package Fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_redear {
	public static void main(String[] args) {
		
		FileReader fr=null;
		
		try {
			fr=new FileReader("D:\\File\\home.txt");
			int i=fr.read();
			
			while(i!=-1) {
				char ch=(char) i;
				System.out.print(ch);
				i=fr.read();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
