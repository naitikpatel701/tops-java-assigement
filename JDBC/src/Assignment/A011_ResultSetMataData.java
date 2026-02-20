package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class A011_ResultSetMataData {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_assignment","root","root");
			
			Statement st=cn.createStatement();
			
			ResultSet rs=st.executeQuery("select * from reg");
			
			ResultSetMetaData dm=rs.getMetaData();
			
			int Count=dm.getColumnCount();
			System.out.println("Column :"+Count);
			System.out.println("==================");
			
			for(int i=1; i<=Count; i++) {
				
				System.out.println("Column Index :"+i);
				System.out.println( "Column Name :"+dm.getColumnName(i));
				System.out.println("Column Type :"+dm.getColumnTypeName(i));
				System.out.println("Column Class :"+dm.getColumnClassName(i));
				System.out.println("******************");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
