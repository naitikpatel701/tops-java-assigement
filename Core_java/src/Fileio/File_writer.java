package Fileio;

import java.io.FileWriter;
import java.io.IOException;

public class File_writer {
	public static void main(String[] args) {
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("D:\\File\\home.txt");
			
			String str="hello java,hello tops";
			fw.write(str);
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
