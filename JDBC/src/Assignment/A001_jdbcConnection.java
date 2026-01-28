package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A001_jdbcConnection {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_assignment","root","root");
			System.out.println("Connection establied");
			
			System.out.println("hello java");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
