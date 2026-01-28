package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class A006_CRUD_Opartions {
    public static void main(String[] args) {

    	Connection cn=null;
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_assignment","root","root");
	  } catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
      
      Scanner sc=new Scanner(System.in);
      
      int choice;

      do {
          System.out.println("\n===== MENU =====");
          System.out.println("1. Insert Record");
          System.out.println("2. View All Records");
          System.out.println("3. Update Record");
          System.out.println("4. Delete Record");
          System.out.println("5. Exit");
          System.out.print("Enter your choice: ");
          choice = sc.nextInt();
      
      //INSERT
         switch(choice) {
       
         case 1:
        	 //INSERT
        	  try {
            	  
            	  System.out.println("enter name");
                  String name=sc.next();
                  System.out.println("enter email");
                  String email=sc.next();
                  
        		PreparedStatement ps=cn.prepareStatement("insert into student values(?,?,?)");
        		ps.setInt(1, 0);
        		ps.setString(2, name);
        		ps.setString(3, email);
        		
        		int i=ps.executeUpdate();
        		if(i>0) {
        			System.out.println("Student Inserted");
        		}
        		
        	} catch (SQLException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	}
        	  break;
         case 2:
        	 
        	  //SELECT
             try {
       		PreparedStatement ps=cn.prepareStatement("select * from student");
       		
       		ResultSet rs=ps.executeQuery();
       		while(rs.next()) {
       			
       			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
       		}
       	} catch (SQLException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();	
       	}
            break; 
            
         case 3:
        	 
        	 System.out.println("enter id");
        	 int id=sc.nextInt();
        	 sc.nextLine();
        	 System.out.println("enter uname");
             String uname=sc.nextLine();
             System.out.println("enter uemail");
             String uemail=sc.nextLine();
        	 //UPDATE
        	 try {
				PreparedStatement ps=cn.prepareStatement("update student set name=?,email=? where id=?");
				ps.setString(1, uname);
				ps.setString(2, uemail);
				ps.setInt(3, id);
				
				int i=ps.executeUpdate();
				if(i>0) {
					
					System.out.println("Student Updated");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
        	 break;
        	 
         case 4:
        	 
        	 
        	 System.out.println("enter id");
        	 int did=sc.nextInt(); 
        	 
        	 try {
				PreparedStatement ps=cn.prepareStatement("delete from student where id=?");
				ps.setInt(1, did);
				
				int i=ps.executeUpdate();
				if(i>0) {
					
					System.out.println("Student Delete");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 break;
        	 
         case 5:
        	
        	 System.out.println("Thank you");
        	 break;
        	 
        	 default :
        		 
        		 System.out.println("Invalid choice");
         }
           
      }while(choice != 5);
    }
}
