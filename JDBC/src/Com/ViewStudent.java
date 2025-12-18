package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ViewStudent {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connect");
			
			String url="jdbc:mysql://localhost:3306/28aug_2025_java";
			
			String username="root";
			String password="root";
			
			Connection cn= DriverManager.getConnection(url, username, password);
			System.out.println("connection esteblished");
			
			Statement st=cn.createStatement();
			
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString("email");
				System.out.println(id+" "+name+" "+email );
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
