package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudent {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id :");
		int id=sc.nextInt();
		System.out.println("enter name :");
		String name=sc.next();
		System.out.println("enter email :");
		String email=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connect");
			
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/28aug_2025_java", "root", "root");
		System.out.println("connection esteblished");
		
			Statement st=cn.createStatement();
			
			int i=st.executeUpdate("update student set name='"+name+"',email='"+email+"'where id="+id);
			
			if(i>0) {
				System.out.println("student update");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
