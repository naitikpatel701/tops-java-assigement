package Fileio;

import java.io.File;
import java.io.IOException;

public class File_Demo {
	public static void main(String[] args) {
		
		File f=new File("D:\\File\\name.txt");
		
		//System.out.println(f.exists());
		
		//try {
			//f.createNewFile();
	//	} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		//f.delete();
		
		//System.out.println(f.isFile());
		//System.out.println(f.isDirectory());
		f.mkdir();
	}

}
