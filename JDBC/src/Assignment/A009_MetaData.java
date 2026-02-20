package Assignment;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A009_MetaData {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_assignment","root","root");
			
			DatabaseMetaData dm=cn.getMetaData();
			System.out.println(dm.getCatalogSeparator());
			System.out.println(dm.getCatalogTerm());
			System.out.println(dm.getDatabaseMajorVersion());
			System.out.println(dm.getDatabaseMinorVersion());
			System.out.println(dm.getDatabaseProductName());
			System.out.println(dm.getDatabaseProductVersion());
			System.out.println(dm.getDefaultTransactionIsolation());
			System.out.println(dm.getDriverMajorVersion());
			System.out.println(dm.getDriverMinorVersion());
			System.out.println(dm.getDriverName());
			System.out.println(dm.getDriverVersion());
			System.out.println(dm.getJDBCMajorVersion());
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
