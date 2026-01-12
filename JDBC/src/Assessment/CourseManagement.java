package Assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CourseManagement {

           Connection cn=null;
           Scanner sc = new Scanner(System.in);

    // ================= DATABASE CONNECTION =================
    public CourseManagement() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/28aug_2025_java", "root" ,"root" );                 
              
            System.out.println(" Database Connected Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= ADD COURSE =================
    public void addCourse() {
       
    	System.out.print("Course Name: ");
        String name = sc.nextLine();

        System.out.print("Course Fees: ");
        double fees = sc.nextDouble();
        sc.nextLine();

        System.out.print("Course Duration: ");
        String duration = sc.nextLine();

        System.out.print("Course Detail: ");
        String detail = sc.nextLine();
        
    	try {

            PreparedStatement ps = cn.prepareStatement( "INSERT INTO course(name, fees, duration, detail) VALUES (?,?,?,?)");            
            ps.setString(1, name);
            ps.setDouble(2, fees);
            ps.setString(3, duration);
            ps.setString(4, detail);

            ps.executeUpdate();
            System.out.println(" Course Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= VIEW COURSE =================
    public void viewCourse() {
        try {
           
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM course");
          
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Course List ---");
            while (rs.next()) {
                System.out.println("-------------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Fees: " + rs.getDouble("fees"));
                System.out.println("Duration: " + rs.getString("duration"));
                System.out.println("Detail: " + rs.getString("detail"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= SEARCH COURSE =================
    public void searchCourse() {
        
    	 System.out.print("Enter Course ID: ");
         int id = sc.nextInt();
         sc.nextLine();
         
    	try {
            
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM course WHERE id=?");           
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Course Found:");
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Fees: " + rs.getDouble("fees"));
                System.out.println("Duration: " + rs.getString("duration"));
                System.out.println("Detail: " + rs.getString("detail"));
            } else {
                System.out.println(" Course Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= UPDATE COURSE =================
    public void editCourse() {
       
    	 System.out.print("Enter Course ID to Update: ");
         int id = sc.nextInt();
         sc.nextLine();

         System.out.print("New Name: ");
         String name = sc.nextLine();

         System.out.print("New Fees: ");
         double fees = sc.nextDouble();
         sc.nextLine();

         System.out.print("New Duration: ");
         String duration = sc.nextLine();

         System.out.print("New Detail: ");
         String detail = sc.nextLine();
         
    	try {
           
            PreparedStatement ps = cn.prepareStatement( "UPDATE course SET name=?, fees=?, duration=?, detail=? WHERE id=?");           
            ps.setString(1, name);
            ps.setDouble(2, fees);
            ps.setString(3, duration);
            ps.setString(4, detail);
            ps.setInt(5, id);

            int i = ps.executeUpdate();
            if (i > 0)
                System.out.println(" Course Updated");
            else
                System.out.println(" Invalid Course ID");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= DELETE COURSE =================
    public void deleteCourse() {
      
    	System.out.print("Enter Course ID to Delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        
    	try {
         
            PreparedStatement ps = cn.prepareStatement( "DELETE FROM course WHERE id=?");
            ps.setInt(1, id);

            int i = ps.executeUpdate();
            if (i > 0)
                System.out.println(" Course Deleted");
            else
                System.out.println(" Invalid Course ID");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
