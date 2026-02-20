package Assignment;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A010_MetaDataMethod {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_assignment","root","root");
			
			DatabaseMetaData dm=cn.getMetaData();
			
			System.out.println(dm.getDatabaseProductName());
			System.out.println(dm.getDatabaseProductVersion());
			System.out.println(dm.getDriverName());
			System.out.println(dm.getDriverVersion());
			
			System.out.println("*****Database Table Name*****");
//			System.out.println(dm.getTableTypes());
			
			ResultSet rs=dm.getTables("java_assignment", null, "%", new String[] {"table"} );
			while(rs.next()) {
				
				String table=rs.getString("table_name");
				System.out.println(table);
				
			}
			
			System.out.println("*****Support Method*****");
			System.out.println(dm.supportsBatchUpdates());
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
