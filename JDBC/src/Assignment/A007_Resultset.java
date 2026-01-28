package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A007_Resultset {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_assignment","root","root");
			
			PreparedStatement ps=cn.prepareStatement("select * from reg");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
