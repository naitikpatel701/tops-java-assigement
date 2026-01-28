package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A004_Statement {
    public static void main(String[] args) {

        try {
            //  Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_assignment","root","root");

            Statement st = cn.createStatement();

            // 🔹 INSERT
            st.executeUpdate("INSERT INTO reg(name, email) VALUES('Naitik','naitik@gmail.com')");
            System.out.println("Record inserted!");

            //  SELECT
//            ResultSet rs = st.executeQuery("SELECT * FROM reg");
//            System.out.println("\n All Records:");
//            while (rs.next()) {
//            	
//                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("email") );
//                                  
//            }

//            //  UPDATE
//            st.executeUpdate("UPDATE reg SET email='naitik701@gmail.com' WHERE name='Naitik'");
//            System.out.println("\n Record updated!");

//            //  DELETE
//            st.executeUpdate("DELETE FROM reg WHERE name='Naitik'");
//            System.out.println("Record deleted!");

          

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
