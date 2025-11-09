package Fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class User_FileOutputStream {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.nextLine();
		
		System.out.println("enter email");
		String email=sc.nextLine();
		
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream("D:\\File\\"+name+".txt");
			
			byte b[]=email.getBytes();
			fos.write(b);
			System.out.println("done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
