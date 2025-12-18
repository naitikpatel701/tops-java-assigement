package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddStudent {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connect");
			
			Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/28aug_2025_java","root","root");
			System.out.println("connection esteblished");
			
			
			Statement st= cn.createStatement();
			
			int i=st.executeUpdate("insert into student values(0,'pal','pal@gmail.com')");
			if(i>0) {
				System.out.println("data instert");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
